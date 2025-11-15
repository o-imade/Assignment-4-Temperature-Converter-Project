package com.example;

import java.util.Scanner;

public class Main {


    private static final int OPTION_CELSIUS_TO_FAHRENHEIT = 1;
    private static final int OPTION_FAHRENHEIT_TO_CELSIUS = 2;
    private static final int OPTION_CELSIUS_TO_KELVIN = 3;
    private static final int OPTION_EXIT = 4;



    // Converts Celsius to Fahrenheit: F = (C × 9/5) + 32
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    // Converts Fahrenheit to Celsius: C = (F − 32) × 5/9
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Converts Celsius to Kelvin: K = C + 273.15
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    //methods for clean I/O =====

    // Print the menu
    private static void printMenu() {
        System.out.println("====== Temperature Converter ======");
        System.out.println("1 - Convert Celsius to Fahrenheit");
        System.out.println("2 - Convert Fahrenheit to Celsius");
        System.out.println("3 - Convert Celsius to Kelvin");
        System.out.println("4 - Exit");
    }

    // Read a valid menu choice (1–4) with validation
    private static int readMenuChoice(Scanner scanner) {
        while (true) {
            System.out.print("Please enter your choice (1-4): ");

            if (!scanner.hasNextInt()) {
                String invalid = scanner.next(); // consume invalid token
                System.out.println("Invalid input: \"" + invalid
                        + "\". Please enter a number between 1 and 4.");
                continue;
            }

            int choice = scanner.nextInt();
            if (choice < OPTION_CELSIUS_TO_FAHRENHEIT || choice > OPTION_EXIT) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                continue;
            }

            return choice;
        }
    }

    // Read a valid temperature (double) with validation
    private static double readTemperature(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);

            if (!scanner.hasNextDouble()) {
                String invalid = scanner.next(); // consume invalid token
                System.out.println("Invalid temperature value: \"" + invalid
                        + "\". Please enter a numeric value.");
                continue;
            }

            return scanner.nextDouble();
        }
    }

    // Main loop programe
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! Temperature Conversion App");

        while (true) {
            printMenu();
            int choice = readMenuChoice(scanner);

            switch (choice) {
                case OPTION_CELSIUS_TO_FAHRENHEIT: {
                    double celsius = readTemperature(scanner, "Enter temperature in Celsius: ");
                    double result = celsiusToFahrenheit(celsius);
                    System.out.println("Result: " + result);
                    break;
                }
                case OPTION_FAHRENHEIT_TO_CELSIUS: {
                    double fahrenheit = readTemperature(scanner, "Enter temperature in Fahrenheit: ");
                    double result = fahrenheitToCelsius(fahrenheit);
                    System.out.println("Result: " + result);
                    break;
                }
                case OPTION_CELSIUS_TO_KELVIN: {
                    double celsius = readTemperature(scanner, "Enter temperature in Celsius: ");
                    double result = celsiusToKelvin(celsius);
                    System.out.println("Result: " + result);
                    break;
                }
                case OPTION_EXIT: {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                }
            }
        }
    }
}
