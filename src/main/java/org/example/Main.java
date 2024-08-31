package org.example;

public class Main {
    public static void main(String[] args){
        Car c1 = new Car();
        c1.displayInfo();
        Vehicle v1 = new Vehicle(6,"blue",3,"diesel");
        System.out.println(v1.color);
        System.out.println(v1.numberOfWheels);
        System.out.println(v1.engineSize);
        System.out.println(v1.fuelType);
    }

}