class Vehicle {
    public void drive() {
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    public void honk() {
        System.out.println("Car honking");
    }
}

public class CastingExample {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.drive();                  // Output: Driving the vehicle

        Car car = (Car) vehicle;
        car.drive();                      // Output: Driving the vehicle
        car.honk();                       // Output: Car honking
    }
}
In this code, we have a base class Vehicle and a derived class Car. In the main() method, we create an instance of Car and assign it to a variable of type Vehicle. We can then call the inherited drive() method on the Vehicle object.

We can also cast the Vehicle object to Car using (Car) in front of the object reference. After the cast, we can assign it to a variable of type Car (in this case, car). With the car variable, we can call both the inherited drive() method and the honk() method, which is specific to the Car class.
