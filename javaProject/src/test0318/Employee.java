package test0318;

public class Employee {
	int empNum;
	String name;
	String hireDate;
	String dep;
	int salary;
	
	public Employee(int empNum, String name, String hireDate, String dep, int salary) {
		super();
		this.empNum = empNum;
		this.name = name;
		this.hireDate = hireDate;
		this.dep = dep;
		this.salary = salary;
	}

	public int getEmpNum() {
		return empNum;
	}

	public String getName() {
		return name;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getDep() {
		return dep;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [empNum=" + empNum + ", name=" + name + ", hireDate=" + hireDate + ", dep=" + dep + ", salary="
				+ salary + "]";
	}
	
	
	
}
