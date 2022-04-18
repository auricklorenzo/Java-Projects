package ils2;
//This File/Class has all the Computation.
//I create different class for each shape. And then call them by making object in to Compute Class.
//All the shape Inherit the Circle Class so that to use Polymorphism That uses Overriding.
//And so that the name of the method is the same.
//I use the Math class to Calculate accurately the Area.
public class Compute {
    circle circle = new circle();
    square square = new square();
    triangle triangle = new triangle();
    rectangle rectangle = new rectangle();
    Trapezoid trapezoid = new Trapezoid();
    Cylinder cylinder = new Cylinder();
}
//for Circle
class circle{
    public void Solving(){
        System.out.println("Solving the Area of the Circle........\n");
    }
    public void Formula(){
        System.out.println("Area = π * r²\n");
    }
    public double Answer(double r){
        return  Math.round(Math.PI * Math.pow(r, 2));

    }

}
//for Square
class square extends circle{
    public void Solving(){
        System.out.println("Solving the Area of the Square........\n");
    }
    public void Formula(){
        System.out.println("Area = s²\n");
    }
    public double Answer(double r){
        return Math.pow(r, 2);

    }
}
//For Triangle
class triangle extends circle{
    public void Solving(){
        System.out.println("Solving the Area of the Triangle........\n");
    }
    public void Formula(){
        System.out.println("Area = (1/2) * b * h\n");
    }
    public double Answer(double b, double h){
        return 0.5 * b * h;
    }
}
//For Rectangle
class rectangle extends circle{
    public void Solving(){
        System.out.println("Solving the Area of the Rectangle........\n");
    }
    public void Formula(){
        System.out.println("Area = l * w\n");
    }
    public double Answer(double l, double w){
        return l * w;

    }
}
//For Trapezoid
class Trapezoid extends circle{
    public void Solving(){
        System.out.println("Solving the Area of the Trapezoid........\n");
    }
    public void Formula(){
        System.out.println("Area = (b1 + b2) * h /2\n");
    }
    public double Answer(double b1, double b2, double h){
        return  (b1 + b2) * h /2;

    }
}
//For Cylinder
class Cylinder extends circle{
    public void Solving(){
        System.out.println("Solving the Area of the Cylinder........\n");
    }
    public void Formula(){
        System.out.println("Base Area = 2 * π * r²");
        System.out.println("Lateral Area = (2 * π * r) * h");
        System.out.println("Total Area = Base Area + Lateral Area\n");
    }
    public double Answer(double r){
        return Math.round(2 * Math.PI * Math.pow(r, 2)) ;

    }
    public double Answer1(double r, double h){
        return Math.round((2 * Math.PI * r) * h);
    }
    public double Answer2(double r, double h){
        return  Math.round(2 * Math.PI * Math.pow(r, 2) + (2 * Math.PI * r) * h);

    }

}