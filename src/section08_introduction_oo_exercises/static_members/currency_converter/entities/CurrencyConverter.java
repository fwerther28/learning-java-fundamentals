package section08_introduction_oo_exercises.static_members.currency_converter.entities;

public class CurrencyConverter {
	
	// IOF tax percentage (6%)
	public static final double IOF_PERCENTAGE = 0.06;
	
	// Static method to convert dollar to real considering IOF tax
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF_PERCENTAGE);
	}
	
}
