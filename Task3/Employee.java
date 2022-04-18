package Task3;

public class Employee {
    FullTimeEmployee F = new FullTimeEmployee();// obj for Fulltime
    PartTimeEmployee P = new PartTimeEmployee();// obj for Parttime

    private String name; //var for name

    public void setName(String Name) { //setter for name

        name = Name;
    }

    public String getName() { //getter for name

        return name;
    }
}
