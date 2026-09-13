package pizzabuilder;

import java.util.ArrayList;
import java.util.List;

public abstract class BasePizzaBuilder implements PizzaBuilder {

    protected String dough;
    protected String sauce;
    protected String cheese;
    protected final List<String> toppings = new ArrayList<>();
    protected String size;

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
        if (topping == null || topping.isBlank()) {
            throw new IllegalArgumentException("Topping must not be blank");
        }

        toppings.add(topping);
        return this;
    }

    @Override
    public PizzaBuilder setSize(String size) {
        this.size = size;
        return this;
    }

    @Override
    public Pizza build() {
        validateCommonFields();
        validateTypeSpecificRules();

        return new Pizza(
                dough,
                sauce,
                cheese,
                toppings,
                size
        );
    }

    private void validateCommonFields() {
        if (dough == null || dough.isBlank()) {
            throw new IllegalStateException("Dough must be specified");
        }

        if (size == null || size.isBlank()) {
            throw new IllegalStateException("Size must be specified");
        }
    }

    protected abstract void validateTypeSpecificRules();
}
