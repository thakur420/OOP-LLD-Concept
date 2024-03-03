package PrototypeAndRegistry;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(){

    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle target){
        super(target);
        if(target != null){
            this.height = target.height;
            this.width = target.width;
        }
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Rectangle) || !super.equals(object2))
            return false;
        Rectangle rectangle = (Rectangle) object2;
        return this.width == rectangle.width && this.height == rectangle.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
