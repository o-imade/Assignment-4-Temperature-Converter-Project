// File: TemperatureConverter.java
// Description: A temperature converter that converts into different temperature using formulas.
// Date: [11/15/2025]

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConverter
{
    //these values are the options that the user types to select the type of conversion they would like to make
    private static final int optionConvertToFahrenheit = 1; //Celsius to Fahrenheit
    private static final int optionConvertToCelsius = 2; //Fahrenheit to Celsius
    private static final int optionConvertToKelvin = 3; //Celsius to Kelvin
    private static final int optionExit = 4; //Exit the loop

    /**
     *This public method will convert Celsius to Fahrenheit
     * @param celsius - The temperature in Celsius
     * @return a double representing Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius)
    {
        return celsius * 9/5 + 32;
    }

    /**
     *This public method will convert Fahrenheit to Celsius
     * @param fahrenheit - The temperature in Fahrenheit
     * @return a double representing Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit)
    {
        return (fahrenheit - 32) * 5/9;
    }

    /**
     *This public method will convert Celsius to Kelvin
     * @param celsius - The temperature in Celsius
     * @return a double representing Kelvin
     */
    public static double celsiusToKelvin(double celsius)
    {
        return celsius + 273.15;
    }

    /**
     *This public method will print out a block of
     * information prompting the user for input
     */
    public static void instructionMessage()
    {
        System.out.println("[" + optionConvertToFahrenheit + "] Convert Celsius to Fahrenheit" +
                           "\n[" + optionConvertToCelsius + "] convert Fahrenheit to Celsius" +
                           "\n[" + optionConvertToKelvin + "] convert Celsius to Kelvin" +
                           "\n[" + optionExit + "] Exit");
    }

    /**
     *This is the main method used to run our "app" it holds
     * the main logic to make calls to the following methods:
     * celsiusToFahrenheit()
     * fahrenheitToCelsius()
     * celsiusToKelvin()
     * instructionMessage()
     */
    public static void main(String[] args)
    {
        //this is a Scanner object that allows us to grab the users input form the standard input stream
        Scanner user_input = new Scanner(System.in);

        //This is a textblock string that tells the user what type of app this is and how to use it
        System.out.println("""
                Welcome to the temperature converter app.
                Type one of the following numbers to select your calculator.
                """);

        //this integer will represent the users input from the scanner object user_input
        int userChoice = 0;

        while(!(userChoice == optionExit)) //if the users choice does not equal the exit option
        {
            try
            {
                instructionMessage(); //print the key to prompt users input

                userChoice = user_input.nextInt(); //wait till the user types a number

                //this switch statement matches the users input to the conversion or exit method
                switch(userChoice)
                {
                    case optionConvertToFahrenheit:
                        System.out.print("\nCelsius: "); //prompt the user to input a temperature in Celsius
                        System.out.println("Fahrenheit: " + celsiusToFahrenheit(user_input.nextDouble()) + "\n"); //Convert Celsius to Fahrenheit
                        break;
                    case optionConvertToCelsius:
                        System.out.print("\nFahrenheit: "); //prompt the user to input a temperature in Fahrenheit
                        System.out.println("Celsius: " + fahrenheitToCelsius(user_input.nextDouble()) + "\n"); //Convert Fahrenheit to Celsius
                        break;
                    case optionConvertToKelvin:
                        System.out.print("\nCelsius: "); //prompt the user to input a temperature in Celsius
                        System.out.println("Kelvin: " + celsiusToKelvin(user_input.nextDouble()) + "\n"); //Convert Celsius to Kelvin
                        break;
                    default:
                        if (userChoice != optionExit) //if the user wants to exit the program loop do not print Invalid input
                            System.out.println("\nInvalid input\n"); //if the user types a number that is not any of the selections print this message
                        break;
                }
            }
            catch (InputMismatchException e) //if the user tries to use a letter or symbol instead of a number it will cause the exception InputMismatch
            {
                System.out.println("\nInvalid input\n"); //if the user types a letter or symbol that is not a number
                user_input.next(); //prompt for input so we do have an infinite Loop
                userChoice = 0; //reset the users choice
            }
        }

        System.out.println("\nGood bye!"); //if the user has exited the loop print this message
        user_input.close(); //release the input stream
    }

}
