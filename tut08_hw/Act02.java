package tut08_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Act02 {
    // single loop
    public static int sumWithoutSmallest (int [] arr){
        int min = arr[0];
        int sum = 0;
        for(int i=0; i<5; i++){
            sum= sum+arr[i];
            if(min> arr[i]) {
                min = arr[i];
            }
        }
        return sum-min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        for (int i=0; i<5; i++){
            System.out.println("["  +i+  "] = ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Initial array :");
        for (int i: arr){
            System.out.print(i +"\t");
        }
        System.out.print("The sum of array without the min :");
        System.out.println(sumWithoutSmallest(arr));

    }
}
