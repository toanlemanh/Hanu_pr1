package tut08_hw;

import java.util.Scanner;

public class Act05 {
    public static int [] shiftRight(int arr[]){
        int [] Uparr = new int [arr.length];
         for (int i=arr.length-1; i>0; i--){
             Uparr[i] = arr[i-1]; //
         }
         Uparr[0] = arr[arr.length-1];
        return Uparr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [4];

        for(int i=0; i<4; i++){
            System.out.print("["+i+"] <-- ");
            arr[i] = sc.nextInt();
        }
        System.out.println("initial array :");
        for (int i: arr){
            System.out.print(i+"\t");
        }
        System.out.println("\nshiftRight:");
        for (int i: shiftRight(arr)){
            System.out.print(i+"\t");
        }
    }
}
