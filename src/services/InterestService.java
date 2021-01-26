package services;

public interface InterestService {
	
	Double getInterestRate();
	
	default double payment(double amount, int months) {
		if(months < 1) {
			throw new IllegalStateException("");
		}
		else {
			return amount * Math.pow(1.0 + getInterestRate() / 100, months);
		}
	}

}
