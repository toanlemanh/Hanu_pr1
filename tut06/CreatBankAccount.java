package tut06;

public class CreatBankAccount {  // class is object owning attributes and methods (operations)

    // Attributes:  su dung access modifier la private de dong goi du lieu, nham khong cho thay va truy cap co so du lieu
    // chỉ co the chinh sua du lieu ben trong ham class

    private String name ;    // tên chủ thẻ
    private double balance;    // tổng  tài sản trong thẻ
    private double transfer;    // chi phí chuyển khoản
    public int transaction = 1;


    // Methods :   su dung access modifier public

    public CreatBankAccount(String a, double b) {// A constructor  khong co kieu tra ve, ten function trung voi ten class
        to_String(a,b);                       // day la ham khoi tao mot object moi khi mot object duoc tao trong ham main
        }
        public void to_String (String x, double y){  // access modifier + data fields + name_function (parameter)
            name = x;
            balance = y;
            if (y<0){
                balance *=-1;
            }
            System.out.println(name+"$"+ balance);

        }
        public double withdraw (double amount_money){
           // System.out.println("The balance after withdrwaing " + amount_money);
            transaction++;
             balance -= amount_money; //
            return balance;

        }
        public double deposit (double amount_money){

                 transaction ++;
                 return balance += amount_money;
        }
    public void monthly_Fee ()
    {
        withdraw(10);
    }

    public void addAnnual_Interest (double interest) {
        balance +=  balance * interest;
        transaction++;
    }

    public void transfer_money (CreatBankAccount VP, double amount_money){
             if (amount_money > (balance-0.5)){
                 System.out.println("Your account is not enough to make a transaction");
             }
             else{

                //balance = (long) (balance - amount_money - 0.5);
                 System.out.println("Your balance curently is ");
                 System.out.print(this.withdraw(amount_money+0.5) + "after banking " +amount_money);// so tien tai khoan nguon
                VP.deposit (amount_money); // so tien ben tai khoan dich

             }


    }


    }








