import org.junit.Test;

import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class HarryPotterPromoPackTest {
    @Test public void
    shouldBeExtendableWhenCreated() {
        HarryPotterPromoPack pack = new HarryPotterPromoPack();
        Set<HarryPotterBook> additions = pack.possibleAdditions();
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(1)), is(true));
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(2)), is(true));
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(3)), is(true));
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(4)), is(true));
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(5)), is(true));
    }

    @Test public void
    shouldNotBeExtendableWithBooksThatAreAlreadyIn() {
        HarryPotterPromoPack pack = new HarryPotterPromoPack();
        pack.add(new HarryPotterBook(1));
        assertThat(pack.possibleAdditions().contains(new HarryPotterBook(1)), is(false));
    }
}
