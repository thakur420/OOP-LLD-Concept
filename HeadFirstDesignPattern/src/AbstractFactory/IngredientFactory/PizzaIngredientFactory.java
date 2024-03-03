package AbstractFactory.IngredientFactory;

import AbstractFactory.Ingredient.*;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni CreatePepperoni();
    Clams createClam();
}
