package tut05;


import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int n = sc.nextInt();
        for (int i=0;i<n;i++)
        {
            //i==0, j==0
            for (int j=0;j<n;j++)
            {
                System.out.print("*");
            }
            System.out.print("\t"); // in hết phần sao 1 rồi cách


            // i==0, j== 0
            for (int j=0;j<n;j++)
            {
                if (i==0||i==(n-1))
                {
                    System.out.print("*"); // in hết phần sao 2
                }else{ // khi i khac 0, i khac n-1
                    if (j==0||j==(n-1)) // khi cot cua phan thu 2 khac 0 va khac n-i
                    {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }
    }
}
