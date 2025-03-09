package FlowerShopManagement;

public class Flower {

    private String name;
    private String origin;
    private int quantity;
    private boolean soldOut;

    public Flower(String name, String origin) {
        this.name = name;
        this.origin = origin;
        this.quantity = quantity;
        this.soldOut = soldOut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean soldOut() {
        return soldOut;
    }

    public void setUnitPrice(boolean soldOut) {
        this.soldOut = soldOut;
    }
}
