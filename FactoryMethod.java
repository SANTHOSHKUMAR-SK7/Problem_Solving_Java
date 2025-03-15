
// Step 1: Define the Shape interface
interface Shape {
    void draw();
}

// Step 2: Implement Concrete Shape Classes
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Step 3: Create the Factory Class
class ShapeFactory {
    // Factory method to create Shape objects
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}

// Step 4: Client Code to Use the Factory
public class FactoryMethod {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Create Square
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        // Create Rectangle
        Shape shape3 = shapeFactory.getShape("RECTANGLE");
        shape3.draw();
    }
}
