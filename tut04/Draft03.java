package tut04;

// Bc1 : chuyen kieu string sang kieu Array char
import java.util.Scanner;

public class Draft03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println(" Get a positive integer :");
        String str  = sc.nextLine ();


        char chArr [] = str.toCharArray(); // chuyen kieu string sang kieu mang ki tu char moi

        // Thay doi vi tri ben trong mang ki tu chArr
        int n = str.length ()-1; // bo qua phan tu NUll; nếu lấy phần tử null thì khi gán giá trị sẽ bị mất giá trị trong mảng

        for (int i = 0; i<n; i++) {
            chArr [i] = chArr [n-i];// lan luot gan phan tu cuoi bang phan tu dau khi tinh tien i them 1
            // VD: [0] = [n]; [1] = [n-1] ; ...
        }

        // Bc2 :  So sanh hai chuoi
        String newchArr = new String (chArr); // Khoi tao mot chuoi tu mot mang ki tu
        int cmpr = str.compareTo(newchArr);// cau lenh so sanh 2 chuoi tra ve kieu int
        //Generally, int x = String1.compareTo (String2)

     /*   if ( cmpr == 0){ //  hai string bang nhau
            System.out.println( str + " is a palindrome !");
        }
        else {   // khac
            System.out.println(str + " is not a palindrome !");
        }*/


        // Cach khác để so sánh hai chuỗi với nhau => dùng câu lệnh equals ()
        if (str.equals(newchArr)){
            System.out.println( str + " is a palindrome !");
        }
        else {
            System.out.println(str + " is not a palindrome !");
        }



      /*  System.out.println("Reverse :");
        System.out.println(chArr);

 // Chuyen string thanh int
        //int chnge = Integer.parseInt(str);
        //System.out.println(chnge);

       */
       /* for ( char w : chArr){  // for each c
            System.out.println(w);
        }*/
    }
}
