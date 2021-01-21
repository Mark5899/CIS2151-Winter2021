package chapter6morereview;

import java.util.Scanner;

public class Chapter6MoreReview {

    public static void main(String[] args) {
        Vehicle thunder = new Vehicle("Chevy", "Bolt", 0, 0);
        Vehicle blueJean = new Vehicle("Ford", "Trasit", 25, 14);

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many gallons of gas do you want to add to Blue Jean?");
        double gasToAddInGallons = Double.parseDouble(keyboard.nextLine());

        if (gasToAddInGallons
                > blueJean.getGasTankCapacityInGallons() - blueJean.getActualGasInTankInGallons()) {
            System.out.println("That's too much gas!");
        }
        
        blueJean.addGasInGallons(gasToAddInGallons);

    }

}
