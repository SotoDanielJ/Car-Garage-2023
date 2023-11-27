package org.wecancodeit;

public class CarApp {
    public static void main(String[] args) {
        System.out.println("Welcome to Revan's Car Lot!");
        Garage garage = new Garage();
        garage.start();
        // Random random = new Random(10);
        // int min = 3000;
        // int max = 30000;
        // int randomNumber = min + random.nextInt(max - min + 1);
        // System.out.println(randomNumber);
    }
}