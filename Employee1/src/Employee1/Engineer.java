package Employee1;

public class Engineer extends Employee {
	protected float overTime;
	float hourlyRate;

	public float getOverTime() {
		return overTime;
	}

	public void setOveTime(float oveTime) {
		this.overTime = oveTime;
	}

	public Engineer(String name, String address, int age, char gender, float basicSalary, float overTime) {
		super(name, address, age, gender, basicSalary);
		setOveTime(overTime);
	}
	
	@Override
	public double CalculateSalary() {
		hourlyRate = getBasicSalary()/200;
		return getBasicSalary()+(overTime*hourlyRate*1.5f);
	}

}
