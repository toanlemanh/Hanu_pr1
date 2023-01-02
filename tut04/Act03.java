package tut04;

import java.util.Scanner;
public class Act03 {

    public static void Dao_nguoc(int n) {

        int temp = n;

        System.out.println("IN NGUOC CUA " + n + " LA :");
        while (n != 0) {

            temp = n % 10; // 45 % 10 = 5; 4% 10 = 4;
            n = n / 10; // 45/ 10 = 4;  4 / 10 = 0 => exit

            System.out.print(temp);

        }
    }
    public static void SothanhChuoi (int n){
        String str = String.valueOf( n);  //  trả về giá trị kiểu string của kiểu int
        System.out.printf(" => str : %s" , str); // biến string str đã lưu biến n kiểu int
        int k = Integer.valueOf (str); // nói cách khác  Convert int  to String
        System.out.println(" k : " + k); // Trả về giá trị int của kiểu string
    }

    public static void main(String[] args) {
     /*   String str = new String ("absc");
        // new String [3] ;
        String [] listName = {"Ha ","Tu", "Hoa "}; // An array of 3 Strings

        char a []= { 'a', 'b', 'c'};
        String s = new String (a); */


        Scanner sc = new Scanner(System.in);
        System.out.println("Get a positive integer :");
        int n = sc.nextInt();
        if ( n <= 0){
            System.out.println("Invalid ");
        }
        else {
            Dao_nguoc(n);
        }
        SothanhChuoi(n);

    }
}


