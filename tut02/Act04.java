package tut02;

public class Act04 {
    public static void main(String[] args) {
        double A = -0.4;
       /* double A = 0.9;
        double A = 2.0;
        double A = 20000000;
        double A = -0.3;
        double A = -30000000; */
        if (A == 0) {
            System.out.print("The number is zero");
        } else if (A >= 1.0 && A <= 1000000) {
            System.out.println("A positive number");
        } else if (A <= -1.0 && A >= -1000000) {
            System.out.println("A negative number");
        } else if (A >= 1000000) {
            System.out.println("A large positive number");
        } else if (A <= -1000000) {
            System.out.println("A large negative number");
        } else if (A > 0 && A < 1.0) {
            System.out.println("A small positive number");
        } else {
            System.out.println("A small negative number");
        }

    }
}

