package Tut10;

import java.util.Scanner;

public class Act01 {
    public static void menu_console(){
        System.out.println("[1] Add item\n" +
                "[2] Item list\n" +
                "[3] Edit an item\n" +
                "[4] Remove an item\n" +
                "[5] Quit\n" +
                "Choose an option: \n");

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rand = 0;

        while(rand != 5){
            menu_console();
            rand = sc.nextInt();

            switch(rand){

                case 1:
                    System.out.println("Adding new items");
                    break;
                case 2:
                    System.out.println("Listing all items");
                    break;
                case 3:
                    System.out.println("Editing an items");
                    break;
                case 4:
                    System.out.println("Removing an items");
                    break;
                case 5:
                    System.out.println("Quiting the settings");
                    break;
                default:
                    System.err.println("Invalid choice!");
                    break;
            }
        }
    }
}
