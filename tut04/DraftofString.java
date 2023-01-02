package tut04;

import java.util.Scanner;

public class DraftofString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Find any character in the string");
        char c = sc.next().charAt(0);

        char arr[] = str.toCharArray();// Chuyển string thành mảng kí tự

        int k = 0;
        for (char x : arr) { // với mỗi phần tử x ánh xạ sang mảng arr
            if (x == c) {
                k++;
            }
        }
        if (k!=0) {
            System.out.println(c + " is in the string ");
            int n = str.length() - 1;
            int mark = -1;

            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == c) {
                    mark = i;
                    break;
                }
            }
            System.out.println(mark);
        }
        else {
            System.out.println(c + " is NOT in the string ");
        }


       }
    }
