package com.pluralsight;

import java.util.Scanner;

public class QuotesApp {
    public static void main(String[] args) {
        String[] quotes = {"Take me as I am", "Dare to be different", "Just do it", "All or nothing", "Go big or go home", "Do unto others as to yourself", "Stop judging", "Don't sweat the small stuff", "Don't dump the baby out with the bathwater", "Still water runs deep"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please give a number from 1-10 for a quote: ");
        int quotePick = scanner.nextInt();

        switch (quotePick) {
            case 1:
                System.out.println(quotes[0]);
                break;
            case 2:
                System.out.println(quotes[1]);
                break;
            case 3:
                System.out.println(quotes[2]);
                break;
            case 4:
                System.out.println(quotes[3]);
                break;
            case 5:
                System.out.println(quotes[4]);
                break;
            case 6:
                System.out.println(quotes[5]);
                break;
            case 7:
                System.out.println(quotes[6]);
                break;
            case 8:
                System.out.println(quotes[7]);
                break;
            case 9:
                System.out.println(quotes[8]);
                break;
            case 10:
                System.out.println(quotes[9]);
                break;
            default:
                System.out.println("Invalid input");

        }
    }
}
