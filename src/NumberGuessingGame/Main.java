package NumberGuessingGame;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int generated_number = (int)(Math.random() * 100) + 0;
        int count = 1;

        while (true){
            System.out.println("Enter your guess: ");
            int guess_number = scanner.nextInt();

            if (generated_number == guess_number){
                count++;
                System.out.println("Well Done. Your number of guesses " + count);
                break;
            }else if (generated_number > guess_number){
                count++;
                System.out.println("Little bit higher");
            }else if (generated_number < guess_number){
                count++;
                System.out.println("Little bit lower");
            }else {
                count++;
                System.out.println("Enter a valid number: ");
            }
        }
    }
}