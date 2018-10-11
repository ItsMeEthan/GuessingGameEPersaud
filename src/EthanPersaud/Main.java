package EthanPersaud;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int secretNumber;
        secretNumber = (15);
        Scanner input=new Scanner(System.in);
        System.out.println("Hello Try and guess my number fool!");
        int guess= input.nextInt();
        while(guess != secretNumber)
        {
            if(guess==secretNumber)
            {
                System.out.println("you got it right the answer is:"+ secretNumber);
            }
            else{
                System.out.println("Oh that is not right try again :3");
                input.nextInt();
            }
        }
    }

    public static void secondMain(String[] args){
        int secretNumber;
        secretNumber = (int) (Math.random() * 999 + 1);
        Scanner keyboard = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter a guess (1-1000): ");
            guess = keyboard.nextInt();
            if (guess == secretNumber)
                System.out.println("Your guess is correct. Congratulations!");
            else if (guess < secretNumber)
                System.out.println("Your guess is smaller than the secret number.");
            else if (guess > secretNumber)
                System.out.println("Your guess is greater than the secret number.");
        } while (guess != secretNumber);
    }
}
