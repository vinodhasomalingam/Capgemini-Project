package a;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("hourly")
public class HourlyEmployee extends Employee{
	
	@Column(name = "hourly_rate")
	private double hourlyRate;
	
	@Column(name = "max_hours_per_day")
	private int maxHoursPerDay;
	
	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getMaxHoursPerDay() {
		return maxHoursPerDay;
	}

	public void setMaxHoursPerDay(int maxHoursPerDay) {
		this.maxHoursPerDay = maxHoursPerDay;
	}

	public HourlyEmployee(int empno, String name, double hourlyRate, int maxHoursPerDay) {
		super(empno, name);
		this.hourlyRate = hourlyRate;
		this.maxHoursPerDay = maxHoursPerDay;
	}



	

}
