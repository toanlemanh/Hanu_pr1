package tut08;

public class CHECK_SIZE {
     private SIZE day;
     private String sh;

    public CHECK_SIZE(SIZE day,String sh) {
        this.day = day;
        this.sh = sh;
    }

    public String getSh() {
        return sh;
    }

    public void setSh(String sh) {
        this.sh = sh;
    }

    public SIZE getDay() {
        return day;
    }

    public void setDay(SIZE day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "CHECK_SIZE{" +
                "size=" + day +
                ", name of product = ' " + sh + '\'' +
                '}';
    }
}
