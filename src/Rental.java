class Rental {
    
	private Movie movie;
    private int daysRented;
    
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    private double getCharge() {
        double res = 0;
        
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                res += 2;
                if (getDaysRented() > 2)
                    res += (getDaysRented() - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                res += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                res += 1.5;
                if (getDaysRented() > 3)
                    res += (getDaysRented() - 3) * 1.5;
                break;
        }
        
        return res;
    }
    
    int getFrequentRenterPoints() {
        if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && getDaysRented() > 1){
        	return 2;
    	}else{
    	    return 1;
    	}
    }

}