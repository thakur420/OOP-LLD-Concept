package FactoryPattern;

import FactoryPattern.Pizza.Pizza;
import FactoryPattern.PizzaStore.ChicagoPizzaStore;
import FactoryPattern.PizzaStore.NYPizzaStore;
import FactoryPattern.PizzaStore.PizzaStore;
import FactoryPattern.PizzaStore.PizzaType;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ram ordered a " + pizza.getName());

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        pizza = chicagoPizzaStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Shyam ordered a " + pizza.getName());
    }
}
