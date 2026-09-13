# Pizza Builder Pattern

A Java 17 implementation of the Builder creational design pattern for constructing different Pizza configurations step by step.

## Pattern structure

- Product: `Pizza`
- Builder: `PizzaBuilder`
- Abstract Builder: `BasePizzaBuilder`
- Concrete Builders: `PepperoniPizzaBuilder`, `VegetarianPizzaBuilder`
- Director: `PizzaDirector`
- Client: `Main`

## Features

- Fluent API / method chaining
- Reusable pizza recipes through `PizzaDirector`
- Custom pizza construction without `Director`
- Validation of required fields
- Different validation rules for pepperoni and vegetarian pizzas
- Immutable toppings list in the final `Pizza` object

## How to run

1. Open the project in IntelliJ IDEA.
2. Use JDK 17 or newer.
3. Open `src/pizzabuilder/Main.java`.
4. Run the `main` method.

## Example output

```text
--- Director Built Pizzas ---
Pepperoni: Pizza{dough='Thin Crust', sauce='Tomato Sauce', cheese='Mozzarella', toppings=[Pepperoni, Oregano], size='Large'}
Veggie: Pizza{dough='Whole Wheat', sauce='Garlic Sauce', cheese='Vegan Cheese', toppings=[Bell Peppers, Mushrooms, Olives], size='Medium'}

--- Custom Built Pizza ---
Custom: Pizza{dough='Cheese Stuffed Crust', sauce='BBQ', cheese='Cheddar', toppings=[Pepperoni, Bacon, Jalapenos], size='Extra Large'}