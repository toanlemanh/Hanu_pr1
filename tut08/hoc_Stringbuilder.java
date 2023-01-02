package tut08;


public class hoc_Stringbuilder {
    public static void main(String[] args) {
        StringBuilder food = new StringBuilder ();
//                 StringBuilder is a class that provides all methods of java.util.String (not necessary for import)
//                  it is not a String so we need to convert it into String : name.toString()
//                  Moreover, StringBuilder is so fast than String

        food.append("pizza"); //
        food.append("hamburger");
        food.append("pancake");
        food.insert(5,"Coca");// offset: the position we want to insert
        food.append('T');
        food.append(100);//pizzaCocahamburgerpancakeT100
        food.delete(0,5);


        String name = food.toString() ;  //after delete: CocahamburgerpancakeT100
        // Convert StringBuilder to String to use :   nameStringBuilder.toString  --> print out all elements of STring
        //
        System.out.println(name);
    }
}
