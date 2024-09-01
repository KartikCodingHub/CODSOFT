import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("\n---------HEY!! WELCOME TO THE NUMBER GAME---------\n");

        // Include scanner for taking input
        Scanner sc = new Scanner(System.in);

        // Enter details
        System.out.println("Enter the no of rounds ");
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            System.out.println("Enter the no of guesses");
            int t = sc.nextInt();
            System.out.println("You can guess only " + t + " times ");

            // Initialize
            int a = 0;

            // Game start
            for (int j = 0; j < t; j++) {
                System.out.println("\nEntered a guess no - ");
                a = sc.nextInt();
                System.out.println("Entered guess no is " + a);
                int b = ((int) (Math.random() * 100));
                System.out.println("Randomly generated no is " + b);

                // Checking the conditions
                if (a > b)
                    System.out.println("Entered no is too high then the randomly generated no.");
                else if (a == b)
                    System.out.println("Entered no is equal to random no");
                else
                    System.out.println("Entered no is too low then the randomly generated no.");
            }

            System.out.println("\nNext round");
        }
        // End
        System.out.println("-------Game over---------");

    }
}