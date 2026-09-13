package pizzabuilder;

import java.util.List;

public class pizza {
    private final String dough;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;
    private final String size;

    public pizza(String dough, String sauce, String cheese, List<String> toppings, String size) {
        this.dough = dough;
        this.sauce = sauce;
        this.cheese = cheese;
        this.toppings = toppings;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza {" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", toppings=" + toppings +
                ", size='" + size + '\'' +
                '}';
    }
}
