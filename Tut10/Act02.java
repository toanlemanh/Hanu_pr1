package Tut10;

public class Act02 {

    public static void call1 (){
        System.out.println("I");
        call2();
    }
    public static void call2 (){
        System.out.println("U");
        call1();
    }
    public static void main(String[] args) {
        //Convert degree to radian
        double radian = Math.toRadians(90.0);
        // Convert radian to degree
        double angle = Math.toDegrees(Math.PI);
        System.out.println("Radian of 90 degree "+ radian );
        System.out.println("Degree of PI "+ angle);

//        what will happen
        System.out.println("What will happening when invoke each method inside each another => It is nonstop");
//        call1();
    }
}
