package tut05;

import java.util.Scanner;

public class act1_method1 { // Dung usage
    //    Luu vao string

    public static String toBinary (int n){
        String str ="";     //
        while(n>0){
              str = n%2 + str;  // LIFO  11 ( 1101 ) -->  1011
              //str = str + n%2 ; //      FIFO   11 (1101) -->  1101
            n = n/2;

        }
        return str;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get any integer number :");
        int n = sc.nextInt();

        System.out.println("After converting decimal number into binary : " + toBinary(n));

    }
}
