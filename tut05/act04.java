package tut05;

import java.util.Scanner;
public class act04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        char arr [] [] = new char [n][n];
        for(int i=0; i<n; i++){
// P1
            for (int j=0; j<n; j++){   // In tất cả sao
                System.out.print("*");
            }
            System.out.print(" ");   // 1 Space


// P2
            for (int j=0; j<n; j++){  // Line 0   ( arr [0] [j++]  )
                if(i==0 || i==n-1 ){
                    System.out.print("*");
                }
                else {// In sao duy nhất col 0 và col n tại Line 1 --> Line n-1
                    if(j == 0 || j == n-1 ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            } // The end of line
            System.out.print("\n");
        }




    }
}
