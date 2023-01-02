package tut08_hw;

import java.util.Scanner;

public class Act04 {
    // check the last digit whether they are equal to other
    // count the same-valued digit and store them in the corresponding index of array
    //    store the quantity of the same-valued lastdigit ( eg: how many 1 in index 1 )

    public static int[] countLastDigits(int arr[]) {   // return array of count
        int Uparr [] = new int[arr.length];            // update array ->  to store the sum of lastdigit, which is same
        for (int i = 0; i < arr.length; i++) {

            int count = 0;      // count the number of lastDigits ( digits = index)
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] % 10 == i) {
                    count++;
                }
            }
            Uparr[i] = count;  //  Uparr[0] = 2 (lastdigit=0)
        }
        return Uparr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("[" + i + "] <-- ");
            arr[i] = sc.nextInt();
        }
        System.out.println("initial array :");
        for (int i : arr) {
            System.out.print(i + "\t");
        }
        System.out.println("\n the lastDigit array:");
        for (int i : countLastDigits(arr)) {
            System.out.print(i+"\t");
        }
    }
}
