package tut07;

import java.util.Scanner;

public class get_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get your password");
        String pw  = sc.nextLine();
        int length = pw.length();
        check_Password Mk = new check_Password(pw,length);


    }
}
