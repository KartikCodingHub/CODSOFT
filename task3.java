import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("\n------REPRESENTING CURRENCY CONVERTER-------\n");

        // Include scanner for taking input
        Scanner sc = new Scanner(System.in);

        // Available currency
        System.out.println(" Available currecny options are are (INR,CAD,USD)");

        // Input the currency type from which you want to convert
        System.out.println("Enter the base currency : ");
        String basecurrency = sc.nextLine().toUpperCase();
        System.out.println(basecurrency);

        // Input the currency type to which you want to convert
        System.out.println("Enter the target currency : ");
        String targetcurrency = sc.nextLine().toUpperCase();
        System.out.println(targetcurrency);

        double exchangerate = 0;

        // Exchange rate of various currency
        if (basecurrency.equals("INR") && targetcurrency.equals("CAD")) {
            exchangerate = 0.016;
        } else if (basecurrency.equals("INR") && targetcurrency.equals("USD")) {
            exchangerate = 0.011;
        } else if (basecurrency.equals("USD") && targetcurrency.equals("INR")) {
            exchangerate = 83.91;
        } else if (basecurrency.equals("USD") && targetcurrency.equals("CAD")) {
            exchangerate = 1.34;
        } else if (basecurrency.equals("CAD") && targetcurrency.equals("INR")) {
            exchangerate = 62.18;
        } else if (basecurrency.equals("CAD") && targetcurrency.equals("USD")) {
            exchangerate = 0.74;
        } else {
            // If pair did not match
            System.out.println("UNSUPPORTED PAIR");
            return; // End the programm
        }
        // Input amount
        System.out.println("Enter base amount in : " + basecurrency);
        double amount = sc.nextDouble();

        // Performing Conversion
        double convertedAmount = amount * exchangerate;

        // Converted amount
        System.out.println("CONVERTED AMOUNT IN " + targetcurrency + " is : " + convertedAmount);
    }
}