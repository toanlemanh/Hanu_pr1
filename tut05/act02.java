package tut05;

import java.util.Scanner;
public class act02 {


    public static float Average (int n, float arr []){
        float average = 0;
        for(int i=0; i<n; i++){
            average = average + arr[i];

        }
        return average/n*1.0f;
    }
    public static float Min (int n, float arr[]){
        float min = arr[0];
        for (int i=1; i<n; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static float Max (int n, float arr[]){
        float max = arr[0];
        for (int i = 1; i<n; i++){

            if (max < arr[i]){
                max = arr[i];
            }
        }

        return max;

    }
   // public static float range ()

    public static void main(String[] args)  {
        Scanner sc = new Scanner (System.in);

        System.out.println("tHE NUMBER of elements of arrray ");
        int n = sc.nextInt ();
        System.out.println("Get a floating-point array :");
        float arr [] = new float [n];
        for (int i=0; i<n; i++){
            System.out.println("arr ["+i+"] = ");
            arr[i] = sc.nextFloat();
        }
        System.out.println( "Average :" + Average(n,arr) );
        System.out.println( "Min = " + Min(n,arr) );
        System.out.println( "Max = " + Max(n,arr) );
        System.out.println(" The range : " + (Max(n,arr)-Min(n,arr)));


    }
}
