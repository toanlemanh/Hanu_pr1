package tut05;
import java.util.Scanner;

public class act03 {
    //A) C1 :
    public static void print_Uppercase(String str){

        int n = str.length()-1;
        char arr[] = str.toCharArray();

        System.out.println("The uppercase letters are :");
        for (char c = 'A'; c <= 'Z'; c++){

            for (int i = 0; i<n; i++){
                if(arr[i] == c){
                    System.out.print(c);
                }
            }
        }
    }

    // C2:  String 1 = In hoa String 0 ; sau do so sanh tung phan tu String 0 voi String 1
       public static void out_Uppercase(String str){
       String Ustr = str.toUpperCase();
       int n = str.length() - 1;

       for (int i=0; i<n; i++) {
           if (str.charAt(i) == Ustr.charAt(i)) {
               System.out.print(str.charAt(i));
           }
         }
       }

       // B)


    public static void isLetter (String str){
           String symb = "!@#$%^&*()_+-={}[]|:;<>,.?/~`'";
           int len = symb.length()-1;
           int n = str.length()-1;
      // Kiem tra co ki tu dac biet khong

           for (int i=0; i<len; i++){
               for (int j = 0; j<n; j++) {
                   if (symb.charAt(i) == str.charAt(j)) {
                       str = str.replace( str.charAt(j) , ' '); // thay the symbol = space
                   }// khong the gan truc tiep str.charAt() bang mot gia tri khac
                }
           }
       System.out.println(str);

          /* Xoa khoang trang
        char Arr[] = str.toCharArray();
        int j;
           for(int i=0; i<n; i++){

              while ( Arr[i] == ' '){
                  j=i+1;
                  Arr[i] = Arr[j];
                  i=j;
              }
        }

        for (int i=0; i<n; i++){
            System.out.print(Arr[i]);
        }*/
    }

    //C) d)
    public static void print_Vowels (String str){
        String vow = "UEOAIueoai";
        int len = vow.length()-1, n = str.length()-1 ;
        int count = 0; // the number of vowels
        for (int i=0; i<n; i++){
            for(int j=0; j<len; j++){
                if ( str.charAt(i) == vow.charAt(j)){
                    str = str.replace(str.charAt(i),'_'); // thay the phan tu vowels = underscore
                    count++;
                }
            }
        }
        System.out.println(str);
        System.out.println("The number of vowels " + count);
        posofVow(str,n);
    }
    public static void posofVow (String str, int n){
        System.out.println("The positions of vowels in the string :");
        for (int i=0; i<n; i++){
            if( str.charAt(i) == '_'){
                System.out.print(i + "  ");
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner (System.in);

   /* A) In ra so in Hoa
        System.out.println("Get any string :");
        String str = sc.nextLine();

       print_Uppercase(str);
        out_Uppercase(str);*/
    /* B)*/
        System.out.println("Get any string :");
        String str = sc.nextLine();
        System.out.println("Remove possible symbols");
        isLetter(str);

        //C) D)
//        System.out.println("Get any string :");
//        String str = sc.nextLine();
        //print_Vowels(str);
//print_Uppercase(str);

    }
}
