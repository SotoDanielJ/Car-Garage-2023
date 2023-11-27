package org.wecancodeit.subclasses;

import org.wecancodeit.Vehicle1;
import org.wecancodeit.enums.AI;
import org.wecancodeit.enums.FuelType;

public class ElectricCar extends Vehicle1{

    private boolean driving;
    private boolean running = false;
    private String manufacturer;
    private String bodyType;
    private String model;
    private String color;
    private int maxSpeed = randomSpeed();
    private int price = randomPrice();
    private int mpf = randomMPF();
    private int fuelCapacity = randomFuelCapacity();
    private int maxDistance = mpf * fuelCapacity;
    private int year = randomYear();
    
    public ElectricCar(String nameOfMake, String nameOfBody, String nameOfModel, String nameOfColor){
        this.manufacturer = nameOfMake;
        this.bodyType = nameOfBody;
        this.model = nameOfModel;
        this.color = nameOfColor;
        this.maxSpeed = randomSpeed();
        this.price = randomPrice();
        this.mpf = randomMPF();
        this.fuelCapacity = randomFuelCapacity();
        this.maxDistance = mpf * fuelCapacity;
        this.year = randomYear();
        this.ai = AI.None;
    }
    
    public ElectricCar() {
    }

    //Overrides
    @Override
    public String toString() {
        return "- Body: " + bodyType + " - Make: " + manufacturer + " - Model: " + model +  " - Color: " + color + " - Year: " + year + " - Maximum Speed: " + maxSpeed + "mph - Fuel: " + fuelType + " - Miles per Joule: " + mpf + " - Joule Capacity: " + fuelCapacity + "joules - Joule Range: " + maxDistance + " miles - Odometer: " + currentMileage + " miles - Price: $" + price;
    }
    @Override
    public FuelType fuelType() {
        return FuelType.ELECTRIC;
    }
    private ERepair currentStep;
    @Override
    public void vehicleMaintenance() {
        currentStep = ERepair.step1;
        for (int i = 0; i < 8; i++) {
            repairStep();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private enum ERepair {
        step1, step2, step3, step4, step5, step6, step7, step8;
    }
    public void repairStep() {
        switch (currentStep) {
            case step1:
                System.out.println("Raising car lift and plugging in power...");
                currentStep = ERepair.step2;
                break;
            case step2:
                System.out.println("Inspecting exterior...");
                currentStep = ERepair.step3;
                break;
            case step3:
                System.out.println("Running system diagnostics and checking for update(s)...");
                currentStep = ERepair.step4;
                break;
            case step4:
                System.out.println("Update(s) complete. Aligning wheels...");
                currentStep = ERepair.step5;
                break;
            case step5:
                System.out.println("Checking bolts...");
                currentStep = ERepair.step6;
                break;
            case step6:
                System.out.println("Refilling air in tires...");
                currentStep = ERepair.step7;
                break;
            case step7:
                System.out.println("Repairs complete. Battery recharged, refueling...");
                currentStep = ERepair.step8;
                break;
            case step8:
                System.out.println("Car charged, refueled and ready to hit the road.");
                break;
        }
    }
    
    //Getters and Setters
    public boolean isDriving() {
        return driving;
    }
    public void setDriving(boolean driving) {
        this.driving = driving;
    }
    public boolean isRunning() {
        return running;
    }
    public void setRunning(boolean running) {
        this.running = running;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public int getPrice() {
        return price;
    }
    public int getMpf() {
        return mpf;
    }
    public int getFuelCapacity() {
        return fuelCapacity;
    }
    public int getMaxDistance() {
        return maxDistance;
    }
    public int getYear() {
        return year;
    }
}