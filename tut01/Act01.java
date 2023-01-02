package tut01;
import java.util.Scanner;
public class Act01 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
//        System.out.println(String[] args);
         double pi = 3.14;
         double x = (int) (pi* 0.5);  // 3.14 * 0.5 = 1.5 -->(int) : 1-->(double) :0
         double y = (int) pi* 0.5;  // 3 * 0,5 = 1,5
        double z = (int) pi* (int) 0.5;// 3 * 0 = 0,0

        System.out.print(":" + x +"\n"+ y+"\n" +z);
    }
}
