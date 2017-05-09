class NewReleasePrice extends Price {
 
     @Override
     public double getCharge(int days) {
         return days * 3;
     }
 
     @Override
     public int getPriceCode() {
         return Movie.NEW_RELEASE;
     }
 }