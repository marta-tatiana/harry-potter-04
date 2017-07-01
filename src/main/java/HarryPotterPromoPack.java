import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class HarryPotterPromoPack {

    private final static Set<HarryPotterBook> series;
    private Set<HarryPotterBook> included;

    static {
        series = new HashSet<>();
        series.add(new HarryPotterBook(1));
        series.add(new HarryPotterBook(2));
        series.add(new HarryPotterBook(3));
        series.add(new HarryPotterBook(4));
        series.add(new HarryPotterBook(5));
    }

    public HarryPotterPromoPack() {
        included = new HashSet<>();
    }

    public Set<HarryPotterBook> possibleAdditions() {
        HashSet<HarryPotterBook> additions = new HashSet<>(series);
        additions.removeAll(included);
        return additions;
    }

    public void add(HarryPotterBook harryPotterBook) {
        included.add(harryPotterBook);
    }

    public Price countPrice() {
        if (included.size() == 1) return new Price(new BigDecimal(8));
        if (included.size() == 2) return new Price(new BigDecimal(15.20));
        if (included.size() == 3) return new Price(new BigDecimal(21.60));
        if (included.size() == 4) return new Price(new BigDecimal(25.60));
        if (included.size() == 5) return new Price(new BigDecimal(30.00));
        throw new IllegalStateException("Promo pack cannot have size other than 1-5");
    }
}
