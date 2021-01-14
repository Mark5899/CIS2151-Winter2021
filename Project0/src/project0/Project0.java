package project0;

import java.util.Scanner;

public class Project0 {
    
    public static void main(String[] args) {
        // got this from https://github.com/EricCharnesky/CIS2151-Winter2021/blob/main/Project0/src/project0/Project0.java
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Hello humanoid, what is your name?");
        String name = keyboard.nextLine();
        System.out.println("Hello " + name + "! How are you today?");
        String today = keyboard.nextLine();
        System.out.println("That's nice, I'm having a fantastic day!");
        
    }
    
}
