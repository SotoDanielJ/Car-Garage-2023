package org.wecancodeit;

import java.util.HashMap;
import java.util.Map;
import org.wecancodeit.menu.Operations;
import org.wecancodeit.subclasses.AICar;
import org.wecancodeit.subclasses.Car;
import org.wecancodeit.subclasses.ElectricCar;

public class Garage {
    Operations operations = new Operations();
    protected boolean driving = false;
    protected boolean running = false;
    public int wallet = 100000;

    public void money() {
        System.out.println("Your money: $" + wallet);
    }

    public void start() {
        money();
        showCarGarageAll();
        operations.optionMenu();
    }

    Car car1 = new Car("GM", "Sedan", "Passat", "Red");
    Car car2 = new Car("Ford", "Hatchback", "Velar", "Blue");
    Car car3 = new Car("Chevrolet", "Pickup", "Megane", "Chrome");
    Car car4 = new Car("BMW", "SUV", "Kalos", "Ebony");
    Car car5 = new Car("Lamborghini", "Pickup", "Series5", "Ivory");
    ElectricCar electricCar1 = new ElectricCar("Dodge", "Sports", "Niro", "Orange");
    ElectricCar electricCar2 = new ElectricCar("Honda", "Convertible", "Wrangler", "Yellow");
    ElectricCar electricCar3 = new ElectricCar("Nissan", "Sedan", "MKZ", "Green");
    ElectricCar electricCar4 = new ElectricCar("Tesla", "Hatchback", "Equinox", "Indigo");
    ElectricCar electricCar5 = new ElectricCar("Rivian", "SUV", "Sienna", "Violet");
    AICar aiCar1 = new AICar("Lamborghini", "Sports", "TLX", "Chrome");
    AICar aiCar2 = new AICar("BMW", "SUV", "A4", "Pink");
    AICar aiCar3 = new AICar("Honda", "SUV", "Series5", "Off White");
    AICar aiCar4 = new AICar("Chevrolet", "SUV", "i3", "Blue");
    AICar aiCar5 = new AICar("Ford", "SUV", "Sonata", "Indigo");

    HashMap<Integer, Car> cars = new HashMap<>();
    int ID = 0;
    HashMap<Integer, ElectricCar> ecars = new HashMap<>();
    int eID = 100;
    HashMap<Integer, AICar> acars = new HashMap<>();
    int aID = 200;

    public void addCarsToGarageAll() {
        cars.put(ID++, car1);
        cars.put(ID++, car2);
        cars.put(ID++, car3);
        cars.put(ID++, car4);
        cars.put(ID++, car5);
        ecars.put(eID++, electricCar1);
        ecars.put(eID++, electricCar2);
        ecars.put(eID++, electricCar3);
        ecars.put(eID++, electricCar4);
        ecars.put(eID++, electricCar5);
        acars.put(aID++, aiCar1);
        acars.put(aID++, aiCar2);
        acars.put(aID++, aiCar3);
        acars.put(aID++, aiCar4);
        acars.put(aID++, aiCar5);
    }

    public void addCarsToGarage() {
        cars.put(ID++, car1);
        cars.put(ID++, car2);
        cars.put(ID++, car3);
        cars.put(ID++, car4);
        cars.put(ID++, car5);
    }

    public void addECarsToGarage() {
        ecars.put(eID++, electricCar1);
        ecars.put(eID++, electricCar2);
        ecars.put(eID++, electricCar3);
        ecars.put(eID++, electricCar4);
        ecars.put(eID++, electricCar5);
    }

    public void addAICarsToGarage() {
        acars.put(aID++, aiCar1);
        acars.put(aID++, aiCar2);
        acars.put(aID++, aiCar3);
        acars.put(aID++, aiCar4);
        acars.put(aID++, aiCar5);
    }

    public void addNewCarsToGarage(Car sellCar) {
        cars.put(ID++, sellCar);
    }

    public void addNewECarsToGarage(ElectricCar sellECar) {
        ecars.put(eID++, sellECar);
    }

    public void addNewACarsToGarage(AICar sellACar) {
        acars.put(aID++, sellACar);
    }

    public void removeCar(int soldCar) {
        cars.remove(soldCar);
    }

    public void removeECar(int soldECar) {
        cars.remove(soldECar);
    }

    public void removeAICar(int soldAICar) {
        cars.remove(soldAICar);
    }

    public void showCarGarageAll() {
        addCarsToGarageAll();
        System.out.println("Take a look at our inventory...\n");
        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
        for (Map.Entry<Integer, ElectricCar> entry : ecars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
        for (Map.Entry<Integer, AICar> entry : acars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
        operations.optionMenu();
    }

    public void showCarGarage() {
        addCarsToGarage();
        System.out.println("Take a look at our car inventory...\n");
        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
    }

    public void showECarGarage() {
        addECarsToGarage();
        System.out.println("Take a look at our electric car inventory...\n");
        for (Map.Entry<Integer, ElectricCar> entry : ecars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
    }

    public void showAICarGarage() {
        addAICarsToGarage();
        System.out.println("Take a look at our AI car inventory...\n");
        for (Map.Entry<Integer, AICar> entry : acars.entrySet()) {
            System.out.println("Car ID: " + entry.getKey() + " " + entry.getValue());
            System.out.println("");
        }
    }

    // Vehicle Retrievals
    public Car retrieveCarByID(int requestedCarID) {
        Car car = null;
        for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
            int carID = entry.getKey();
            if (requestedCarID == carID) {
                car = entry.getValue();
            }
        }
        return car;
    }

    public ElectricCar retrieveECarByID(int requestedECarID) {
        ElectricCar electricCar = null;
        for (Map.Entry<Integer, ElectricCar> entry : ecars.entrySet()) {
            int carID = entry.getKey();
            if (requestedECarID == carID) {
                electricCar = entry.getValue();
            }
        }
        return electricCar;
    }

    public AICar retrieveACarByID(int requestedACarID) {
        AICar aiCar = null;
        for (Map.Entry<Integer, AICar> entry : acars.entrySet()) {
            int carID = entry.getKey();
            if (requestedACarID == carID) {
                aiCar = entry.getValue();
            }
        }
        return aiCar;
    }

    private carDrive carStep;

    public void testDrive(Car car) {
        carStep = carDrive.step1;
        for (int i = 0; i < 8; i++) {
            carSteps();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private enum carDrive {
        step1, step2, step3, step4, step5, step6, step7, step8;
    }

    public void carSteps() {
        switch (carStep) {
            case step1:
                System.out.println("Inspecting exterior...");
                carStep = carDrive.step2;
                break;
            case step2:
                System.out.println("Unlocking car...");
                carStep = carDrive.step3;
                break;
            case step3:
                System.out.println("Adjusting seat and mirrors...");
                carStep = carDrive.step4;
                break;
            case step4:
                System.out.println("Starting engine...");
                running = true;
                carStep = carDrive.step5;
                break;
            case step5:
                System.out.println("Leaving lot...");
                driving = true;
                carStep = carDrive.step6;
                break;
            case step6:
                System.out.println("Mile 1...");
                carStep = carDrive.step7;
                break;
            case step7:
                System.out.println("Going back to the lot...");
                carStep = carDrive.step8;
                break;
            case step8:
                System.out.println("Mile 2, arrived at lot. Parking...");
                running = false;
                driving = false;
                break;
        }
    }

    private ecarDrive ecarStep;

    public void testDriveE(ElectricCar electricCar) {
        ecarStep = ecarDrive.step1;
        for (int i = 0; i < 8; i++) {
            ecarSteps();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private enum ecarDrive {
        step1, step2, step3, step4, step5, step6, step7, step8;
    }

    public void ecarSteps() {
        switch (ecarStep) {
            case step1:
                System.out.println("Inspecting exterior...");
                ecarStep = ecarDrive.step2;
                break;
            case step2:
                System.out.println("Unlocking car...");
                ecarStep = ecarDrive.step3;
                break;
            case step3:
                System.out.println("Adjusting seat and mirrors...");
                ecarStep = ecarDrive.step4;
                break;
            case step4:
                System.out.println("Starting engine...");
                running = true;
                ecarStep = ecarDrive.step5;
                break;
            case step5:
                System.out.println("Leaving lot...");
                driving = true;
                ecarStep = ecarDrive.step6;
                break;
            case step6:
                System.out.println("Mile 1...");
                ecarStep = ecarDrive.step7;
                break;
            case step7:
                System.out.println("Going back to the lot...");
                ecarStep = ecarDrive.step8;
                break;
            case step8:
                System.out.println("Mile 2, arrived at lot. Parking...");
                running = false;
                driving = false;
                break;
        }
    }

    private aicarDrive aicarStep;

    public void testDriveA(AICar aiCar) {
        aicarStep = aicarDrive.step1;
        for (int i = 0; i < 8; i++) {
            aicarSteps();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private enum aicarDrive {
        step1, step2, step3, step4, step5, step6, step7, step8;
    }

    public void aicarSteps() {
        switch (aicarStep) {
            case step1:
                System.out.println("'Customer detected, powering on... I am the AI for this vehicle. Welcome'...");
                running = true;
                aicarStep = aicarDrive.step2;
                break;
            case step2:
                System.out.println("'Car temperature adjusted for your comfort and seats heated, unlocking doors'...");
                aicarStep = aicarDrive.step3;
                break;
            case step3:
                System.out.println("'Plotting test drive route'...");
                aicarStep = aicarDrive.step4;
                break;
            case step4:
                System.out.println("'Leaving lot, fasten your seatbelt and enjoy the ride'...");
                driving = true;
                aicarStep = aicarDrive.step5;
                break;
            case step5:
                System.out.println("'We have traveled 1 mile, heading back to the lot'...");
                aicarStep = aicarDrive.step6;
                break;
            case step6:
                System.out.println("'12 Google ads have been blocked throughout this trip'...");
                aicarStep = aicarDrive.step7;
                break;
            case step7:
                System.out.println("'Nearing the car lot'...");
                aicarStep = aicarDrive.step8;
                break;
            case step8:
                System.out.println(
                        "'We have traveled a total of 2 miles and arrived back at the lot, I hope you enjoyed the ride and consider purchasing this car. Goodbye'.");
                driving = false;
                running = false;
                break;
        }
    }

    public void carMaintenance(int ID) {
        Car car = new Car();
        car.vehicleMaintenance();
        System.out.println("That'll be $10.  \nYour money: $" + (wallet - 10));
    }

    public void ecarMaintenance(int eID) {
        ElectricCar eCar = new ElectricCar();
        eCar.vehicleMaintenance();
        System.out.println("That'll be $10. \nYour money: $" + (wallet - 10));
    }

    public void acarMaintenance(int aID) {
        AICar aicar = new AICar();
        aicar.vehicleMaintenance();
        System.out.println("That'll be $10.  \nYour money: $" + (wallet - 10));
    }
    // private Manufacturer manufacturer;
    // private Model model;
    // private Color color;
    // private AI ai;;4'5/

    // AtomicInteger uniqueId = new AtomicInteger();
    // Map<Integer, Car> cars = new HashMap<>();
    // Car car = new Car(manufacturer, model, color);
    // ElectricCar eCar = new ElectricCar(manufacturer, model, model);
    // AICar aiCar = new AICar(manufacturer, model, model, ai);

    // public Garage(){
    // Manufacturer[] manufacturerValues = Manufacturer.values();
    // this.manufacturer = manufacturerValues[new
    // Random().nextInt(manufacturerValues.length)];

    // Model[] modelValues = Model.values();
    // this.model = modelValues[new Random().nextInt(modelValues.length)];

    // Color[] colorValues = Color.values();
    // this.color = colorValues[new Random().nextInt(colorValues.length)];

    // AI[] aiValues = AI.values();
    // this.ai = aiValues[new Random().nextInt(aiValues.length)];

    // Car car1 = new Car(this.manufacturer, this.model, this.color);
    // Car car2 = new Car(this.manufacturer, this.model, this.color);
    // Car car3 = new Car(this.manufacturer, this.model, this.color);
    // Car car4 = new Car(this.manufacturer, this.model, this.color);
    // Car car5 = new Car(this.manufacturer, this.model, this.color);
    // Car car6 = new Car(this.manufacturer, this.model, this.color);
    // Car car7 = new Car(this.manufacturer, this.model, this.color);

    // // private int carCounter = 1;

    // for(int c = 0; c < 1; c++){
    // cars.put(uniqueId.get(), car1);
    // cars.put(uniqueId.incrementAndGet(), car2);
    // cars.put(uniqueId.incrementAndGet(), car3);
    // cars.put(uniqueId.incrementAndGet(), car4);
    // cars.put(uniqueId.incrementAndGet(), car5);
    // cars.put(uniqueId.incrementAndGet(), car6);
    // cars.put(uniqueId.incrementAndGet(), car7);
    // }

    // public void buy(){

    // }

    // public void sellVehicle(){

    // }

    // public void showGarage() {

    // }
    // }
}
