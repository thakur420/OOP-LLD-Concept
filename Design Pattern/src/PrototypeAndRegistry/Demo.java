package PrototypeAndRegistry;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle c1 = new Circle(10,20,"red",15);
        shapes.add(c1);
        Circle c2 = (Circle) c1.clone();
        shapes.add(c2);

        Rectangle r1 = new Rectangle("blue",10,20);
        shapes.add(r1);

        cloneAndCompare(shapes,shapesCopy);

    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes){
            shapesCopy.add(shape.clone());
        }

        for(int i = 0 ; i <shapes.size(); i++){
            if(shapes.get(i) != shapesCopy.get(i)){
                System.out.println(i + ": Shapes are different objects (yay!)");
                if(shapes.get(i).equals(shapesCopy.get(i)))
                    System.out.println(i + ": And they are identical (yay!)");
                else
                    System.out.println(i + ": But they are not identical (booo!)");
            }else{
                System.out.println(i + ": Shape objects are the same (booo!)");
            }

        }
    }
}

