package tut08;

public class milkTea {
    public static void main(String[] args) {
        CHECK_SIZE milktea = new CHECK_SIZE(SIZE.LARGE,"Strawberry favored");
        CHECK_SIZE coffee = new CHECK_SIZE(SIZE.MEDIUM,"Capuccino");
        System.out.println(milktea.toString());
        System.out.println(coffee.toString());

    }
}
