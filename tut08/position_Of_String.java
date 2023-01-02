package tut08;

public class position_Of_String {

    public static int positionOfString(String org, String sub){
           sub = sub.toLowerCase();
           int n = org.indexOf(sub);
           return n;
    }
    public static void main(String[] args) {
        String str1 = "Codelearn";
        String str2 = "LeArN";
        System.out.println("Find the string "+str2+" in "+ str1);
        System.out.println(positionOfString(str1, str2));

        System.out.println("codeLEarn".replace("LE","le"));

    }
}
