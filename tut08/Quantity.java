package tut08;

public class Quantity {
      private Drinks d; // enum class Drinks
      private short n;
      private int order_time = 0;

      public Quantity(Drinks d, short n){
          this.d = d;
          this.n = n;
      }

      public short current_drinks( short x){
         return (short)(n-x);
      }



}
