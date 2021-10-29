import java.util.Scanner;

public class Food_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello!!");
    	System.out.println();
    	System.out.println();
    	
    	System.out.println("Welcome to McDonalds!");
    	System.out.println();
    	
    	System.out.print("What's your name? ");
    	String name = input.nextLine();
    	
    	
    	System.out.println("Hello " + name +", Let me take your order");
    	System.out.println();
    	
    	
    	System.out.println("--------------------<MENU>--------------------");
    	System.out.println("|                 MAINDISHES:                |");
    	System.out.println("|  1    1pc Chicken with rice        $4      |");
    	System.out.println("|       (Original Flavor)                    |");
    	System.out.println("|  2    2pc Chicken with rice        $6      |");
    	System.out.println("|       (Original Flavor)                    |");
    	System.out.println("|  3    1pc Chicken with rice        $5      |");
    	System.out.println("|       (American Flavor)                    |");
	System.out.println("|                                            |");
    	System.out.println("|                                            |");
    	System.out.println("|                 BEVERAGES:                 |");
    	System.out.println("|  1    Coca Cola                    $1      |");
    	System.out.println("|  2    Pepsi                        $1      |");
    	System.out.println("|  3    Coke Zero                    $1      |");
    	System.out.println("|  4    Water                        $0      |");
    	System.out.println("----------------------------------------------");
    	
    
    	System.out.println();
    	
    	System.out.println("Press the corresponding number for your order(ex. 1 for chicken with rice)");
    	System.out.print("What's for your maindish? ");
    	int maindish = input.nextInt();
    	
    	System.out.print("How many? ");
    	int maindish_count = input.nextInt();
    	int dish_total = 0;
		int dish_subtol = 0;
		
    	String maindish_final = null;
    	if(maindish == 1) {
    		maindish_final = "1pc Chicken with rice(Original Flavor)";
    		dish_subtol = 4;
    	}else if(maindish == 2) {
    		maindish_final = "2pc Chicken with rice(Original Flavor)";
    		dish_subtol = 6;
    	}else if(maindish == 3){
    		maindish_final = "1pc Chicken with rice(American Flavor)";
    		dish_subtol = 5;
    	}
    	System.out.println();
    	
    	System.out.print(maindish_count);
    	System.out.println(" " + maindish_final);
  
    	System.out.println();
    	System.out.println("uhmm..");
    	System.out.println("then how about the beverages?");
    	System.out.println("Press the corresponding number for your order(ex. 1 coca cola)");
    	int beverage = input.nextInt();
    	int beve_total = 0;
    	int beve_subtol = 0;
    	String beve_final= null;
    	
    	if(beverage == 1){ 
    		beve_final = "Coca Cola";
    		beve_subtol = 1;
    	}else if(beverage == 2){
    		beve_final = "Pepsi";
    		beve_subtol = 1;
    	}else if(beverage == 3){
    		beve_final = "Coke Zero";
    		beve_subtol = 1;
    	}else if(beverage == 4){
    		beve_final = "Water";
    		beve_subtol = 0;
    	}
    	System.out.print("How many? ");
    	int beve_count = input.nextInt();
    	
    	
    	System.out.println();
    	
    	System.out.println("Your order are:");
    	System.out.print(maindish_count);
    	System.out.println(" " + maindish_final);
    	
    	System.out.println();
    	
    	System.out.print(beve_count);
    	System.out.println(" " + beve_final);
    	
    	dish_total = dish_subtol * maindish_count;
    	beve_total = beve_subtol * beve_count;
    	
    	System.out.println();
    	System.out.print("The Total: $");
    	System.out.println(dish_total + beve_total);
    	
    	System.out.println("Thank you for ordering, sit down and wait for your order :)");
    }
}
