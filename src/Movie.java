public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    
    public Movie(String newtitle, int newpriceCode) {
        title = newtitle;
        priceCode = newpriceCode;
    }
    
    public int getPriceCode() {
        return priceCode;
    }
    
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    
    public String getTitle (){
        return title;
    }
    
    public double getCharge(int days){
        double res = 0;
        
        switch (this.getPriceCode()) {
        	case Movie.REGULAR:
        		res += 2;
        		if (days > 2)
        			res += (days - 2) * 1.5;
        		break;
       
        	case Movie.NEW_RELEASE:
        		res += days * 3;
        		break;
        
        	case Movie.CHILDRENS:
        		res += 1.5;
        		if (days > 3)
        			res += (days - 3) * 1.5;
        		break;
        }
        return res;
    } 
    
    public int getFrequentRenterPoints(int days){
    	if (this.priceCode == Movie.NEW_RELEASE && days > 1)
    		 return 2;
    	else
    		 return 1;
    }
}