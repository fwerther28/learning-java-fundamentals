package section16_interfaces.services;

public interface OnlinePaymentService {
	
	Double paymentFee(Double amount);
	Double interest(Double amount, Integer months);
	
}
