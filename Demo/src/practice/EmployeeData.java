package practice;

public class EmployeeData {
	
	private int empid;
	private String name;
	private float salary;

	public int getEmpid() {
	return empid;
	}
	public void setEmpid(int empid) {
	this.empid = empid;
	}
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public float getSalary() {
	return salary;
	}
	public void setSalary(float salary) {
	this.salary = salary;
	}
	public EmployeeData(int empid, String name, float salary) {
	super();
	this.empid = empid;
	this.name = name;
	this.salary = salary;
	}
	@Override
	public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + empid;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + Float.floatToIntBits(salary);
	return result;
	}
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	EmployeeData other = (EmployeeData) obj;
	if (empid != other.empid)
	return false;
	if (name == null) {
	if (other.name != null)
	return false;
	} else if (!name.equals(other.name))
	return false;
	if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
	return false;
	return true;
	}

	}

