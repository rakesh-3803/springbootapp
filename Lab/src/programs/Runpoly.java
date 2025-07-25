package programs;

//Superclass
class Vehicle {
 void drives() {
     System.out.println("Animal makes a sound.");
 }
}

//Subclass 1
class Truck extends Vehicle {
 @Override
 void drives() {
     System.out.println("car driven.");
 }
}

//Subclass 2
class Bike extends Vehicle {
 @Override
 void drives() {
     System.out.println("bike moves.");
 }
}

public class Runpoly {
 public static void main(String[] args) {
     // Superclass reference, subclass object
     Vehicle a;

     a = new Truck();   // Runtime polymorphism
     a.drives();   // Output: Dog barks.

     a = new Bike();   // Runtime polymorphism
     a.drives();   // Output: Cat meows.
 }
}
