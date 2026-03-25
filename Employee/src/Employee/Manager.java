package Employee;

public class Manager extends Employee {
	protected float hra;

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public Manager(String name, String address, int age, byte gender, float basicSalary, float hra) {
		super(name, address, age, gender, basicSalary);
		setHra(hra);
	}
	@Override
	public double CalculateSalary() {
		return getBasicSalary()+(getBasicSalary()*hra);
	}
	
//	public String display() {
//		return new StringBuffer().toString();
//	}
}
