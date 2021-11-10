import java.util.Scanner; //import library for user input

public class Food_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //declare variable for Scanner
        System.out.println("Hello!!"); //display greetings
    	System.out.println(); 
    	System.out.println();
    	
    	System.out.println("Welcome to Los Pollos Hermanos!"); 
    	System.out.println();
    	
    	System.out.print("What's your name? "); // ask the user their name
    	String name = input.nextLine(); // store the name of the user in a var
    	
    	
    	System.out.println("Hello " + name +", Let me take your order"); //greetings with concatenation
    	System.out.println();
    	
    	//print the menu 
    	System.out.println("--------------------<MENU>--------------------");
    	System.out.println("|                 MAINDISHES:                |");
    	System.out.println("|  1    1pc Chicken with rice        ₱95     |");
    	System.out.println("|       (Original Flavor)                    |");
    	System.out.println("|  2    2pc Chicken with rice        ₱115    |");
    	System.out.println("|       (Original Flavor)                    |");
    	System.out.println("|  3    1pc Chicken with rice        ₱105    |");
    	System.out.println("|       (American Flavor)                    |");
	System.out.println("|  4    Bucket Meal (6pc Chicken     ₱245    |");
    	System.out.println("|       With 6 Rice)                         |");
    	System.out.println("|  5    2pc Chicken with Rice        ₱108    |");
    	System.out.println("|       (Korean Spicy Flavor)                |");
    	System.out.println("|                                            |");
    	System.out.println("|                 BEVERAGES:                 |");
    	System.out.println("|  1    Coca Cola                    ₱25     |");
    	System.out.println("|  2    Pepsi                        ₱25     |");
    	System.out.println("|  3    Sprite                       ₱20     |");
    	System.out.println("|  4    Water                        ₱0      |");
    	System.out.println("|  5    Ice Tea                      ₱15     |");
    	System.out.println("----------------------------------------------\n");
    	
	int dish_total = 0; //var for total cost in maindish
	int dish_subtol = 0; // var for cost of a meal
	boolean boolmain = true; //var for the while loop
	String maindish_final = null; //var for the maindish pick by user
	int maindish_count = 0; //var for how many maindish user want

	//while loop for maindish
	while (boolmain) {
		//guide for picking the maindish
		System.out.println("Press the corresponding number for your order(ex. 1 for chicken with rice)");
		System.out.print("What's for your maindish? "); //ask the user the maindish
		int maindish = input.nextInt(); //store the dish pick by user

		System.out.print("How many? "); // ask the user how many he/she want
		maindish_count = input.nextInt(); //store the inpute of how many
		//if else statement for assigning the value for maindish_final and dish_subtotal
		if (maindish == 1) { //for number 1 in the menu
			maindish_final = "1pc Chicken with rice(Original Flavor)";
			dish_subtol = 95;
		} else if (maindish == 2) { //for number 2 in the menu
			maindish_final = "2pc Chicken with rice(Original Flavor)";
			dish_subtol = 115;
		} else if (maindish == 3) { //for number 3 in the menu
			maindish_final = "1pc Chicken with rice(American Flavor)";
			dish_subtol = 105;
		}else if(maindish == 4){ //for number 4 in the menu
			maindish_final = "Bucket Meal (6 pc Chicken  with 6pc Rice)";
			dish_subtol = 245;
		}else if(maindish == 5){ //for the number 5 in the menu
			maindish_final = "2pc Chicken with Rice (Korean Spicy Flavor)";
			dish_subtol = 108;
		} else {
			System.out.println("Invalid Input Please try again!\n");//if the user input randomly
			continue;//the loop will restart
		}
		System.out.println();
		//display the order of the user in maindish
		System.out.print(maindish_count); 
		System.out.println(" " + maindish_final);
		System.out.println(); 
		
		// ask the user if they will change their mind or nah
		System.out.print("Are you sure about your order? ");
		String validmain = input.next(); //store the input of yes or no
		
		System.out.println(); //if else statement if they will continue to beve or stay in maindish
		if (validmain.equalsIgnoreCase("yes")) {
			boolmain = false; //if the user input yes they will exit the while loop
		} else if (validmain.equalsIgnoreCase("no")) {
			boolmain = true; //if the the usre input no, the loop will be repeated
		} else {
			System.out.println("Invalid Input Please try again!\n");//if the user input randomly
			continue; //the loop will restart
		}
	}
		
	int beve_total = 0; // var for total cost in beverage
	int beve_subtol = 0; // var for cost of beverage pick by user
	String beve_final= null; // var for the beverage pick by user
	boolean boolbev = true; // var for the beverage while loop
	int beve_count = 0; // var for how many beve for the pick of user
	//while loop for the beverage
	while (boolbev) {
		System.out.println();
		System.out.println("What's for your beverages?"); //ask the user what beve they want
		System.out.println("Press the corresponding number for your order(ex. 1 coca cola)"); //guide in picking
		int beverage = input.nextInt(); //store the beve they want

		//if else statement for assigning value for the beve_final ad beve_subtotal
		if (beverage == 1) { //for the number 1 in the menu
			beve_final = "Coca Cola";
			beve_subtol = 25;
		} else if (beverage == 2) { //for the number 2 in the menu
			beve_final = "Pepsi";
			beve_subtol = 25;
		} else if (beverage == 3) { //for the number 3 in the menu
			beve_final = "Sprite";
			beve_subtol = 20;
		} else if (beverage == 4) { //for the number 4 in the menu
			beve_final = "Water";
			beve_subtol = 0;
		}else if (beverage == 5) { //for the number 5 in the menu
			beve_final = "Ice Tea";
			beve_subtol = 15;
		} else {
			System.out.println("Invalid Input Please try again!"); //if the user input randomly
			continue; //the loop will restart
		}
		System.out.print("How many? "); //asl the user how many beve they want
		beve_count = input.nextInt(); //store the number of beve want

		System.out.println();
		//display the order for beve
		System.out.print(beve_count);
		System.out.println(" " + beve_final);

		System.out.print("Are you sure about your order? "); //ask the user if they are sure 
		String validbev = input.next(); //store the input for yes or no

		if (validbev.equalsIgnoreCase("yes")) { //if yes the loop will not run
			boolbev = false;
		} else if (validbev.equalsIgnoreCase("no")) { //if no the loop will restart
			boolbev = true;
		} else {
			System.out.println("Invalid Input Please Try again!\n"); //if the user input randomly
		 	continue; //the loop will restart
		}
	}
	System.out.println();
    	//summarize the order
	System.out.println("Your order are:");
	System.out.print(maindish_count); //for maindish
	System.out.println(" " + maindish_final);
	System.out.println();
	System.out.print(beve_count); //for beverage
	System.out.println(" " + beve_final +"\n");
	//compute the total and store it in the variable
    	dish_total = dish_subtol * maindish_count; //for main
    	beve_total = beve_subtol * beve_count; //for beve
    	
    	System.out.println(); //print out the total of all order
    	System.out.print("The Total: ₱");
    	System.out.println(dish_total + beve_total  + "\n");
    	//greetings for the ending of program
    	System.out.println("Thank you for ordering, sit down and wait for your order :)");
    }
}
