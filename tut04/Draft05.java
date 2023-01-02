package tut04;

import java.util.Scanner;

public class Draft05 {
    public static int Fibonacci (int n){
        if ( n == 0 ){
            return 0;
        }
        if ( n==1 ){
            return 1;
        }
        return Fibonacci(n-2)+ Fibonacci(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Print the x th fibonacci :");
        int n = sc.nextInt ();

        for (int i = 0; i <= n; i++) {
            System.out.print(Fibonacci(i) + "  ");
        }

    }
}
