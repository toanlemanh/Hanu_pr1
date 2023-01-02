package tut07;

import java.util.Scanner;

public class Act03_Recursive_Binary {
    public static String to_Binary(int n) {

        if (n == 0)
            return "0";
        else if (n == 1){
            return "1";
        }

        String bin =   to_Binary(n/2) + n%2 +""; // String "" is a Null

        return bin;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get a decimal number to convert to binary number :");
        int n = sc.nextInt();
        System.out.println("Converting " + to_Binary(n));

    }
}
