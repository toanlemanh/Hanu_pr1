package tut04;

import java.util.Scanner;

public class ACt02 {

    public static double tinhLai (double m, double r, double y){
        double res = m* Math.pow (1 + r/100, y);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("How much money ?");
        Scanner sc = new Scanner (System.in);
        double m = sc.nextDouble();
        System.out.println("How many years do you want to deposit your money? ");
        double y = sc.nextDouble();
        System.out.println("What's the interest rate (%)? ");
        double r = sc.nextDouble();

        float Res = (float) tinhLai(m,r,y);
        System.out.println("After " + y +" years, you'll receive " + Res);



    }
}
