package strategydemo;

public class FlatRateDiscountStrategy implements DiscountStrategy {

	private double amount;

	public FlatRateDiscountStrategy(double amount) {
		if (amount < 0) {
			amount = 0;
		}
		this.amount = amount;
	}

	public float applyDiscount(float price) {
		if (price - this.amount < 0)
			return 0;
		return price - this.amount;
	}
}
