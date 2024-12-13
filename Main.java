package Vehicles;

public class Main {
    public static void main(String[] args) {
        // Instantiate a car as a Vehicle
        Vehicle car = new Vehicle("Tiger", 100, 0, 0, 20);

        // Instantiate a helicopter
        Helicopter helicopter = new Helicopter("Lion", 350, 0, 0, 40, 3, 100);

        // Increase speed twice for the car
        car.increaseSpeed();
        car.increaseSpeed();
        output(car);

        // Increase speed twice for the helicopter
        helicopter.increaseSpeed();
        helicopter.increaseSpeed();
        output(helicopter);
    }

    // Output procedure
    public static void output(Vehicle vehicle) {
        System.out.println("ID: " + vehicle.getIdentificationName());
        System.out.println("Current Speed: " + vehicle.getCurrentSpeed());
        System.out.println("Horizontal Position: " + vehicle.getHorizontalPosition());
        if (vehicle instanceof Helicopter) {
            System.out.println("Vertical Position: " + ((Helicopter) vehicle).getVerticalPosition());
        }
    }
}
