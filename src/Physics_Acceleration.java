
// The task is to build a program that prompts a user for start and end velocity, for an object and then make the -
//- program calculate the average acceleration of the object
import java.util.Scanner;


public class Physics_Acceleration {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        // I will built the program in 3 steps 1, 2 and three: prompting, calculation and then printing

        // 1) Prompting for information about the specific objects start and end velocity, and the duration of the event
        System.out.println(
                "Please, enter the values for start and end velocity");
        System.out.print(
                "Enter start velocity: ");
        double velocity0 = input.nextDouble();          // user enters the start velocity

        System.out.print(
                "Enter end velocity: ");
        double velocity1 = input.nextDouble();          // User enters the end velocity

        System.out.print(
                "Enter the duration(time): ");
        double time = input.nextDouble();               // User enters the duration

        // 2) Calculating the acceleration, from the velocity data
        double acceleration = (velocity0 - velocity1) / time;

        // 3) Printing out the result
        System.out.printf(
                "The average acceleration of an object at starting velocity: " + velocity0 + " and ending velocity: " +
                        velocity1 + " over the timespan of : " + time + " is: %4.2f", + acceleration);

    }
}
