package tut03;

// phương trình bậc 2

import java.util.Scanner;
public class Act03 {
         public static void main (String [] args){

             System.out.println(" ax^2 + bx + c = 0");
             System.out.println("Moi ban nhap a ");
             Scanner nhap = new Scanner (System.in);
             double a = nhap.nextDouble ();

             System.out.println("Moi ban nhap b ");
             double b = nhap.nextDouble ();

             System.out.println("Moi ban nhap c ");
             double c = nhap.nextDouble ();

             if ( a == 0){
                 if (b == 0 && c == 0){
                     System.out.println("Phương trình có nghiệm với mọi x !");
                 }
                 else if ( b== 0 && c != 0){
                     System.out.println("Phương trình vô nghiệm !");
                 }
                 else if ( b != 0) {
                     System.out.println("Phương trình bậc nhất có nghiệm x = " +  -c/b);

                 }

             }
             else { // a khac 0
                 // tính denta
                 double denta = Math.pow (b,2) - 4*a*c;
                 if ( denta < 0){
                     System.out.println("Phương trình bậc 2 vô nghiệm ");
                 }
                 else if ( denta == 0){
                     System.out.printf("Phương trình có nghiệm kép x = %.2f", -b/2*a);
                 }
                 else {
                     double x1 = ( -b + Math.sqrt (denta) )/ 2*a;
                     double x2 =  ( -b - Math.sqrt (denta) )/ 2*a;
                     System.out.printf("Phương trình có 2 nghiệm phân biệt x1 = %.2f và x2 = %.2f",x1,x2 );
                 }
             }

         }

}
