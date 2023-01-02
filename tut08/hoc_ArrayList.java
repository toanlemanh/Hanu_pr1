package tut08;

import java.util.ArrayList;

public class hoc_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<String>();
//          ArrayList<data_type> Varname = new ArrayList<data_type> ()
//        ArrayList is dynamically sized =>  flexible and fast to store the array of Objects .
//             ArrList is an upgraded array
        drinks.add("coffee");
        drinks.add("lemonade");
        drinks.add("milktea");


        drinks.set(1,"soda"); // câu lệnh gán use set and get to access an element
        // element type is not primitive type
//       The principle of act : The right shift, means that when we add an element in AL, the current locations which are behind the expected location are
//        shift right and expansion of the array list following the right
//        But when we use linkedlist; the previous node will remove the old address and directly point to the new address of expected node we want to add
//        drinks.set(2,"juice");
        drinks.add("beer");
        drinks.add(2,"milo"); // them vao vi tri thu 2 va day phan tu thu 3 xuong thu 4
       // drinks.remove("coffee");

         drinks.remove(1);
         drinks.set(2,"pepesi");
         String sArr [] ={
                 "hot dog", "pizza","KFC"
         };

        for(int i=0; i< drinks.size(); i++){
            System.out.println("["+i+"] :" + drinks.get(i));
        }
        for(String str: sArr){
            System.out.println(str +" with " + drinks.get(2)) ;
        }


        drinks.clear(); // clear
    }
}
