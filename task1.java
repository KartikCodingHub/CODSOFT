import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("\nHey!! Welcome to the Guessing Game");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rounds ");
        int rounds = sc.nextInt();
        for (int i = 0; i < rounds; i++) {
            System.out.println("enter the no of guesses");
            int t = sc.nextInt();
            System.out.println("you can guess only " + t + " times ");
            int a = 0;

            for (int j = 0; j < t; j++) {
                System.out.println("\nentered a guess no - ");
                a = sc.nextInt();
                System.out.println("entered guess no is " + a);
                int b = ((int) (Math.random() * 100));
                System.out.println("randomly generated no is " + b);
                if (a > b)
                    System.out.println("entered no is too high");
                else if (a == b)
                    System.out.println("entered no is equal to random no");
                else
                    System.out.println("entered no is too low");
            }

            System.out.println("\nnext round");
        }

        System.out.println("game over");

    }
}