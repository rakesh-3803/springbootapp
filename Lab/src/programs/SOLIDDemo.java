package programs;

//1. Single Responsibility Principle
interface Shape {
 double calculateArea();
}

class Circle implements Shape {
 private double radius;

 public Circle(double radius) {
     this.radius = radius;
 }

 @Override
 public double calculateArea() {
     return Math.PI * radius * radius;
 }
}

class Rectangle implements Shape {
 private double width;
 private double height;

 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 @Override
 public double calculateArea() {
     return width * height;
 }
}

//2. Open-Closed Principle
//3. Liskov Substitution Principle
class AreaCalculator {
 public double calculateTotalArea(Shape[] shapes) {
     double totalArea = 0;
     for (Shape shape : shapes) {
         totalArea += shape.calculateArea();
     }
     return totalArea;
 }
}

//4. Interface Segregation Principle
interface Printable {
 String getDescription();
}

class PrintableRectangle extends Rectangle implements Printable {
 public PrintableRectangle(double width, double height) {
     super(width, height);
 }

 @Override
 public String getDescription() {
     return "Rectangle with area: " + calculateArea();
 }
}

//5. Dependency Inversion Principle
class ShapePrinter {
 private Printable printableShape;

 public ShapePrinter(Printable printableShape) {
     this.printableShape = printableShape;
 }

 public void printShape() {
     System.out.println(printableShape.getDescription());
 }
}

public class SOLIDDemo {
 public static void main(String[] args) {
     Shape[] shapes = {
         new Circle(5),
         new Rectangle(4, 6),
         new PrintableRectangle(3, 5)
     };

     AreaCalculator calculator = new AreaCalculator();
     double totalArea = calculator.calculateTotalArea(shapes);
     System.out.println("Total area: " + totalArea);

     ShapePrinter printer = new ShapePrinter(new PrintableRectangle(3, 5));
     printer.printShape();
 }
}
