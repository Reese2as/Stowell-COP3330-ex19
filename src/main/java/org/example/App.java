/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        double height, weight, BMI;
        String height1, weight1;

        System.out.print("Please enter you height in inches ");
        height1 = user_input.nextLine();

        try {
            Double.parseDouble(height1);
        }
        catch (Exception ex){
            System.out.println("Invalid input");
            System.exit(1);
        }
        height = Double.parseDouble(height1);

        System.out.print("Please enter you weight in pounds ");
        weight1 = user_input.nextLine();

        try {
            Double.parseDouble(weight1);
        }
        catch (Exception ex){
            System.out.println("Invalid input");
            System.exit(1);
        }
        weight = Double.parseDouble(weight1);

        BMI = (weight / (height * height)) * 703;

        System.out.println(String.format("Your BMI is %.1f.", BMI));

        if (BMI <= 25 && BMI >18)
        {
            System.out.println(String.format("You are within the ideal weight range."));
        }
        else if (BMI < 18.5)
        {
            System.out.println(String.format("You are underweight. You should see your doctor."));
        }
        else if (BMI > 25)
        {
            System.out.println(String.format("You are overweight. You should see your doctor."));
        }
    }
}
