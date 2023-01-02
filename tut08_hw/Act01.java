package tut08_hw;

import java.util.Scanner;

public class Act01 {
    public static boolean check_prime(int r){

        for (int i=2; i<r; i++){  // if r = 2, it doenst get in loop
            if (r%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = 0;
        int count=0;   // the number of prime num
        int range = 998;
        for(int i=1; i<=100; i++ ){
            rand = (int) (Math.random()*range + 2) ;  // 0 --> 1 :   x1000:  0-->1000
            if(check_prime(rand)){
                count++;
            };
        }
        System.out.println("The number of prime number is "+ count);
        System.out.println("The probability that a random is prime " + count + " %");

    }
}
