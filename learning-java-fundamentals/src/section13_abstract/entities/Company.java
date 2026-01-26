package section13_abstract.entities;

import section14_abstract.entities.TaxPayer;

public class Company extends TaxPayer {

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numberOfEmpolyees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmpolyees;
	}

	public Integer getNumberOfEmpolyees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmpolyees(Integer numberOfEmpolyees) {
		this.numberOfEmployees = numberOfEmpolyees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		} else {
			return getAnualIncome() * 0.16;
		}

	}

}
