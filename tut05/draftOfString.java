package tut05;

import java.util.Scanner;
public class draftOfString {
    public static void main(String[] args) {
           Scanner sc = new Scanner (System.in);
           String str = " ";



           for(int i=0; i<=10; i++)
           {
           str = i+ str; // LIFO  ==>   số + " "
           }

        System.out.println(str);

           for (int i=0; i<=10; i++){
               str = str + i; //FIFO   ==>  " " + số
           }
        System.out.println(str);

    }
}
