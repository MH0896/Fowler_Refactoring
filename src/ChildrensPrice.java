public class ChildrensPrice extends Price {

	@Override
     public double getCharge(int days) {
         double result = 2;
         if (days> 2)
             result += (days - 2) * 1.5;
         return result;
     }
 
     @Override
     public int getPriceCode() {
         return Movie.CHILDRENS;
     }
 }