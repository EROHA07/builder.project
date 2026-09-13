package pizzabuilder;

public class Main {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();

        // 1. Сборка через Director
        pizza pepperoni = director.makePepperoni(new PepperoniPizzaBuilder());
        pizza veggie = director.makeVeggie(new VegetarianPizzaBuilder());

        System.out.println("--- Director Built Pizzas ---");
        System.out.println("Pepperoni: " + pepperoni);
        System.out.println("Veggie: " + veggie);

        // 2. Кастомная сборка через Builder напрямую (Method Chaining)
        pizza customPizza = new PepperoniPizzaBuilder()
                .setDough("Cheese Stuffed Crust")
                .setSauce("BBQ")
                .setCheese("Cheddar")
                .addTopping("Bacon")
                .addTopping("Jalapenos")
                .setSize("Extra Large")
                .build();

        System.out.println("\n--- Custom Built Pizza ---");
        System.out.println("Custom: " + customPizza);
    }
}//TIP To <b>Run</b> code, press <shortcut actionId