package pizzabuilder;

public class Main {

    public static void main(String[] args) {

        PizzaDirector director = new PizzaDirector();

        Pizza pepperoni = director.makePepperoni(
                new PepperoniPizzaBuilder()
        );

        Pizza veggie = director.makeVeggie(
                new VegetarianPizzaBuilder()
        );

        System.out.println("--- Director Built Pizzas ---");
        System.out.println("Pepperoni: " + pepperoni);
        System.out.println("Veggie: " + veggie);

        Pizza customPizza = new PepperoniPizzaBuilder()
                .setDough("Cheese Stuffed Crust")
                .setSauce("BBQ")
                .setCheese("Cheddar")
                .addTopping("Pepperoni")
                .addTopping("Bacon")
                .addTopping("Jalapenos")
                .setSize("Extra Large")
                .build();

        System.out.println("\n--- Custom Built Pizza ---");
        System.out.println("Custom: " + customPizza);
    }
}