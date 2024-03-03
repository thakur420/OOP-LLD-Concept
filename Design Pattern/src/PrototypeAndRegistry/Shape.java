package PrototypeAndRegistry;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {

    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();
    @Override
    public boolean equals(Object object2){
        if((object2 instanceof Shape))
            return false;
        Shape shape = (Shape) object2;
        return this.x == shape.x && this.y == shape.y && this.color.equals(shape.color);
    }

    @Override
    public String toString() {
        return  hashCode() + " " +
                "Shape{" +
                "x=" + x +
                ", y=" + y +
                ", color='" + color + '\'' +
                '}';
    }
}
