package masterclass.java.udemy;

public class Main {

    public static void main(String[] args) {

        double result = toMilesPerHour(75.144);
        System.out.println(result);
        printConversion(67.99);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        double milesVal = 1.609;
        double result;

        if(kilometersPerHour >= 0) {
            result = kilometersPerHour / milesVal;
            return Math.round(result);
        } else {
            return -1;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        double milesPerHour;

        if(kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            milesPerHour = (toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + (int)milesPerHour + " mi/h");
        }
    }

}
