import java.util.Scanner;
public class Hands_on_05_activity1_lorenzo_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = input.nextInt();

        if (num1 == num2) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }
        else if(num1 != num2) {
            System.out.println(num1 + " and " + num2 + " are not equal.");
        }
    }
}
