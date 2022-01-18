import java.util.Scanner;

public class Calculator {
    static String op = "";
    static double num1 = 0;
    static double num2 = 0;
    static double all = 0.0;
    static void print(double num) {
        System.out.println(num);
    }
    static void print(String word) {
        System.out.print(word);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        solve comp = new solve();
        print("-------CALCULATOR-------\n");

        print("Enter the First Number           : ");
        num1 = input.nextInt();
    
        print("Enter the Operation (+, -, x, /) : ");
        op = input.next();
    
        print("Enter the Second Number          : ");
        num2 = input.nextInt();
        System.out.println();
        double result = comp.compute(num1, op, num2);
        print("The Answer is: ");
        print(result);
    }
    
    
}
