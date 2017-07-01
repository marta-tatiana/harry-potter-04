import org.junit.Test;

import java.math.BigDecimal;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class PriceTest {

    @Test public void
    shouldEqualPriceOfTheSameValue() {
        assertThat(new Price(new BigDecimal(2)), equalTo(new Price(new BigDecimal(2))));
    }

    @Test public void
    shouldEqualPriceOfTheSameValueButDifferentlyFormatted() {
        assertThat(new Price(new BigDecimal(2)), equalTo(new Price(new BigDecimal(2.000))));
    }
}
