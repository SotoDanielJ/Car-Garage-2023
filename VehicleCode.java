package org.wecancodeit;

import java.util.Random;

public abstract class Vehicle {
    private Random random = new Random(10);
    private int numberOfTires = 4;
    private int maxSpeed;
    private double currentMileage = 0;
    private Manufacturer manufacturer;
    private String model;
    private int price = 0;
    private BodyType bodyType = BodyType.SEDAN;
    private String color;

    private boolean running = false;

    private FuelType fuelType;
    private boolean driving;
    private int currentDistance = 0;

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public Vehicle(int maxSpeed, double currentMileage, Manufacturer manufacturer, String model, BodyType bodyType, String color, FuelType fuelType) {
        this.maxSpeed = maxSpeed;
        this.currentMileage = currentMileage;
        this.manufacturer = manufacturer;
        this.model = model;
        this.bodyType = bodyType;
        this.color = color;
        this.fuelType = fuelType;
        this.price = randomCost();

    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public String getColor() {
        return color;
    }

    public boolean isRunning() {
        return running;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public boolean isDriving() {
        return driving;
    }

    public abstract int maxDistance();

    public abstract String vehicleType();

    public abstract void vehicleMaintenance();

    private int randomCost() {
        int min = 3000;
        int max = 30000;
        int randomNumber = min + random.nextInt(max - min + 1);
        return randomNumber;
    }

}
