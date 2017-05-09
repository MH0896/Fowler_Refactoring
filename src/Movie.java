public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    
    private String title;
    private Price price;
    
    public Movie(String newtitle, int priceCode) {
        this.title = newtitle;
        this.setPriceCode(priceCode);
    }
    
    public int getPriceCode() {
    	return this.price.getPriceCode();
    }
    
    public void setPriceCode(int priceCode) {
    	switch (priceCode) {
    	 	case REGULAR:
    	 		this.price = new RegularPrice();
    	 		break;
    	 
    	 	case CHILDRENS:
    	 		this.price = new ChildrensPrice();
    	 		break;
    	 
    	 	case NEW_RELEASE:
    	 		this.price = new NewReleasePrice();
    	 		break;
    	 
    	 	default:
    	 		throw new IllegalArgumentException("Incorrect Price Code");
    	 }
    }
    
    public String getTitle (){
        return title;
    }
    
    public double getCharge(int days){
        return price.getCharge(days);
    } 
    
    public int getFrequentRenterPoints(int days){
    	return this.price.getFreuquentRenterPoints(days);
    }
}