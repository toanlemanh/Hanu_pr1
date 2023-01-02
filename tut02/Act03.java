package tut02;

public class Act03 {
    public static void main(String[] args) {
        System.out.println("You have 483,724 xu.");
        int xu = 483274;
        int quan = xu/10000;
        int dong = xu%10000/100;
        int hao = xu%10000%100/10;
        xu = xu%10000%100%10; // số xu còn lại

        System.out.println("After convert :");
        System.out.printf("%d quan ", quan);
        System.out.printf("%d dong ", dong);
        System.out.printf("%d hao ", hao);
        System.out.printf("%d xu ", xu);




    }
}
