package tut05;

import java.util.Scanner;
public class act01_method2 {

    public static void toBinary (int arr[], int n){
        int i = 0;
        for ( i=0; n>0; i++){
            arr[i] = n%2;
            n = n/2;
        }
        for (int j = i-1; j>=0; j--){
            System.out.print(arr[j]);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Get any integer number :");

        int n = sc.nextInt();
        System.out.println("After converting decimal number into binary :");
        int arr []= new int [10];
        toBinary(arr,n);

    }
}
