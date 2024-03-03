package AbstractFactory.PizzaStore;

import AbstractFactory.IngredientFactory.*;
import AbstractFactory.Pizza.*;


public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type == PizzaType.CHEESE){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        else if(type == PizzaType.VEGGIE){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }
        else if(type == PizzaType.CLAM){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
        else if(type == PizzaType.PEPPERONI){
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
