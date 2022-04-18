package password_maker;

import java.util.*;


public class password_maker {
    static Scanner input = new Scanner(System.in);
    static int length;
    static Random rand = new Random();
    static boolean valid;
    static String pass = "";
    public static void main(String[] args) throws InterruptedException {
        System.out.println("<===========PASSWORD MAKER===========>\n");
        valid = true;
        while (valid) {
            Question();
            if (length == 0) {
                valid = false;
                System.out.println("Gansahamnida!!");
                break;
            }
            System.out.println("Making the Password..........\n");
            Thread.sleep(10000);
            System.out.println();
            String password = PassGenerator(length);
            System.out.println("===============================");
            System.out.println("This is your Password : " + password);
            System.out.println();
        }
    }
    
    static void Question() {
        System.out.println();
        System.out.println("Type '0' to End the Program!");
        System.out.print("Enter the Length of your Passwors : ");
        length = input.nextInt();
    }

    static String PassGenerator(int leng) {
        char[] lowercase = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        char[] uppercase = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R'
                , 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
        char[] symbols = { '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '_', '-', '?', '<', '>', '=' };
        for (int i = 0; i < leng; i++) {
            int categ = rand.nextInt(2);
            if (categ == 0) {
                pass += String.valueOf(lowercase[rand.nextInt(lowercase.length)]);
            } else if (categ == 1) {
                pass += String.valueOf(uppercase[rand.nextInt(uppercase.length)]);
            } else if (categ == 2) {
                pass += String.valueOf(symbols[rand.nextInt(symbols.length)]);
            }
        }
        return pass;
    }
}
