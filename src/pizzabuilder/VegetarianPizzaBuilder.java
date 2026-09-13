package pizzabuilder;

import java.util.ArrayList;
import java.util.List;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    private String dough;
    private String sauce;
    private String cheese;
    private final List<String> toppings = new ArrayList<>();
    private String size;

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setCheese(String cheese) {
        this.cheese = cheese;
        return this;
    }

    @Override
    public PizzaBuilder addTopping(String topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public pizza build() {
        validate();
        return new pizza(dough, sauce, cheese, toppings, size);
    }

    private void validate() {
        if (dough == null || dough.isBlank()) {
            throw new IllegalStateException("Dough must be specified");
        }
        if (size == null || size.isBlank()) {
            throw new IllegalStateException("Size must be specified");
        }
    }
}