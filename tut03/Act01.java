package tut03;

import java.util.Scanner;

public class Act01 {
    public static void main(String[] args) {
          System.out.println(" WWhat's your age ?");

          Scanner nhap = new Scanner (System.in);
          int age = nhap.nextInt ();

          if ( age < 13 ) {
              System.out.println("Not for kids !");
          }
          else if ( age <= 19 && age >= 13){
              System.out.println ("Welcome, teenagers !");
          }
          else {
              System.out.println ("You're too old !");
         }
        System.out.println("The end");


    }
}
