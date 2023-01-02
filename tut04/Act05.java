package tut04;


import java.util.Scanner;

public class Act05 {
    // Day so  Fibonacci

    public static void Fib (int n){
        int x = 0 ,y = 1, res = 0;
        if (n >= 1){
            System.out.print( x + "  " + y + "  ");
        }
        else {
            System.out.println(x);
        }
           // Fib : 0  1   1    2   3  5
        for ( int i = 2; i<= n; i++){ // ĐK : thỏa mãn khi i<=2

            res = x + y; // i = 2 ; res = 1; res = 2; res = 3;
            x = y; // x = 1 ; x = 1;  x = 2;
            y = res;// y = 1 ; y = 2; y = res
            System.out.print(res+ "  ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Get the n th Fibonacci :");
        int n = sc.nextInt ();
        System.out.println("A set of Fibonacci from starting pnt to " + n);
        Fib (n);
    }



}
