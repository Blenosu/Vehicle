package Vehicles;

public class Vehicle {
    // Private attributes
    private String identificationName;
    private int maxSpeed;
    private int currentSpeed;
    private int horizontalPosition;
    private int increaseAmount;

    // Constructor
    public Vehicle(String identificationName, int maxSpeed, int currentSpeed, int horizontalPosition, int increaseAmount) {
        this.identificationName = identificationName;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
        this.horizontalPosition = horizontalPosition;
        this.increaseAmount = increaseAmount;
    }

    // Get methods
    public String getIdentificationName() {
        return identificationName;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public int getIncreaseAmount() {
        return increaseAmount;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getHorizontalPosition() {
        return horizontalPosition;
    }

    // Increase speed method
    public void increaseSpeed() {
        if (currentSpeed + increaseAmount <= maxSpeed) {
            currentSpeed += increaseAmount; // Increase current speed
        } else {
            currentSpeed = maxSpeed; // Cap at maxSpeed
        }
        horizontalPosition += currentSpeed; // Update position based on current speed
    }
}
