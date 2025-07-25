package programs;

//Generic class
class Box<T> {
 private T value;

 public void set(T value) {
     this.value = value;
 }

 public T get() {
     return value;
 }
}

//Class with generic method
class Utils {
 // Generic method to print any type of array
 public static <T> void printArray(T[] array) {
     for (T item : array) {
         System.out.print(item + " ");
     }
     System.out.println();
 }
}

//Main class
class Box1 {
 public static void main(String[] args) {
     // Using generic class with Integer
     Box<Integer> intBox = new Box<>();
     intBox.set(100);
     System.out.println("Integer Value: " + intBox.get());

     // Using generic class with String
     Box<String> strBox = new Box<>();
     strBox.set("Hello Generics");
     System.out.println("String Value: " + strBox.get());

     // Using generic method with arrays
     Integer[] intArray = {1, 2, 3, 4};
     String[] strArray = {"A", "B", "C"};

     System.out.print("Integer Array: ");
     Utils.printArray(intArray);

     System.out.print("String Array: ");
     Utils.printArray(strArray);
 }
}

