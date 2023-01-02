package tut06;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Bank_Account {  // ham nay danh cho nguoi dung (giao dien nguoi dung)


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // Class name   var name = new Class name ()

        System.out.println("Your name account :");
        String name = sc.nextLine();
        System.out.println("Your balance curently :");
        double balance = sc.nextDouble ();


        CreatBankAccount myBank = new CreatBankAccount(name,balance);  // khoi tao mot doi tuong (object)    class_name object_name = new class_name;
        CreatBankAccount yourBank = new CreatBankAccount("VP",350.33);

        myBank.to_String(name,balance);
        myBank.withdraw(55);
        myBank.addAnnual_Interest(6.8 / 100);
        myBank.monthly_Fee();

        System.out.println(myBank.transaction);
        System.out.println("Transfer :");
        myBank.transfer_money(yourBank, 199);
    }
}
