package FactoryPattern.PizzaStore;

import FactoryPattern.Pizza.*;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(PizzaType type) {
        return switch (type){
            case CHEESE -> new ChicagoStyleCheesePizza();
            case PEPPERONI -> new ChicagoStylePepperoniPizza();
            case CLAM -> new ChicagoStyleClamPizza();
            case VEGGIE -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
