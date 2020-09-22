package com.epam.fundamental;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class MainTask {
    //methods
    public static String GreetingUser(String name) {
        return ("Welcome " + name);
    }

    public static String Reverse(String[] args) {
        StringBuilder stringReverse = new StringBuilder();
        if (args.length == 0) args = new String[]{"Sag", "Ravi"};
        System.out.println(Arrays.asList(args));
        for (int i = args.length - 1; i >= 0; i--) {
            for (int j = args[i].length() - 1; j >= 0; j--) {
                stringReverse.append(args[i].charAt(j));
            }
            stringReverse.append(" ");
        }
        return stringReverse.toString().trim();
    }

    public static int[] RandomNumbers(int count) {
        Random objGenerator = new Random();
        int[] randomList = new int[count];
        for (int i = 0; i < count; i++) {
            randomList[i] = objGenerator.nextInt(10);
        }
        return randomList;
    }

    public static String getMonthName(int monthNumber) {
        String MonthOfName;
        switch (monthNumber) {
            case 1:
                MonthOfName = "January";
                break;
            case 2:
                MonthOfName = "February";
                break;
            case 3:
                MonthOfName = "March";
                break;
            case 4:
                MonthOfName = "April";
                break;
            case 5:
                MonthOfName = "May";
                break;
            case 6:
                MonthOfName = "June";
                break;
            case 7:
                MonthOfName = "July";
                break;
            case 8:
                MonthOfName = "August";
                break;
            case 9:
                MonthOfName = "September";
                break;
            case 10:
                MonthOfName = "October";
                ;
                break;
            case 11:
                MonthOfName = "November";
                break;
            case 12:
                MonthOfName = "December";
                break;
            default:
                MonthOfName = "Invalid month";
                break;
        }
        return MonthOfName;
    }

    /*public static String getMonthName1(int monthNumber) {
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec"};
        if (monthNumber >= 1 && monthNumber <= 12)
            return months[monthNumber - 1];
        else
            return "Invalid Month";
    }*/

    public static int SumOfNumbers(String[] args) {
        int sum = 0;
        for (String s : args) {
            int value = tryParse(s);
            if (value > 0) {
                sum += value;
            }
        }
        return sum;
    }

    public static int tryParse(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Java Fundamentals Main Programs.");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println(GreetingUser(name));
        System.out.println();

        System.out.println(Reverse(args));
        /*output:
        [Sagarika, Ravi, 20, 30, Prateek, 5]
        5 keetarP 03 02 ivaR akiragaS*/

        //  Print a given number of random numbers with and without a jump to a new line
        System.out.println("\nPrint random numbers");
        int[] res = RandomNumbers(5);
        for (int i : res) {
            System.out.print(i + " ");
        }
        /*output: 9 6 3 2 7 */

        //  Enter integers as command line arguments, calculate their sum (product) and print the result to the console.
        int sum = SumOfNumbers(args);
        System.out.println("\n\nSum of numbers: " + sum);
        /*output: Sum of numbers: 55 */

        // Enter a number from 1 to 12. Output to the console the name of the month corresponding to the given date. Check the correctness of entering numbers.

        int monthNumber;
        System.out.print("Enter month's number: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter valid number: ");
            scanner.next(); // this is important as it allows to enter again.
        }
        monthNumber = scanner.nextInt();

        System.out.println("\nPrint month for: " + monthNumber);
        String MonthOfName = getMonthName(monthNumber);
        System.out.println("Month Name: " + MonthOfName);
        /*output: Month Name: <> */

        //System.out.println(getMonthName1(monthNumber));
    }
}