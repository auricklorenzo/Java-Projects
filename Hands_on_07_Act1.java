public class Hands_on_07_Act1 {
    public static void main(String[] args) {
        System.out.println("Math Class!!\n");

        //Math Floor
        double floor = Math.floor(10.7);

        //math ceiling
        double ceiling = Math.ceil(6.251);

        //Math Minimum
        int minimum = Math.min(17, 41);

        //Math Power
        double power = Math.pow(6, 2);

        //Math Absolute
        double absolute = Math.abs(-53);

        //Math round
        double round = Math.round(21.42);
        
        //print them
        System.out.println("Floor    : " + floor);
        System.out.println("Ceiling  : " + ceiling);
        System.out.println("Minimum  : " + minimum);
        System.out.println("Power    : " + power);
        System.out.println("Absolute : " + absolute);
        System.out.println("Round    : " + round);
    }
}