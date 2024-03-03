package AbstractFactory.IngredientFactory;

import AbstractFactory.Ingredient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce.PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Spinach(), new Zucchini(), new Broccoli(),new Basil(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni CreatePepperoni() {
        return new SpicyPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
