package com.casestudy.entityModel;

public class Professional {

	private int professionalId;
	private String professionalName;
	private double basicSalary, hra, pf, pt, medical, grossSalary, netSalary;
	

	public Professional() {
		
	}

	public Professional(int professionalId, String professionalName, double basicSalary, double medical) {
		super();
		// this();
		this.professionalId = professionalId;
		this.professionalName = professionalName;
		this.basicSalary = basicSalary;
		this.medical = medical;


	}
	
	public double calculateGrossSalary() {
		this.grossSalary = this.basicSalary + this.hra + this.medical;
		return this.grossSalary;
	}

	public double calculateNetSalary() {

		this.netSalary = this.calculateGrossSalary() - this.pt - this.pf;
		return this.netSalary;
	}

	public int getProfessionalId() {
		return professionalId;
	}

	public void setProfessionalId(int professionalId) {
		this.professionalId = professionalId;
	}

	public String getProfessionalName() {
		return professionalName;
	}

	public void setProfessionalName(String professionalName) {
		this.professionalName = professionalName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.hra = 0.5 * basicSalary;
		this.pf = 0.12 * basicSalary;
		this.pt = 200;
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}
	

	@Override
	public String toString() {
		return "Professional [professionalId=" + professionalId + ", professionalName=" + professionalName
				+ ", basicSalary=" + basicSalary + ", grossSalary=" + grossSalary + ", netSalary=" + netSalary + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(basicSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(grossSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(hra);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(medical);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(netSalary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(pf);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + professionalId;
		result = prime * result + ((professionalName == null) ? 0 : professionalName.hashCode());
		temp = Double.doubleToLongBits(pt);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Professional other = (Professional) obj;
		if (Double.doubleToLongBits(basicSalary) != Double.doubleToLongBits(other.basicSalary))
			return false;
		if (Double.doubleToLongBits(grossSalary) != Double.doubleToLongBits(other.grossSalary))
			return false;
		if (Double.doubleToLongBits(hra) != Double.doubleToLongBits(other.hra))
			return false;
		if (Double.doubleToLongBits(medical) != Double.doubleToLongBits(other.medical))
			return false;
		if (Double.doubleToLongBits(netSalary) != Double.doubleToLongBits(other.netSalary))
			return false;
		if (Double.doubleToLongBits(pf) != Double.doubleToLongBits(other.pf))
			return false;
		if (professionalId != other.professionalId)
			return false;
		if (professionalName == null) {
			if (other.professionalName != null)
				return false;
		} else if (!professionalName.equals(other.professionalName))
			return false;
		if (Double.doubleToLongBits(pt) != Double.doubleToLongBits(other.pt))
			return false;
		return true;
	}

	
}
