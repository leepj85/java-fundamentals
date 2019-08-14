package inheritance;

public class Shop extends Business {

    String price;
    String description;

    public Shop(String name, String price, String description) {
        super(name, 0);
        this.price = price;
        this.description = description;
    }

    public String toString() {
        return String.format(super.toString() + " PRICE: %s DESCRIPTION: %s", this.price, this.description);
    }
}
