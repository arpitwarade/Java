package Employee1;

public abstract class Employee {
    
    protected String name;
    protected String address;
    protected int age;
    protected char gender;  
    protected float basicSalary;

    public Employee(String name, String address, int age, char gender, float basicSalary) {
        super();
    	setName(name);
        setAddress(address);
        setAge(age);
        setGender(gender);
        setBasicSalary(basicSalary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.length() < 5 || name.equals("")) name = "default";
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(address == null || address.length() < 5 || address.equals("")) address = "Defaullt";
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        } else this.age = 18;
    }

    public char getGender() {
        return gender;
    }

   
    public void setGender(char gender) {
        this.gender = gender;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        if(basicSalary > 0) this.basicSalary = basicSalary;
        else this.basicSalary = 0;
    }
    
    abstract public double CalculateSalary();
}