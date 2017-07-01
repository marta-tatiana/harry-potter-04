import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Basket {

    private List<HarryPotterBook> books = new ArrayList<>();
    private List<HarryPotterPromoPack> packs = new ArrayList<>();

    public void add(HarryPotterBook... harryPotterBooks) {
        for (HarryPotterBook book : harryPotterBooks) {
            books.add(book);
        }
    }

    public List<HarryPotterBook> getBooks() {
        return new ArrayList<>(books);
    }

    public Price totalCost() {
        splitBooksIntoPromoPacks();

        return packs.stream()
                .map(pack -> pack.countPrice())
                .reduce(new Price(new BigDecimal(0)), (sum, price) -> sum.add(price));
    }

    private void splitBooksIntoPromoPacks() {
        List<HarryPotterBook> booksToDiscount = new ArrayList<>(books);
        Iterator<HarryPotterBook> it = booksToDiscount.iterator();

        while (it.hasNext()) {
            boolean addedToPack = false;
            HarryPotterBook book = it.next();
            for (HarryPotterPromoPack pack : packs) {
                if (pack.canBeAdded(book)) {
                    pack.add(book);
                    addedToPack = true;
                    break;
                }
            }

            if (!addedToPack) {
                HarryPotterPromoPack newPack = new HarryPotterPromoPack();
                newPack.add(book);
                packs.add(newPack);
            }
        }
    }
}
