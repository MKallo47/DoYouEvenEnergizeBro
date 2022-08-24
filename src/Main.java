import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println ("How many exercises will you be completing?");
        int numberOfExercises = scanner.nextInt();
        double totalJoules = 0;

        for (int i=1; i<=numberOfExercises; ++i) {
            System.out.println("How much weight will you be lifting for exercise " + i + "?");
            double weight = scanner.nextDouble();
            double weightInKilos = weight * 0.453592;
            System.out.println("What distance will the weight travel each rep during your exercise?");
            double distance = scanner.nextDouble();
            double distanceInMeters = distance * 0.3048;
            double velocity = 9.8;
            System.out.println("How many reps did you complete in this exercise?");
            int reps = scanner.nextInt();
            double exerciseJoules = weightInKilos * distanceInMeters * velocity * reps;
            System.out.println("For Exercise " + i + " you generated " + exerciseJoules + " joules");
            totalJoules += exerciseJoules;
            System.out.println(" ");
        }

        double wattSeconds = totalJoules;
        double wattHour = wattSeconds / 3600;
        double kiloWattHour = wattHour / 1000;
        double calories = totalJoules / 4184;
        System.out.println("In total you generated " + totalJoules + " joules or " + wattHour + " watt-hours or " + kiloWattHour + "kwh");
        System.out.println("You also burned " + calories + " calories.");
        if (kiloWattHour >= 65) {
            System.out.println("With that energy you could power your house for a day in the summer!");
        } else if (kiloWattHour < 65 && kiloWattHour >=50) {
            System.out.println("With that energy you could power your house for an average day!");
        } else if (kiloWattHour < 50 && kiloWattHour >= 30) {
            System.out.println("With that energy you could power your house for a day in winter!");
        } else if (kiloWattHour < 30 && kiloWattHour >= 10) {
            System.out.println("With that energy you could power some of your house for less than a day!");
        } else if (kiloWattHour < 10 && kiloWattHour > 1) {
            System.out.println("With that energy you could power a major appliance like a dishwasher or washing machine for a load or two!");
        } else if (kiloWattHour <= 1 && kiloWattHour > 0.1) {
            System.out.println("With that energy you could power your TV for a few hours!");
        } else {
            System.out.println("With that energy you could power a light bulb for an hour or less... do you even energize bro?");
        }

        scanner.close();
    }
}
