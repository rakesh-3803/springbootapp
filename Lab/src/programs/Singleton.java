package programs;

//Singleton.java
class Singleton {
 // The single instance of the class, initially null
 private static Singleton instance;

 // Private constructor to prevent instantiation from outside
 private Singleton() {
     // Initialization code (optional)
     System.out.println("Singleton instance created.");
 }

 // Public method to provide access to the instance (Lazy Initialization)
 public static Singleton getInstance() {
     if (instance == null) {
         instance = new Singleton();
     }
     return instance;
 }

 // Example method to demonstrate functionality
 public void showMessage() {
     System.out.println("Hello from Singleton!");
 }
}

//Main.java
class Main {
 public static void main(String[] args) {
     // Getting the Singleton instance and calling a method on it
     Singleton singleton = Singleton.getInstance();
     singleton.showMessage();

     // Verify that only one instance is created
     Singleton anotherInstance = Singleton.getInstance();
     System.out.println("Are both instances the same? " + (singleton == anotherInstance));
 }
}
