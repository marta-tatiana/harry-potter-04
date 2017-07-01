import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class HarryPotterBookTest {

    private HarryPotterBook harryPotterBook;

    @Before
    public void
    init() {
        harryPotterBook = new HarryPotterBook(2);
    }

    @Test
    public void
    shouldHaveTitle() {
        assertThat(harryPotterBook.getTitle(), equalTo("Harry Potter and the Chamber of Secrets"));
    }

    @Test
    public void
    shouldHaveBookNumber() {
        assertThat(harryPotterBook.getNumber(), equalTo(2));
    }

}