package org.example;

public class Vehicle {
    int numberOfWheels;
    String color;
    float engineSize;
    String fuelType;
    public Vehicle(){
        numberOfWheels = 4;
        color = "white";
        engineSize = 3;
        fuelType = "gasoline";
    }
    public Vehicle(int wheels, String color, float engineSize, String fuelType){
        this.numberOfWheels = wheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    public String getColor(){
        return color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
