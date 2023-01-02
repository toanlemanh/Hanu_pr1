package tut03;

public class hocChuoi {

        public static void main (String[] args) {
             String str = "LeManhToan"; // viij trí 1 đến 2 là e

            // bản chất của STring là một tập hớp các char kí tự
            // câu lệnh str.charAt (viTRi) trả về kiểu char
            // câu lệnh trả về phần tử kiểu char của một String
            char c = str.charAt(0);
            System.out.println("Phần tử đầu tiên của xâu kí tự là :"+ c);

            String sapxep = str.replace ("e","o");
            System.out.println("Chuỗi sau khi sắp xếp :"+ sapxep);
            String cat = str.substring (1,2); //   cắt từ vị trí 1 đến vị trí 2 của chuỗi kí tự
            System.out.println("Chuỗi sau khi cắt :" + cat);
            String vietHoa = str.toUpperCase ();
            String vietThuong = str.toLowerCase();
            System.out.println("Chuỗi sau khi viết hoa :"+ vietHoa);
            System.out.println("Chuỗi sau khi viết thường :"+ vietThuong);

            String age = "19"; // number stored as string
            int n = Integer.parseInt (age); // Convert String to Int
            // Integer : là một đối tượng kiểu int

            String lop = "7Ck21";

            //int iLop = Integer.parseInt (lop); câu lệnh ko hợp lệ vì lop là thuần kí tự không có số
            System.out.println("Age " + age);
            // tách các thành phần của String
            // Dùng câu lệnh chuỗi.substring
            char oneth = lop.charAt(0);
            String catLop = lop.substring (0,1);
            System.out.println("Lớp sau khi cắt :" + catLop);

           // int number = (char) oneth; đây không phải câu lệnh chuyển số 7 từ char sang int
            System.out.println("Lớp :"+ oneth);
          //  int numberClass = Integer.parseInt (String.valueOf(oneth));




        }


}
