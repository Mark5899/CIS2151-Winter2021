package chapter6nightreview;

import java.util.Scanner;

public class Chapter6NightReview {

    public static void main(String[] args) {
        
        double number = 1.1;
        for ( int subtraction = 0; subtraction < 100; subtraction++ )
        {
            number -= .000001;
        }
        System.out.println(number);
        
        System.out.println("Hello world!");
        Vehicle blueJean = new Vehicle("Ford", "Transit", "Blue Jean Metalic", 25, 14);

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How much gas do you want to add?");
        double gasToAddInGallons = Double.parseDouble(keyboard.nextLine());

        if (blueJean.addGas(gasToAddInGallons)) {
            System.out.println("You added some gas, don't forget to pay!");
        } else {
            System.out.println("Something went wrong, you added too much or a negative number");
        }
        
        
    }

}
