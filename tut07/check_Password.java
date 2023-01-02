package tut07;

public class check_Password {
    private String password;
    private int point = 0;
    private int len;

    public check_Password (String mk,int length){  // A constructor with 2 parameters
        password = mk;
        len = length;
        check_length();  // 2 sub_methods
        check_Character();  // consist of 4 conditions and find the final sum of point
    }
    public void check_length (){  // 1st sub-method in constructor
         if (len>=8 && len<=12){
             point=1;
         }
         else if (len>12){
             point=2;
         }
    }
    public void check_Character (){  // 2nd sub_method in constructor
        // Initialize and assign variables for zero
        int upp=0,low=0,num=0,sym=0,total;
        String special = "~`!@#$%^&*()_-+={}[]|:;'<>,.?/ "; // an array of special characters
        int n = special.length();

        // check 4 conditions
        for(int i=0; i<len; i++) {
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                upp = 1;
            }
            if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                low = 1;
            }
            if (password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                num = 1;
            }
            for (int j = 0; j < n; j++) {
                if (password.charAt(i) == special.charAt(j)) {
                    sym = 1;
                }
            }
        }
        // Find the total:
        total = upp + low + num + sym + point;// add the number of point in previous submethod
        System.out.println("total =" + total);

        // Check full requirement => Compare the total
        check_fullRequiremnt(total);

    }
    public void check_fullRequiremnt(int t){
        if (t>=1 && t<=2){
            System.out.println("Your password is weak");
        }
        else if (t>2&& t<=4){
            System.out.println("Your password is medium");
        }
        else if (t>4 && t<=6){
            System.out.println("Your password is strong");
        }
        else {
            System.out.println("Your code is wrong");
        }
    }
}
