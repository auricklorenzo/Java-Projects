package ils2;

//Scanner for user input
import java.util.Scanner;

//Area_Solver Inherits the Compute class so that it can access the objects of the shapes.
public class Area_Solver extends Compute{
    //static so that it can access everywhere
    //objects for the classes
    static Scanner input = new Scanner(System.in);
    static Vars v = new Vars();
    static Area_Solver d = new Area_Solver();
    //boolean for the while loop
    static boolean valid = true;

    //the 'throws InterruptedExcerption' was use because I'm interrupting the flow of the code
    //due to the delay using 'Thread.sleep()'
    public static void main(String[] args) throws InterruptedException {
        //array for the shapes.
        String[] shapes = {"A. Circle", "B. Triangle", "C. Square","D. Rectangle","E. Trapezoid","F. Cylinder"};
        System.out.println("<---------- AREA SOLVER ---------->\n");

        //while loop for the repetition of the program
        while (valid){
            //wait for 5 seconds
            Thread.sleep(5000);
            //print out the array
            for (String x:shapes) {
                System.out.println(x);
            }
            //for exiting the program
            System.out.println("Type 'exit' to close the Program :)\n");
            //method in asking what shape
            question();

            System.out.println();
            System.out.println("===================================================\n");
            //the chosen shape is put in the parameter of Identify_Shape method.
            Identify_Shape(v.getshape());

        }

    }
    //method for the what shape ques
    static void question(){
        System.out.print("Enter the letter of the Chosen Shape : ");
        v.setShape(input.next());
    }


    //method for identifying what is the shape and calling out the method for each shape
    //every shape has a 10 sec waiting except cylinder
    //each shape printed out the formula
    static void Identify_Shape(String a) throws InterruptedException {
        if (a.equalsIgnoreCase("A")){ //for Circle
            circle_q();
            d.circle.Formula();
            d.circle.Solving();
            Thread.sleep(10000);
            System.out.println("Area of the Circle is " + d.circle.Answer(v.getR()));
            System.out.println();
        }else if(a.equalsIgnoreCase("B")){ //for Triangle
            triangle_q();
            d.triangle.Formula();
            d.triangle.Solving();
            Thread.sleep(10000);
            System.out.println("Area of the Triangle is " + d.triangle.Answer(v.getbase_T(), v.getHeight_T()));
            System.out.println();
        }else if(a.equalsIgnoreCase("C")){//for square
            square_q();
            d.square.Formula();
            d.square.Solving();
            Thread.sleep(10000);
            System.out.println("Area of the Square is " + d.square.Answer(v.getSide()));
            System.out.println();
        }else if (a.equalsIgnoreCase("D")){//for rectangle
            rectangle_q();
            d.rectangle.Formula();
            d.rectangle.Solving();
            Thread.sleep(10000);
            System.out.println("Area of the Rectangle is " + d.rectangle.Answer(v.getLength(), v.getWidth()));
            System.out.println();
        }else if (a.equalsIgnoreCase("E")){//for trapezoid
            trapezoid_q();
            d.trapezoid.Formula();
            d.trapezoid.Solving();
            Thread.sleep(10000);
            System.out.println("Area of the Trapezoid is " + d.trapezoid.Answer(v.getBase0(), v.getBase1(), v.getHeight_trap()));
            System.out.println();
        }else if (a.equalsIgnoreCase("F")){//for cylinder
            cylinder_q();
            d.cylinder.Formula();
            d.cylinder.Solving();
            Thread.sleep(15000);
            System.out.println("Base Area of the Cylinder is " + d.cylinder.Answer(v.getBase_r()));
            System.out.println("Lateral Area of the Cylinder is " + d.cylinder.Answer1(v.getBase_r(), v.getHeight_cyli()));
            System.out.println("Total Area of the Cylinder is " + d.cylinder.Answer2(v.getBase_r(), v.getHeight_cyli()));
            System.out.println();
        }else if(a.equalsIgnoreCase("Exit")){ //if user input exit the program will end.
            valid = false;
            System.out.println("Thank you! :)");
        }else {
            System.out.println("Invalid Input!\n"); //error mess for wrong input
        }
    }
    //method for the necessary data that I need from the user. And set them in a variable
    //for circle
    static void circle_q(){
        System.out.print("Enter the Radius of the Circle : ");
        v.setR(input.nextDouble());
        System.out.println();
    }
    //for triangle
    static void triangle_q(){
        System.out.print("Enter the Base of the Triangle   : ");
        v.setBase_T(input.nextDouble());
        System.out.print("Enter the height of the Triangle : ");
        v.setHeight_T(input.nextDouble());
        System.out.println();
    }
    //for square
    static void square_q(){
        System.out.print("Enter the side of the Square : ");
        v.setSide(input.nextDouble());
        System.out.println();
    }
    //for rectangle
    static void rectangle_q(){
        System.out.print("Enter the Length of the Rectangle : ");
        v.setLength(input.nextDouble());
        System.out.print("Enter the width of the Rectangle  : ");
        v.setWidth(input.nextDouble());
        System.out.println();
    }
    //for trapezoid
    static void trapezoid_q(){
        System.out.print("Enter the First Base of the Trapezoid  : ");
        v.setBase0(input.nextDouble());
        System.out.print("Enter the Second Base of the Trapezoid : ");
        v.setBase1(input.nextDouble());
        System.out.print("Enter the Height of the Trapezoid      : ");
        v.setHeight_trap(input.nextDouble());
        System.out.println();

    }
    //for cylinder
    static void cylinder_q(){
        System.out.print("Enter the Base Radius of the Cylinder : ");
        v.setBase_r(input.nextDouble());
        System.out.print("Enter the Height of the Cylinder      : ");
        v.setHeight_cyli(input.nextDouble());
        System.out.println();
    }
}
