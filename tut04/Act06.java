package tut04;

public class Act06 {

    public static void tachSo (int n, int M[]) {

            for (int i = 0; i < 3; i++) {
                M[i] = n % 10; // lay chu so tu cuoi luu vao mang
                n = n / 10;
               // System.out.println(M[i]);
             }
    }

    public static void soSanh (int n, int M[]) {
        // tinh tong
            int sum = 0;
            for (int i = 0; i < 3; i++) { // khi i = 3 thi dung vong lap ma ko can dieu kien n != 0
                sum = sum + (int) Math.pow(M[i],3);
                // sum = 5*5*5 + 3*3*3 + 1*1*1
            }

            // so sanh
            if (sum == n){ // so sanh sum voi n = 135
                 System.out.println(n);
            }
        }


    public static void main(String[] args) {

        int M[] = new int[3]; // Khai bao Array co 3 phan tu cung kieu int

        System.out.println(" Print out all Armstrong numbers between 100 and 999 ");

        for (int i= 100; i<= 999; i++){ // tachSo va soSanh voi i tinh tien tu 100-> 999
            tachSo(i,M);
            soSanh(i,M);

        }


    }
}
