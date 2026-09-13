package pizzabuilder;

public class PepperoniPizzaBuilder extends BasePizzaBuilder {

    @Override
    protected void validateTypeSpecificRules() {
        if (!toppings.contains("Pepperoni")) {
            throw new IllegalStateException(
                    "Pepperoni pizza must contain Pepperoni"
            );
        }
    }
}
