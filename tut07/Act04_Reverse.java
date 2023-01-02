package tut07;

import java.util.Scanner;

public class Act04_Reverse {
    // write a recursive to reverse a string
    public static String to_Reverse (String str, int i) {

// gán các phần tử đầu tiên vào trong chuỗi ""
        if (i == str.length() - 1) {
            return str.charAt(i) + "";
        }
        String nstring = to_Reverse(str, i + 1) + str.charAt(i) + "";

        return nstring;


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get any String :");
        String str = sc.nextLine();
        int n = str.length();
        System.out.print(to_Reverse(str,0));


    }


}
