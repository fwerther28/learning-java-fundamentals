package section16_interfaces.services;

import java.time.LocalDate;

import section16_interfaces.entities.Contract;
import section16_interfaces.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;
	
	// Dependency Injection
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		
		double basicQuota = contract.getTotalValue() / months;
		
		for (int i = 1; i <= months; i++) {
			// Calculate the due date for each installment
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			// Apply interest and fee using the interface
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double fullQuota = basicQuota + interest + fee;
			
			// Add the installment to the contract list
			contract.getInstallments().add(new Installment(dueDate, fullQuota));
		}
	}
}
