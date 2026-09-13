package pizzabuilder;

public class VegetarianPizzaBuilder extends BasePizzaBuilder {

    @Override
    protected void validateTypeSpecificRules() {
        for (String topping : toppings) {
            if (topping.equalsIgnoreCase("Pepperoni")
                    || topping.equalsIgnoreCase("Bacon")
                    || topping.equalsIgnoreCase("Ham")) {

                throw new IllegalStateException(
                        "Vegetarian pizza cannot contain meat toppings"
                );
            }
        }
    }
}