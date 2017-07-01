import java.math.BigDecimal;


public class Price {
    private final BigDecimal price;

    public BigDecimal getPrice() {
        return price;
    }

    public Price(BigDecimal price) {
        this.price = price.setScale(2, BigDecimal.ROUND_HALF_UP);
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Price)
                && ((Price) o).getPrice()
                .equals(price);
    }

    @Override
    public String toString() {
        return price.toString();
    }

    public Price add(Price second) {
        return new Price(this.price.add(second.getPrice()));
    }

}
