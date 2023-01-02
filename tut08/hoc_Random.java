package tut08;

//import java.util.Scanner;
import java.util.Random;

public class hoc_Random {
    public static void main(String[] args) {

        Random ran = new Random();
        int n = ran.nextInt(5);  // random 0--> 5

        double db = ran.nextDouble();   // random 0--> 1
       System.out.println(n + "%");
        System.out.printf("%f ",db);
    }
}
