import java.util.Random;
import java.util.Scanner;
public class Num_Guessing_Game {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);

        int random_num = rand.nextInt(100);
        
        System.out.println("Random Number Guessing Game!");
        int lives = 9;

        for (int i = 0; i <= lives; i++) { // (0,9) (1,8) (2,7) (3,6) (4,5)
            System.out.println("Guess the number from 0 to 100!");
            System.out.println("You have 5 lives");
            System.out.print("Enter your Guess : ");
            int guess = input.nextInt();

            if (guess == random_num) {
                System.out.println("Great!! you have guess the number!");
                break;
            } else if (guess < random_num) {
                System.out.println("Your guess is too low");
                System.out.println();
                lives--;
            } else if (guess > random_num) {
                System.out.println("Your guess is too high");
                System.out.println();
                lives--;
            }
            if (lives == 4) {
                System.out.println("Oops! Game Over, you have use all your lives!");
                break;
            }
        }

    }   
}
