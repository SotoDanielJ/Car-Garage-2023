package org.wecancodeit.menu;

import java.util.Scanner;

import org.wecancodeit.Garage;
import org.wecancodeit.subclasses.AICar;
import org.wecancodeit.subclasses.Car;
import org.wecancodeit.subclasses.ElectricCar;

public class Operations {
    Scanner input = new Scanner(System.in);
    private static Garage garage = new Garage();

    public void optionMenu() {
        garage.money();
        int returnValue = 0;
        String validResponse = "1, 2, 3, 4, 5, 6";
        while (true) {
            String value = "";
            System.out.println("");
            System.out.println("What would you like to do?");
            System.out.println("1. Test Drive");
            System.out.println("2. See Vehicles");
            System.out.println("3. Maintenance");
            System.out.println("4. Buy a Vehicle");
            System.out.println("5. Sell a Vehicle");
            System.out.println("6. Leave Garage");
            value = input.nextLine();
            if (value.length() == 1 && validResponse.contains(value)) {
                returnValue = Integer.parseInt(value);
                performActionInGarage(returnValue);
                break;
            } else {
                System.out.println("Invalid response. Try again...");
            }
        }
    }

    public void performActionInGarage(Integer userSelection) {
        if (userSelection.equals(1)) {
            int returnValue = 0;
            String validResponse = "1, 2, 3, 4";
            while (true) {
                String value = "";
                System.out.println("What kind of vehicle would you like to test drive?");
                System.out.println("1. Car");
                System.out.println("2. Electric Car");
                System.out.println("3. AI Car");
                System.out.println("4. Go back...");
                value = input.nextLine();
                if (!validResponse.contains(value) && value.length() != 1) {
                    System.out.println("Invalid response. Try again...");
                } else if(value.equals("1")){
                    returnValue = Integer.parseInt(value);
                    int carToTest = askUserWhichCarToInteractWith();
                    Car testCar = garage.retrieveCarByID(carToTest);
                    garage.testDrive(testCar);
                } else if (value.equals("2")) {
                    returnValue = Integer.parseInt(value);
                    int ecarToTest = askUserWhichECarToInteractWith();
                    ElectricCar testECar = garage.retrieveECarByID(ecarToTest);
                    garage.testDriveE(testECar);
                } else if (value.equals("3")) {
                    returnValue = Integer.parseInt(value);
                    int acarToTest = askUserWhichACarToInteractWith();
                    AICar testAICar = garage.retrieveACarByID(acarToTest);
                    garage.testDriveA(testAICar);
                } else {
                    optionMenu();
                    // break;
                }
            }
        } else if (userSelection.equals(2)) {
            System.out.println("Here's our car selection");
            garage.showCarGarageAll();
        } else if (userSelection.equals(3)) {
            int returnValue = 0;
            String validResponse = "1, 2, 3, 4";
            while (true) {
                String value = "";
                System.out.println("What kind of vehicle would you like to repair?");
                System.out.println("1. Car");
                System.out.println("2. Electric Car");
                System.out.println("3. AI Car");
                System.out.println("4. Go back...");
                value = input.nextLine();
                if (!validResponse.contains(value) && value.length() != 1) {
                    System.out.println("Invalid response. Try again...");
                } else if (value.equals("1")){
                    returnValue = Integer.parseInt(value);
                    int carToRepair = askUserWhichCarToInteractWith();
                    garage.carMaintenance(carToRepair);
                } else if (value.equals("2")) {
                    returnValue = Integer.parseInt(value);
                    int ecarToRepair = askUserWhichECarToInteractWith();
                    garage.carMaintenance(ecarToRepair);
                } else if (value.equals("3")) {
                    returnValue = Integer.parseInt(value);
                    int acarToRepair = askUserWhichACarToInteractWith();
                    garage.carMaintenance(acarToRepair);
                } else {
                    optionMenu();
                    // break;
                }
            }
        } else if (userSelection.equals(4)) {
            int returnValue = 0;
            String validResponse = "1, 2, 3, 4";
            while (true) {
                String value = "";
                System.out.println("What kind of vehicle do you want to buy?");
                System.out.println("1. Car");
                System.out.println("2. Electric Car");
                System.out.println("3. AI Car");
                System.out.println("4. Go back...");
                value = input.nextLine();
                if (!validResponse.contains(value) && value.length() != 1) {
                    System.out.println("Invalid response. Try again...");
                } else if(value.equals("1")){
                    returnValue = Integer.parseInt(value);
                    int carSold = askUserWhichCarToInteractWith();
                    Car soldCar = garage.retrieveCarByID(carSold);
                    System.out.println("That'll run you $" + soldCar.getPrice());
                    garage.removeCar(carSold);
                    System.out.println("Your money: $" + (garage.wallet - soldCar.getPrice()));
                } else if (value.equals("2")) {
                    returnValue = Integer.parseInt(value);
                    int eCarSold = askUserWhichECarToInteractWith();
                    ElectricCar soldECar = garage.retrieveECarByID(eCarSold);
                    System.out.println("That'll run you $" + soldECar.getPrice());
                    garage.removeECar(eCarSold);
                    System.out.println("Your money: $" + (garage.wallet - soldECar.getPrice()));
                } else if (value.equals("3")) {
                    returnValue = Integer.parseInt(value);
                    int aiCarSold = askUserWhichACarToInteractWith();
                    AICar soldAICar = garage.retrieveACarByID(aiCarSold);
                    System.out.println("That'll run you $" + soldAICar.getPrice());
                    garage.removeAICar(aiCarSold);
                    System.out.println("Your money: $" + (garage.wallet - soldAICar.getPrice()));
                } else {
                    optionMenu();
                    // break;
                }
            }
        } else if (userSelection.equals(5)) {
            int returnValue = 0;
            String validResponse = "1, 2, 3, 4";
            while (true) {
                String value = "";
                System.out.println("What kind of vehicle do you want to sell?");
                System.out.println("1. Car");
                System.out.println("2. Electric Car");
                System.out.println("3. AI Car");
                System.out.println("4. Go back...");
                value = input.nextLine();
                if (!validResponse.contains(value) && value.length() != 1) {
                    System.out.println("Invalid response. Try again...");
                }
                // returnValue = Integer.parseInt(value);
                // if(returnValue == 1){
                    // Car sellCar = askUserForCarSellInfo();
                    // System.out.println("Deal! Here's the cash! $" + sellCar.getPrice());
                    // garage.addNewCarsToGarage(sellCar);
                    // System.out.println("Your money: $" + (garage.wallet + sellCar.getPrice()));
                // }
                else if (value.equals("1")) {
                    returnValue = Integer.parseInt(value);
                    Car sellCar = askUserForCarSellInfo();
                    System.out.println("Deal! Here's the cash! $" + sellCar.getPrice());
                    garage.addNewCarsToGarage(sellCar);
                    System.out.println("Your money: $" + (garage.wallet + sellCar.getPrice()));
                } else if (value.equals("2")) {
                    returnValue = Integer.parseInt(value);
                    ElectricCar sellECar = askUserForECarSellInfo();
                    System.out.println("Deal! Here's the cash! $" + sellECar.getPrice());
                    garage.addNewECarsToGarage(sellECar);
                    System.out.println("Your money: $" + (garage.wallet + sellECar.getPrice()));
                } else if (value.equals("3")) {
                    returnValue = Integer.parseInt(value);
                    AICar sellACar = askUserForACarSellInfo();
                    System.out.println("Deal! Here's the cash! $" + sellACar.getPrice());
                    garage.addNewACarsToGarage(sellACar);
                    System.out.println("Your money: $" + (garage.wallet + sellACar.getPrice()));
                } else {
                    optionMenu();
                    // break;
                }
            }
        } else if (userSelection.equals(6)) {
            System.out.println("You left the Garage. ");
            System.exit(0);
        }
    }

    public int askUserWhichCarToInteractWith() {
        garage.showCarGarage();
        int userSelection = Integer.valueOf(input.next());
        return userSelection;
    }

    public int askUserWhichECarToInteractWith() {
        garage.showECarGarage();
        int userSelection = Integer.valueOf(input.next());
        return userSelection;
    }

    public int askUserWhichACarToInteractWith() {
        garage.showAICarGarage();
        int userSelection = Integer.valueOf(input.next());
        return userSelection;
    }

    public Car askUserForCarSellInfo() {
        System.out.println("What car would you like to sell? (Make, Body, Model, Color)");
        System.out.print("Please enter vehicle make: ");
        String nameOfMake = input.nextLine();
        System.out.print("Please enter body type: ");
        String nameOfBody = input.nextLine();
        System.out.print("Please enter vehicle model: ");
        String nameOfModel = input.nextLine();
        System.out.print("Please enter vehicle color: ");
        String nameOfColor = input.nextLine();
        
        Car newCar = new Car(nameOfMake, nameOfBody, nameOfModel, nameOfColor);
        return newCar;
    }
    
    public ElectricCar askUserForECarSellInfo() {
        System.out.println("What electric car would you like to sell? (Make, Body, Model, Color)");
        System.out.print("Please enter vehicle make: ");
        String nameOfMake = input.nextLine();
        System.out.print("Please enter body type: ");
        String nameOfBody = input.nextLine();
        System.out.print("Please enter vehicle model: ");
        String nameOfModel = input.nextLine();
        System.out.print("Please enter vehicle color: ");
        String nameOfColor = input.nextLine();
        
        ElectricCar newECar = new ElectricCar(nameOfMake, nameOfBody, nameOfModel, nameOfColor);
        return newECar;
    }
    
    public AICar askUserForACarSellInfo() {
        System.out.println("What AI car would you like to sell? (Make, Body, Model, Color)");
        System.out.print("Please enter vehicle make: ");
        String nameOfMake = input.nextLine();
        System.out.print("Please enter body type: ");
        String nameOfBody = input.nextLine();
        System.out.print("Please enter vehicle model: ");
        String nameOfModel = input.nextLine();
        System.out.print("Please enter vehicle color: ");
        String nameOfColor = input.nextLine();
        
        AICar newACar = new AICar(nameOfMake, nameOfBody, nameOfModel, nameOfColor);
        return newACar;
    }
    // private Scanner input = new Scanner(System.in);
    // private Garage garage = new Garage();

    // //Main Menu
    // public OperationsEnum optionMenu(){
    // int returnValue = 0;
    // String validResponse = "1, 2, 3, 4, 5, 6, 7";
    // while (true){
    // String value = "";
    // System.out.println("1. Test Drive");
    // System.out.println("2. Vehicles");
    // System.out.println("3. Maintenance");
    // System.out.println("4. Vehicles for Sale");
    // System.out.println("5. Buy a Vehicle");
    // System.out.println("6. Sell a Vehicle");
    // System.out.println("7. Leave Garage");
    // System.out.print("What is your option?");
    // value = input.nextLine();
    // if(value.length()==1 && validResponse.contains(value)){
    // returnValue = Integer.parseInt(value);
    // if(returnValue == 1){
    // testDrive(value);
    // }
    // else if(returnValue == 2){
    // selectVehicle(value);
    // }
    // else if(returnValue == 3){
    // maintenance(value);
    // }
    // else if(returnValue == 4){
    // forSale(value);
    // }
    // else if(returnValue == 5){
    // buyNow(value);
    // }
    // else if(returnValue == 6){
    // sellNow(value);
    // }
    // else if(returnValue == 7){
    // System.out.println("Thanks for stopping by!");
    // break;
    // }
    // else{
    // System.out.println("Invalid response. Try again...");
    // }
    // }
    // }
    // return OperationsEnum.values()[returnValue];
    // }

    // //perform operations "Start, drive a single vehicle"
    // public int testDrive(String optionName) {
    // int returnValue = 0;
    // String validResponse = "1, 2";
    // while(true){
    // String value = "";
    // System.out.printf("%n%s Test Drive Menu%n", optionName);
    // System.out.printf("1. Select a Vehicle Type to %s%n", optionName);
    // System.out.println("2. Go back");
    // System.out.print("Select an option... ");
    // value = input.nextLine();
    // if(value.length()==1 && validResponse.contains(value)){
    // returnValue = Integer.parseInt(value);
    // if(returnValue == 1){
    // testDriveVehicles();
    // }
    // else if(returnValue == 2){
    // optionMenu();
    // }
    // else{
    // System.out.println("Invalid response. Try again...");
    // }
    // }
    // }
    // }

    // public int testDriveVehicles() {
    // int returnValue = 0;
    // String validResponse = "1, 2, 3, 4, 5, 6, 7";
    // while (true){
    // String value = "";
    // System.out.println(garage);
    // System.out.println("1. (gas) Car");
    // System.out.println("2. Electric Car");
    // System.out.println("3. AI Car");
    // System.out.println("4. Go back");
    // System.out.print("Select an option...");
    // value = input.nextLine();
    // if(value.length()==1 && validResponse.contains(value)){
    // returnValue = Integer.parseInt(value);
    // if(returnValue == 1){
    // testSelectCar(value);

    // }
    // else if(returnValue == 2){
    // selectVehicle(value);
    // }
    // else if(returnValue == 3){
    // maintenance(value);
    // }
    // else if(returnValue == 4){
    // forSale(value);
    // }
    // else if(returnValue == 5){
    // buyNow(value);
    // }
    // else if(returnValue == 6){
    // sellNow(value);
    // }
    // else if(returnValue == 7){
    // System.out.println("Thanks for stopping by!");
    // break;
    // }
    // else{
    // System.out.println("Invalid response. Try again...");
    // }
    // }
    // }
    // return returnValue;
    // }

    // private void testSelectCar(String value) {
    // }

    // public int selectVehicle(String vic) {
    // return 0;
    // }
    // public int maintenance(String work) {
    // return 0;
    // }
    // public int forSale(String sale) {
    // return 0;
    // }
    // public int buyNow(String buyers) {
    // return 0;
    // }
    // public int sellNow(String sellers) {
    // return 0;
    // }
    // // buy a car
    // // sell vehicle
    // // leave garage
}
