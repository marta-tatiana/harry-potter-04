import java.math.BigDecimal;

public class HarryPotterBook {

    private String[] titles = {"Harry Potter and the Philosopher's Stone",
    "Harry Potter and the Chamber of Secrets",
    "Harry Potter and the Prisoner of Azkaban",
    "Harry Potter and the Goblet of Fire",
    "Harry Potter and the Order of the Phoenix"};

    private String title;
    private int number;

    HarryPotterBook(int bookNum) {
        this.title = titles[bookNum-1];
        this.number = bookNum;
    }

    public String getTitle() {
        return title;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof HarryPotterBook) && ((HarryPotterBook) o).getNumber() == number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
