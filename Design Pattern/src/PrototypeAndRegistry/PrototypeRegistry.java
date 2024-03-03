package PrototypeAndRegistry;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry {
    private Map<String ,Shape> cache = new HashMap<>();

    public PrototypeRegistry(){
        Circle circle = new Circle(5,7,"Green",45);
        this.register("GreenCircle",circle);

        Rectangle rectangle = new Rectangle("Blue",8,10);
        this.register("BlueRectangle",rectangle);
    }

    public void register(String key, Shape shape) {
        this.cache.put(key,shape);
    }

    public Shape get(String key){
        return this.cache.get(key);
    }
}
