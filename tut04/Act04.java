package tut04;

import java.util.Scanner;

public class Act04 {

    public static int giaiThua (int n){
        int res = 1;  // khi nhan chong cheo => khoi tao bien =1

        while ( n!= 0){ // n = 5, n= 4; n =3;
            res = res*n;// res = 1*5 ; res = 5*4;
            n--; // n= n-1 = 4; n=3, 2,1
        }
        // n == 0 khòng đi vào loop => return res = 1
        return res;
    }

    public static int giaiThua2 (int n){
        int res = 1;
        for (int i = n; i>=1; i--){
             res = res*i;
        }
        return res;
    }
    public static void main(String[] args) {
          Scanner sc = new Scanner (System.in);
        System.out.println("Get any positive integer : ");
        int n = sc.nextInt ();
        System.out.println(n + "! = "+ giaiThua2(n));

    }

}
