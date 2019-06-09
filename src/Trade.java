import java.util.Objects;

public class Trade {

    private String id;

    private int quantity;

    private double marketValue;

    public Trade(String id, int quantity, double marketValue) {
        this.id = id;
        this.quantity = quantity;
        this.marketValue = marketValue;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trade trade = (Trade) o;
        return quantity == trade.quantity &&
               Double.compare(trade.marketValue,
                              marketValue) == 0 &&
               id.equals(trade.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
                            quantity,
                            marketValue);
    }

    @Override
    public String toString() {
        return "Trade{" +
               "id='" + id + '\'' +
               ", quantity=" + quantity +
               ", marketValue=" + marketValue +
               '}';
    }
}
