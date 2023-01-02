package tut05;

import java.util.Scanner;

public class act01 {

    public static String toBinary(int n){
        String str = ""; // khai bao string = "" de luu gia tri cua remainder sau khi chia
        if (n==0){
            return "0";
        }
        else {
            while (n>0){
               // String str1 = Integer.toString(n);
                str = n%2 + str; // str ="" coong hai string lai
                n = n/2;  //   cac remainder : 1 1 0 1   =>  dua vao string theo quy tac LIFO
                // last in first out
            }

            return str;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Get an integer :");
        int n = sc.nextInt ();
        //int arr [] = new int[10]; // khai bao mang de luu gia tri cua cac remainder
       /* int i = 0;  // khai bao i o dau de nho so luong cac phan tu trong mang

        for (i=0;n != 0; i++ ){
            arr[i] = n%2;
            n = n/2;  // chia den khi n = 0;

        }*/
        System.out.println("After converting decimal to binary :");
        System.out.println(toBinary(n));
       /* for(i=i-1; i>=0; i--){ // dat i = i-1
            System.out.print(arr[i]);
        }*/
    }
}
