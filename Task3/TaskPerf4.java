package Task3;
// import necessary library
import java.util.Scanner;

import javax.management.remote.rmi.RMIJRMPServerImpl;
// clas TaskPerf4 inherited Employee class
public class TaskPerf4 extends Employee {
    static Scanner input = new Scanner(System.in); //Object for Scanner
    static TaskPerf4 main = new TaskPerf4(); // Object for main class
    static boolean run = true; // bool variable for while loop
    static String PartPF; // String for the user input in Part Time or Full Time
    static boolean verifyUser; // bool for verifying if the user inputted F or P
    static String name; // var for user name

    public static void main(String[] args) throws InterruptedException { // InterruptedException cause I'm interrupting the flow of code
        System.out.println("===============================================");
        System.out.println("<-----------<<< PAYROLL PROGRAM >>>----------->");// program title
        System.out.println("===============================================\n");

        System.out.println("Type 'exit' to end the program"); // instruction
        while (run) { // loop for users of they want to use it again
            main.questions(); // call the method questions to print the question
            main.verify(PartPF);// call verify method to know if the user inputted the right input and call the other method

            if (verifyUser == false) { // if statement. if user inputted wrong
                continue; // continue to skip a loop in the program
            }


        }
    }

    public void questions(){ // questions method
        boolean loop; // bool for do while loop
        do { //do while loop and try catch for checking if the user inputted a string
            try {
                System.out.print("Enter your name: ");
                name = input.nextLine();
                Integer.valueOf(name); //converting input to int
                loop = true; // if user input a integer the loop will repeat
            }catch (NumberFormatException ex){ // this catch will run if the user input a string
                setName(name); // setting the value of name in setname
                loop = false; // breaking out of loop
            }
        }while (loop);
        if (name.equalsIgnoreCase("exit")) { //if statement in ending the program
            System.out.println("\n*************");
            System.out.println(" Thank You!");//greetings
            System.out.println("*************\n\n");
            System.exit(0);// exit method for stopping the program and 0 for terminating successfully without error
        }
        System.out.println();
        System.out.print("Press F for Full Time or P for Part Time: "); // asking user for F and P
        PartPF = input.nextLine(); // storing thr value in PartPF
        System.out.println();

    }
    public void verify(String pick) throws InterruptedException { //verifying method
        if (pick.equalsIgnoreCase("P")) { // if statement for P
            questionsForP(); // call the method for P
            verifyUser = true; // assign true for verify user for the if statement in the while loop
        } else if (pick.equalsIgnoreCase("F")) { // for F
            questionsForF(); // method for F
            verifyUser = true;
        }else { // code if the input is invalid
            verifyUser = false; // false to the if statement in while loop
            System.out.println("Invalid Input"); //error msg
            System.out.println("Try Again");
        }

    }

    public void questionsForP() throws InterruptedException{ //questions for P
        String[] partTime; // array to store input
        boolean loop = true; // bool for loop
        while (loop){
            try { //try and catch for exception
                System.out.print("Enter the rate per hour and\nno. of hours worked separated by space: ");
                String x = input.nextLine(); //store the input
                partTime = x.split(" "); // split the input and store it in partTime
                P.ratePerHour = Double.parseDouble(partTime[0]); //convert the elements in array
                P.hoursWorked = Integer.parseInt(partTime[1]);
                loop=false;// stop the loop
            }catch (NumberFormatException ex){// if the user input a different type
                System.out.println("Invalid Input, Try Again");
                System.out.println();
                loop = true; // keep the loop running
            }
        }
        ComputeWage(P.ratePerHour, P.hoursWorked); //call the compute method and put a parameter of the values
        System.out.println("Computing, Please wait......");
        Thread.sleep(10000); //pause 10sec
        System.out.println();  // print the output and the wage
        System.out.println("==========================");
        System.out.println("Here is the Result");
        System.out.println("Name: " + getName()); //name of user
        System.out.println("Wage: " + Math.round(P.getWage()*100)/100.0); //wage of user but round off to 2 decimal point
        System.out.println("==========================");
        System.out.println();
        Thread.sleep(2000); //pause 2sec
        System.out.println("Type 'exit' to end the program"); // instruction
        System.out.println("\nAnother Transaction");
    }
    public void questionsForF() throws InterruptedException { //quesions for F
        boolean loop = true;
        while (loop) { //loop for try and catch
            try {
                System.out.print("Enter your monthly Salary: "); //ask the user for salary
                F.setmonthlySalary(Double.parseDouble(input.nextLine())); //convert and store the input
                loop = false; // stop the loop
            } catch (NumberFormatException ex) { // exception if the user input different type
                System.out.println("Invalid Input, Try Again\nPlease Enter salary in decimal Format");
                System.out.println();
                loop = true; // keep the loop running
            }
        }
        System.out.println("Computing, Please wait......");
        Thread.sleep(10000); // pause 10sec
        System.out.println();
        System.out.println("======================");
        System.out.println("Here is the Result");
        System.out.println("Name: " + getName()); //print summary
        System.out.println("Monthly Salary: " + Math.round(F.getmonthlySalary()*100)/100.0); //print salary in 2 decimal point
        System.out.println("======================");
        System.out.println();
        Thread.sleep(2000); //pause 2 sec
        System.out.println("Type 'exit' to end the program"); // instruction
        System.out.println("\nAnother Transaction");
    }

    public void ComputeWage(double x, int y){ //method for computing the wage
        double result = x * y; // multiplying the rate and hours of worked

        P.setWage(result); // setting the value of wage
    }
}

