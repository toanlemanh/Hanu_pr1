package tut04;

import java.util.Scanner;

public class Draft06 {

    //SO Armstrong :  so sanh 135 == 1^3 + 3^3 + 6^3

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Get any value integer between 100 and 999 :");
        String str = sc.nextLine();// stored as a STring

        char a = str.charAt(0); // tacsh tung phan tu cua str
        char b = str.charAt(1);
        char c = str.charAt(2);
       // System.out.println((a)+","+b);


        int a1 = Integer.parseInt(String.valueOf(a)); // Dung cau lenh ep kieu String sang Int
        int b1 = Integer.parseInt(String.valueOf(b));// ep kieu char sang String
        int c1 = Integer.parseInt(String.valueOf(c));

        //System.out.println(a1);
        int sum = (int) (Math.pow (a1,3) + Math.pow(b1,3) + Math.pow (c1,3)) ;

        int Intstr =  Integer.parseInt (str);// Convert string to integer

        if ( Intstr == sum){
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong");
        }

       String str1 = String.valueOf("123@");// Ép đối tượng bất kì sang kiểu string
        System.out.println(str1);


        // câu lệnh do while để kiểm tra điều kiện của input
        // Vd : Get the even number
       /* int n;
        do {
            System.out.println("Get the even number :");
            n = sc.nextInt ();

        } while (n%2 != 0);*/

    }
}
