package pizzabuilder;

public class PizzaDirector {

    public pizza makePepperoni(PizzaBuilder builder) {
        return builder
                .setDough("Thin Crust")
                .setSauce("Tomato Sauce")
                .setCheese("Mozzarella")
                .addTopping("Pepperoni")
                .addTopping("Oregano")
                .setSize("Large")
                .build();
    }

    public pizza makeVeggie(PizzaBuilder builder) {
        return builder
                .setDough("Whole Wheat")
                .setSauce("Garlic Sauce")
                .setCheese("Vegan Cheese")
                .addTopping("Bell Peppers")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .setSize("Medium")
                .build();
    }
}