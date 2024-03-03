package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.*;

public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(PizzaType type);

}
