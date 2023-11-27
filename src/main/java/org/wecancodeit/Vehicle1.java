package org.wecancodeit;

import java.util.Random;

import org.wecancodeit.enums.AI;
import org.wecancodeit.enums.FuelType;

public abstract class Vehicle1 {
    // protected int numberOfTires = 4;
    protected static Random random = new Random(10);
    protected int maxSpeed = randomSpeed();
    protected int price = randomPrice();
    protected int mpf = randomMPF(); // miles per fuel type
    protected int fuelCapacity = randomFuelCapacity();
    protected int maxDistance = mpf * fuelCapacity;
    protected int year = randomYear();
    protected boolean driving;
    protected boolean running = false;
    protected String manufacturer;
    protected String bodyType;
    protected String model;
    protected String color;
    protected FuelType fuelType = fuelType();
    protected AI ai;
    protected int currentMileage = 0;
    protected int currentDistance = 0;

//Constructors for Cars,ElectricCars and AICars
    /**Constructor for cars, ai cars and electric cars
     * @param manufacturer
     * @param bodyType
     * @param model
     * @param color
     */
    public Vehicle1() {
        this.manufacturer = getManufacturer();
        this.bodyType = getBodyType();
        this.model = getModel();
        this.color = getColor();
        this.maxSpeed = randomSpeed();
        this.price = randomPrice();
        this.mpf = randomMPF();
        this.fuelCapacity = randomFuelCapacity();
        this.maxDistance = mpf * fuelCapacity;
        this.year = randomYear();
        this.fuelType = getFuelType();
        this.ai = getAi();
        this.currentMileage = getCurrentMileage();
        this.currentDistance = getCurrentDistance();
    }
    // /**Constructor for cars and electric cars
    //  * @param manufacturer
    //  * @param bodyType
    //  * @param model
    //  * @param color
    //  */
    // public Vehicle1(Manufacturer manufacturer, BodyType bodyType, Model model, Color color) {
    //     this.manufacturer = manufacturer;
    //     this.bodyType = bodyType;
    //     this.model = model;
    //     this.color = color;
    //     this.maxSpeed = randomSpeed();
    //     this.price = randomPrice();
    //     this.mpf = randomMPF();
    //     this.fuelCapacity = randomFuelCapacity();
    //     this.maxDistance = mpf * fuelCapacity;
    //     this.year = randomYear();
    // }

    //Randomizers for Speed, Price, MPF, Fuel Capacity and Year
        /**Generates random max speed
         * @return maxSpeed
         */
        public int randomSpeed(){
            int min = 120;
            int max = 300;
            int randomSpeed = min + random.nextInt(max - min);
            return randomSpeed;
        }
        /**Generates random price
         * @return price
         */
        public int randomPrice(){
            int min = 3000;
            int max = 30000;
            int randomPrice = min + random.nextInt(max - min);
            return randomPrice;
        }
        /**Generates random miles per fueltype (mpf) 
         * @return mpf
         */
        public int randomMPF(){
            int min = 25;
            int max = 50;
            int randomMPF = min + random.nextInt(max - min);
            return randomMPF;
        }
        /**Generates random fuel capacity
         * @return fuel capacity
         */
        public int randomFuelCapacity(){
            int min = 12;
            int max = 25;
            int randomFuelCapacity = min + random.nextInt(max - min);
            return randomFuelCapacity;
        }
        /**Generates random year
         * @return year
         */
        public int randomYear(){
            int min = 2000;
            int max = 2024;
            int randomYear = min + random.nextInt(max - min);
            return randomYear;
        }
        AI[] specificAI = {AI.HK47, AI.C3PO, AI.R2D2, AI.R5D4, AI.AP5, AI.BD1, AI.IG11, AI.EV9D9, AI.BB8, AI.L337, AI.K2SO};
        // Randomly pick an AI from the specific set
        protected AI randomAI = specificAI[random.nextInt(specificAI.length)];
        
    //Abstract Methods
        public abstract FuelType fuelType();
    
        public abstract void vehicleMaintenance();

    //Booleans
        public boolean isRunning() {
            return running;
        }
        public boolean isDriving() {
            return driving;
        }

    //Getters
    // public int getNumberOfTires() {
    //     return numberOfTires;
    // }
        public Random getRandom() {
            return random;
        }
        public int getMaxSpeed() {
            return maxSpeed;
        }
        public int getCurrentMileage() {
            return currentMileage;
        }
        public String getManufacturer() {
            return manufacturer;
        }
        public int getPrice() {
            return price;
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
        public int getCurrentDistance() {
            return currentDistance;
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
        public AI getAi() {
            return ai;
        }
        public FuelType getFuelType() {
            return fuelType;
        }
    //Setters
        // public void setNumberOfTires(int numberOfTires) {
        //     this.numberOfTires = numberOfTires;
        // }
        public void setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
        }
        public void setPrice(int price) {
            this.price = price;
        }
        public void setMpf(int mpf) {
            this.mpf = mpf;
        }
        public void setFuelCapacity(int fuelCapacity) {
            this.fuelCapacity = fuelCapacity;
        }
        public void setMaxDistance(int maxDistance) {
            this.maxDistance = maxDistance;
        }
        public void setYear(int year) {
            this.year = year;
        }
        public void setDriving(boolean driving) {
            this.driving = driving;
        }
        public void setRunning(boolean running) {
            this.running = running;
        }
}
