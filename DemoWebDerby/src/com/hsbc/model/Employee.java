package com.hsbc.model;

public class Employee {
	private int empid;
	private String enmae;
	private int salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String enmae, int salary) {
		super();
		this.empid = empid;
		this.enmae = enmae;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEnmae() {
		return enmae;
	}

	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((enmae == null) ? 0 : enmae.hashCode());
		result = prime * result + salary;
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
		Employee other = (Employee) obj;
		if (empid != other.empid)
			return false;
		if (enmae == null) {
			if (other.enmae != null)
				return false;
		} else if (!enmae.equals(other.enmae))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", enmae=" + enmae + ", salary=" + salary + "]";
	}
	
	

}
