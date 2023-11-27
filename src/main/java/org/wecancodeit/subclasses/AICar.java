package org.wecancodeit.subclasses;

import org.wecancodeit.Vehicle1;
import org.wecancodeit.enums.FuelType;

public class AICar extends Vehicle1{

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
    
    public AICar(String nameOfMake, String nameOfBody, String nameOfModel, String nameOfColor){
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
        this.ai = randomAI;
    }
    
    public AICar() {
    }

    //Overrides
    @Override
    public String toString() {
        return "- Body: " + bodyType + " - Make: " + manufacturer + " - Model: " + model +  " - Color: " + color + " - Year: " + year + " - AI: "  + ai + " - Maximum Speed: " + maxSpeed + "mph - Fuel: " + fuelType + " - Miles per Joule: " + mpf + " - Joule Capacity: " + fuelCapacity + "joules - Joule Range: " + maxDistance + " miles - Odometer: " + currentMileage + " miles - Price: $" + price;
    }
    @Override
    public FuelType fuelType() {
        return FuelType.ELECTRIC;
    }
    private AiRepair currentStep;
    @Override
    public void vehicleMaintenance() {
        currentStep = AiRepair.step1;
        for (int i = 0; i < 8; i++) {
            repairStep();
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }
    }
    private enum AiRepair {
        step1, step2, step3, step4, step5, step6, step7, step8;
    }
    private void repairStep(){
        switch (currentStep) {
            case step1:
                System.out.println("Plugging in power...");
                currentStep = AiRepair.step2;
                break;
            case step2:
                System.out.println("Charging...");
                currentStep = AiRepair.step3;
                break;
            case step3:
                System.out.println("Running system diagnostics...");
                currentStep = AiRepair.step4;
                break;
            case step4:
                System.out.println("Connecting to internet...");
                currentStep = AiRepair.step5;
                break;
            case step5:
                System.out.println("Checking for updates...");
                currentStep = AiRepair.step6;
                break;
            case step6:
                System.out.println("Downloading updates...");
                currentStep = AiRepair.step7;
                break;
            case step7:
                System.out.println("Updates complete...");
                currentStep = AiRepair.step8;
                break;
            case step8:
                System.out.println("Vehicle charged and all systems good to go.");
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
