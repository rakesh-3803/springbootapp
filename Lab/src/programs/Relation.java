package programs;

//Association: Person uses a Car (no ownership, just a connection)
class Car {
 void drive() {
     System.out.println("Car is being driven.");
 }
}

class Person {
 void driveCar(Car car) { // Association: Person uses Car
     car.drive();
 }
}

//Aggregation: Department has Teachers (Teachers can exist independently)
class Teacher {
 String name;
 Teacher(String name) {
     this.name = name;
 }
 void display() {
     System.out.println("Teacher: " + name);
 }
}

class Department {
 Teacher teacher; // Aggregation

 Department(Teacher teacher) {
     this.teacher = teacher;
 }

 void showTeacher() {
     teacher.display();
 }
}

//Composition: Library has Books (Books cannot exist without Library)
class Book {
 String title;
 Book(String title) {
     this.title = title;
 }
 void show() {
     System.out.println("Book: " + title);
 }
}

class Library {
 Book book; // Composition

 Library(String title) {
     // Book is created and managed by Library (tight coupling)
     book = new Book(title);
 }

 void showBook() {
     book.show();
 }
}

public class Relation {
 public static void main(String[] args) {

     // ASSOCIATION
     Car car = new Car();
     Person person = new Person();
     person.driveCar(car);  // Person uses Car

     // AGGREGATION
     Teacher teacher = new Teacher("Mr. Smith");
     Department dept = new Department(teacher); // Teacher can exist outside Department
     dept.showTeacher();

     // COMPOSITION
     Library lib = new Library("Java Programming");
     lib.showBook(); // Book tightly bound to Library
 }
}
