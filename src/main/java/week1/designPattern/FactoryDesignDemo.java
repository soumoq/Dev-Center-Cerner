package week1.designPattern;

public class FactoryDesignDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("S");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("R");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("C");
        shape3.draw();

//        week1.designPattern.Shape shape = () -> System.out.println("Drawing");
//        shape.draw();

    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        Shape shape = null;
        if (type.equals("R")) {
            shape = new Rectangle();
        } else if (type.equals("S")) {
            shape = new Square();
        } else if (type.equals("C")) {
            shape = new Circle();
        }
        return shape;
    }
}

interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw week1.designPattern.Rectangle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw week1.designPattern.Square");
    }
}


class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw week1.designPattern.Circle");
    }
}
