package tut03;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Act02 { // Leap year : if divisable by 4 and not by 100 or divisible by 400
    public static void main (String [] args){
           Scanner nhap = new Scanner (System.in);
        System.out.println("Get the year :");
           long year = nhap.nextLong();

           if (year % 4 == 0 && year%100 != 0 || year % 400 == 0){
               System.out.printf(" %d is a leap year ", year);
           }

           else {
               System.out.printf(" %d is not a leap year ", year);
           }



    }
}
