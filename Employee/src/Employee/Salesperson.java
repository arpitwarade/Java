package Employee;

public  class Salesperson extends Employee {
	
	protected int commision;

	public int getCommision() {
		return commision;
	}

	public void setCommision(int commision) {
		this.commision = commision;
	}

	public Salesperson(String name, String address, int age, byte gender, float basicSalary, int commission) {
		super(name, address, age, gender, basicSalary);
		setCommision(commission);
	}
	@Override
	public double CalculateSalary() {
		return getBasicSalary()+commision;
	}
}
