package tut08;

import java.util.Scanner;

public class order_List {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get an order list");
        System.out.println("Get a drink");
        String str = sc.nextLine();
        System.out.println("Get an expected size");
        String sz = sc.nextLine();

        //System.out.println("value of small" + SIZE.SMALL);
//        sz = String.valueOf(SIZE.SMALL);
//        System.out.println(sz);

        switch(sz){
            case "s":
                CHECK_SIZE drink = new CHECK_SIZE(SIZE.SMALL,str);
                System.out.println(drink.toString());
                break;
            case "m":
                CHECK_SIZE drink1 = new CHECK_SIZE(SIZE.MEDIUM,str);
                System.out.println(drink1.toString());
                break;
            case "l":
                CHECK_SIZE drink2 = new CHECK_SIZE(SIZE.LARGE,str);
                System.out.println(drink2.toString());
                break;
            case "xl":
                CHECK_SIZE drink3 = new CHECK_SIZE(SIZE.EXTRA_LARGE,str);
                System.out.println(drink3.toString());
                break;
            default:
                System.out.println("Invalid size! Input again, please !");
                break;
        }
    }
}
