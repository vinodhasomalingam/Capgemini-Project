package a;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("salaried")
public class SalariedEmployee extends Employee {
	
	@Column(name = "annual_salary")
	private double annualSalary;

	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int empno, String name, double annualSalary) {
		super(empno, name);
		this.annualSalary = annualSalary;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	

}
