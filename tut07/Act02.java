package tut07;

import java.util.Scanner;

public class Act02 {
    // Doc 1 so tu 1000 den 999999 tu ban phim va in ra comma seperating the thounsands
    public static void addComma(String str, int n) {
        String newstr ="", str1, str2;

       if (n==4){
            str1 = str.substring(0,1);
            str2 = str.substring(1);
            newstr = str1 + "," + str2;
       }
       else if (n==5){
            str1 = str.substring(0,2);
            str2 = str.substring(2);
            newstr = str1 + "," + str2;

       }
       else if (n==6){
            str1 = str.substring(0,3);
            str2 = str.substring(3);
            newstr = str1 + "," + str2;
       }
        System.out.println("Converting :"+newstr);
    }

        public static void main (String[] args) throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
//        long num;
//        do {
//            System.out.println("Get a number (1000<=x<=999999)");
//            num = sc.nextLong();
//
//        } while (num <= 1000 || num >= 999999);
//        String cma = Long.toString(num);
//        //char str[] = cma.toCharArray();
//
//        int n = cma.length();
//        addComma(cma, n);
            System.out.println("Get a double as a string");
           // String str = "     56.9";
            String s ="    1";

            Integer v = Integer.valueOf(s);
          //  Double var = Double.parseDouble(str);
            System.out.println(s);

    }
}
