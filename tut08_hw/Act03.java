package tut08_hw;

import java.util.ArrayList;
import java.util.Scanner;

public class Act03 {
    public static void removeEvenlength(ArrayList<String> list){
         for (int i=0; i< list.size(); i++){
             if ( (list.get(i)).length()%2 != 0 ){
                 list.remove(i);
             }
         }
         for (String s : list){
             System.out.println(s);
         }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> food = new ArrayList<>();

        for (int i=0; i<5; i++){
            System.out.print("["+i+"]  <---");
            food.add(sc.nextLine());
        }
        System.out.println("Initial ArrayList :");
        for (String s: food){
            System.out.println(s);
        }
        System.out.println("Remove the String whose length is Even number :" );
        removeEvenlength(food);
//        food.add("hambuger");
//        food.add("pizza");
//        food.add("French chips");
//        food.add("potato snack");
//        (food.get(2)).length()


    }


}
