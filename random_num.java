import java.util.Random;
public class random_num {
  
    public static void main(String[] args) {
        Random rand = new Random(); //instance of random class
        int upperbound = 100;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound); 
        double double_random=rand.nextDouble(); // generate random values from 0.0 to 0.1 in double
        float float_random=rand.nextFloat(); // generate random values from 0.0 to 0.1 in float
        boolean bool_rand = rand.nextBoolean();
        
        // print them
        System.out.println(int_random);
        System.out.println(float_random);
        System.out.println(double_random);
        System.out.println(bool_rand);

        

    }   
}
