package project0nightclass;

import java.util.Scanner;

public class Project0NightClass {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // copied from https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Project0NightClass/src/project0nightclass/Project0NightClass.java
        System.out.println("Hello generic humanoid, I am the mighty computer, what is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + ", nice to meet you, how are you?");
        keyboard.nextLine();
        System.out.println("That's nice, I'm having a great eon!");
    }
    
}
