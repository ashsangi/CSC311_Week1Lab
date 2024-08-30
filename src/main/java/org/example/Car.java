package org.example;

public class Car extends Vehicle{
    String brand;
    public Car(){
        numberOfWheels = 4;
        color = "white";
        engineSize = 3;
        fuelType = "gasoline";
        brand = "Honda";
    }
    public Car(int wheels, String color, float engineSize, String fueltype, String brand){
        this.numberOfWheels = wheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fueltype;
        this.brand = brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void honk(){
        System.out.println("Honk, honk!");
    }
    public void displayInfo(){
        System.out.println("Wheels: " + getNumberOfWheels() + ", Color: " + getColor() + ", Engine Size: " + getEngineSize() + ", Fuel Type: " + getFuelType() + ", Brand: " + getBrand());
    }
}
