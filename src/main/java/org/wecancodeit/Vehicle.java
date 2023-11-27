package org.wecancodeit;

import java.util.Random;

import org.wecancodeit.enums.AI;
import org.wecancodeit.enums.BodyType;
import org.wecancodeit.enums.Color;
import org.wecancodeit.enums.FuelType;
import org.wecancodeit.enums.Manufacturer;
import org.wecancodeit.enums.Model;

public abstract class Vehicle {
    private Random random = new Random(10);
    protected int numberOfTires = 4;
    protected int maxSpeed;
    protected int currentMileage = 0;
    protected Manufacturer manufacturer;
    protected int price;
    protected BodyType bodyType;
    protected Model model;
    protected Color color;
    protected int currentDistance = 0;
    protected int mpf; //miles per fuel type
    protected int fuelTypeStorage;
    protected int maxDistance;
    protected int year;
    protected int garageNumber;
    protected AI ai;
    protected FuelType fuelType;
    private boolean running = false;
    private boolean driving;
    
        public Vehicle(){
            this.maxSpeed = randomSpeed();
            this.currentMileage = currentMileage;
            this.manufacturer = randomMake();
            this.model = randomModel();
            this.bodyType = randomBody();
            this.color = randomColor();
            this.fuelType = randomFuel();
            this.price = randomCost();
            this.mpf = randomMPF();
            this.fuelTypeStorage = randomFuelStorage();
            this.maxDistance = mpf * fuelTypeStorage;
            this.year = randomYear();
        }
    
    public Vehicle(Manufacturer manufacturer, Model model, Color color){
        this.maxSpeed = randomSpeed();
        this.currentMileage = currentMileage;
        this.manufacturer = randomMake();
        this.model = randomModel();
        this.bodyType = randomBody();
        this.color = randomColor();
        this.fuelType = randomFuel();
        this.price = randomCost();
        this.mpf = randomMPF();
        this.fuelTypeStorage = randomFuelStorage();
        this.maxDistance = mpf * fuelTypeStorage;
        this.year = randomYear();
    }

    protected Color randomColor() {
        int index = random.nextInt(Color.values().length);
        color = Color.values()[index];
        return color;
    }

    protected Model randomModel() {
        int index = random.nextInt(Model.values().length);
        model = Model.values()[index];
        return model;
    }

    protected FuelType randomFuel() {
        int index = random.nextInt(FuelType.values().length);
        fuelType = FuelType.values()[index];
        return fuelType;
    }

    protected BodyType randomBody() {
        int index = random.nextInt(BodyType.values().length);
        bodyType = BodyType.values()[index];
        return bodyType;
    }

    protected Manufacturer randomMake() {
        int index = random.nextInt(Manufacturer.values().length);
        manufacturer = Manufacturer.values()[index];
        return manufacturer;
    }

    protected int randomYear() {
        int min = 2000;
        int max = 2024;
        int year = min + random.nextInt(max - min);
        return year;
    }

    protected int randomFuelStorage() {
        int min = 12;
        int max = 25;
        int fuelStorage = min + random.nextInt(max - min);
        return fuelStorage;
    }

    protected int randomSpeed() {
        int min = 120;
        int max = 300;
        int speed = min + random.nextInt(max - min);
        return speed;
    }

    protected int randomCost(){
        int min = 3000;
        int max = 30000;
        int randomPrice = min + random.nextInt(max - min);
        return randomPrice;
    }

    protected int randomMPF() {
        int min = 25;
        int max = 50;
        int mPF = min + random.nextInt(max - min);
        return mPF;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public boolean isDriving() {
        return driving;
    }

    public abstract String vehicleType();

    public abstract void vehicleMaintenance();

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    public Random getRandom() {
        return random;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public int getCurrentMileage() {
        return currentMileage;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public Color getColor() {
        return color;
    }

    public boolean isRunning() {
        return running;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public Model getModel() {
        return model;
    }

    public int getMpf() {
        return mpf;
    }

    public int getFuelTypeStorage() {
        return fuelTypeStorage;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getYear() {
        return year;
    }

    public AI getAi() {
        return ai;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
