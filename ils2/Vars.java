package ils2;
//this class is for encapsulating of the variable so that the data is being protected from the user.
//Using the private so that the variable is can only access within the class.
//Also to Assign and Call the Variable I use the Getter and Setter for it.
public class Vars {
    //for the input of what shape
    private String shape;
    public String getshape(){
        return shape;
    }
    public void setShape(String a){
        shape = a;
    }
    //for circle
    private double radius;
    public double getR(){
        return radius;
    }
    public void setR(double a){
        radius = a;
    }

    //for triangle
    private double base_T;
    private double height_T;
    public double getbase_T(){
        return base_T;
    }
    public void setBase_T(double a){
        base_T = a;
    }
    public double getHeight_T(){
        return height_T;
    }
    public void setHeight_T(double a){
        height_T = a;
    }

    //for square
    private double side;
    public double getSide(){
        return side;
    }
    public void setSide(double a){
        side = a;
    }

    //for rect
    private double length;
    private double width;
    public double getLength(){
        return length;
    }
    public void setLength(double a){
        length = a;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double a){
        width = a;
    }

    //for trap
    private double base0;
    private double base1;
    private double height_trap;
    public double getBase0(){
        return base0;
    }
    public void setBase0(double a){
        base0 = a;
    }
    public double getBase1(){
        return base1;
    }
    public void setBase1(double a){
        base1 = a;
    }
    public double getHeight_trap(){
        return height_trap;
    }
    public void setHeight_trap(double a){
        height_trap = a;
    }

    //for cylinder
    private double base_r;
    private double height_cyli;
    public double getBase_r(){
        return base_r;
    }
    public void setBase_r(double a){
        base_r = a;
    }
    public double getHeight_cyli(){
        return height_cyli;
    }
    public void setHeight_cyli(double a){
        height_cyli = a;
    }
}
