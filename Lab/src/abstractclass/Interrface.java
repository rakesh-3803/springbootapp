package abstractclass;



//Interface
interface Movable {
 void move();  // abstract method (implicitly public and abstract)
}

//Abstract class
abstract class Animal {
 abstract void sound();  // abstract method

 void sleep() {
     System.out.println("Animal is sleeping.");  // concrete method
 }
}

//Concrete class implementing interface and extending abstract class
class Dog extends Animal implements Movable {

 @Override
 void sound() {
     System.out.println("Dog barks.");
 }

 @Override
 public void move() {
     System.out.println("Dog runs.");
 }
}

public class Interrface {
 public static void main(String[] args) {
     Dog dog = new Dog();

     dog.sound();  // From abstract class
     dog.sleep();  // From abstract class (concrete method)
     dog.move();   // From interface
 }
}

