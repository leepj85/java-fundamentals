package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant extends Business {

    String price;

    //Constructor
    public Restaurant(String name, String price) {
        super(name, 0);
        this.price = price;
    }

    public String toString() {
        return String.format(super.toString() + " PRICE: %s", this.price);
    }
}
