package tut04;

import java.util.Scanner;
public class ACt01 {


    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println(" Enter a positive int :");
        int n = sc.nextInt ();

        int dem = 0; // dat bien dem de danh dau
        for ( int i = 2; i< n; i++ ){// n =4

              if ( n%i == 0){
                  dem++;
              }
        }
        if ( dem == 0){
            System.out.println(n + "is a prime ");
        }
        else {//
            System.out.println(n + " is not a prime ");
        }

    }
}
