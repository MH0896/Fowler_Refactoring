abstract class Price {

     public abstract double getCharge(int days);
     public abstract int getPriceCode();
     
     int getFrequentRenterPoints(int days) {
    	 return 1;
    }
 }