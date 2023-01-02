package tut04;


import java.util.Scanner;

public class Act07 {
    public static void kiemTra (int n){
       for (int i = 0; i<= 10; i++){

           int f = (int) Math.pow(10,i);
           int b = (int) Math.pow(10,i+1);
           if ( f<= n && n<=b){
               System.out.println( n + " has "+ (i+1) + " digit(s) ");
           }
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Get any integer :");
        int n = sc.nextInt ();

        if ( n < 0){
           n = -1*n;
           kiemTra(n);
        }
        else if (n == 0){
            System.out.println(" 0 has 1 digit !");
        }

        else  {
            kiemTra(n);
        }

    }
}
