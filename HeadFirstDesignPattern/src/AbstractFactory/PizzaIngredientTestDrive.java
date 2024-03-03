package AbstractFactory;

import AbstractFactory.Pizza.Pizza;
import AbstractFactory.PizzaStore.ChicagoPizzaStore;
import AbstractFactory.PizzaStore.NYPizzaStore;
import AbstractFactory.PizzaStore.PizzaStore;
import AbstractFactory.PizzaStore.PizzaType;

public class PizzaIngredientTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ram ordered a " + pizza.getName());

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza(PizzaType.CLAM);
        System.out.println("Shyam ordered a " + pizza.getName());
    }
}
