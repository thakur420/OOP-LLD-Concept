package AbstractFactory.Pizza;

import AbstractFactory.Ingredient.*;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clam;
    abstract public void prepare();
    public void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box(){
        System.out.println("Place pizza in offical PizzaStore box");
    }
    public void  setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
