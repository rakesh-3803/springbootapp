package abstractclass;

//Interface
interface Vehicle {
 void drive();
}

//Car class
class Car implements Vehicle {
 @Override
 public void drive() {
     System.out.println("Driving a car!");
 }
}

//Bike class
class Bike implements Vehicle {
 @Override
 public void drive() {
     System.out.println("Riding a bike!");
 }
}

//Factory class
class VehicleFactory {
 public Vehicle createVehicle(String type) {
     if (type == null) {
         return null;
     }
     if (type.equalsIgnoreCase("CAR")) {
         return new Car();
     } else if (type.equalsIgnoreCase("BIKE")) {
         return new Bike();
     }
     return null;
 }
}

//Main class with main() method
class Factory {
 public static void main(String[] args) {
     VehicleFactory vehicleFactory = new VehicleFactory();

     // Create a Car
     Vehicle car = vehicleFactory.createVehicle("CAR");
     if (car != null) car.drive();

     // Create a Bike
     Vehicle bike = vehicleFactory.createVehicle("BIKE");
     if (bike != null) bike.drive();
 }
}

