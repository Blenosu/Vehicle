package Vehicles;

public class Helicopter extends Vehicle {
    private int verticalPosition;
    private int verticalChange;
    private int maxHeight;

    // Constructor
    public Helicopter(String identificationName, int maxSpeed, int currentSpeed, int horizontalPosition, int increaseAmount, int verticalChange, int maxHeight) {
        super(identificationName, maxSpeed, currentSpeed, horizontalPosition, increaseAmount);
        this.verticalPosition = 0; // Start at ground level
        this.verticalChange = verticalChange;
        this.maxHeight = maxHeight;
    }

    @Override
    public void increaseSpeed() {
        super.increaseSpeed(); // Call Vehicle's increaseSpeed to update currentSpeed and position
        if (verticalPosition + verticalChange <= maxHeight) {
            verticalPosition += verticalChange; // Increase vertical position
        } else {
            verticalPosition = maxHeight; // Cap at maxHeight
        }
    }

    public int getVerticalPosition() {
        return verticalPosition;
    }
}
