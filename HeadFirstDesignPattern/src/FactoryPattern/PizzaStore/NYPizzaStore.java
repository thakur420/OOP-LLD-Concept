package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.*;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        return switch (type) {
            case CHEESE -> new NYStyleCheesePizza();
            case PEPPERONI -> new NYStylePepperoniPizza();
            case CLAM -> new NYStyleClamPizza();
            case VEGGIE -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
