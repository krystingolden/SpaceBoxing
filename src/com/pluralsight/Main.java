package com.pluralsight;

import java.util.Scanner;

public class Main {
    /*
    https://programmingbydoing.com/

    Space boxing Assignment #26
     */
    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter your current earth weight:");
        int weight = keyboard.nextInt();
        double finalWeight;

        System.out.println("I have information for the following planets:");
        System.out.println("1. Venus   2. Mars     3. Jupiter");
        System.out.println("4. Saturn  5. Uranus   6. Neptune");
        System.out.println();
        System.out.println("Which planet are you visiting?");
        int planetNum = keyboard.nextInt();

        if (planetNum == 1){
            finalWeight = weight * 0.78;
        }
        else if (planetNum == 2){
            finalWeight = weight * 0.39;
        }
        else if (planetNum == 3){
            finalWeight = weight * 2.65;
        }
        else if (planetNum == 4){
            finalWeight = weight * 1.17;
        }
        else if (planetNum == 5){
            finalWeight = weight * 1.05;
        }
        else
            finalWeight = weight * 1.23;


        System.out.println("Your weight would be " + finalWeight+ " on that planet.");
    }
}
