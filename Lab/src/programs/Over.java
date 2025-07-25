package programs;

//Parent class (Superclass)
 class Animal {
 void sound() {
     System.out.println("Animal makes a sound.");
 }
}

//Child class (Subclass) that inherits from Animal
class Dog extends Animal {
 // Method overriding: redefining the sound() method
 
 void sound() {
     System.out.println("Dog barks.");
 }
}

public class Over {
 public static void main(String[] args) {
     Animal a = new Animal(); // Parent object
     a.sound();               // Output: Animal makes a sound.

     Dog d = new Dog();       // Child object
     d.sound();               // Output: Dog barks.

     Animal ref = new Dog();  // Parent reference to child object
     ref.sound();             // Output: Dog barks (runtime polymorphism)
 }
}
