package tut05;

import java.util.Scanner;

public class Selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 3,8,5,0,9,7,2,6,4};
        System.out.println("Selection sort:");

        for( int i=0; i<9; i++){

            for(int j = i+1; j<9;j++){
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for( int a: arr){
            System.out.print(a + " ");
        }

    }
}
