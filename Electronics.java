package com.hsbc.entity;
/**
 * 
 * @author Siddhant
 *@purpose This is Electronics class inherits Products
 */

public class Electronics extends Products {
	
	private int warrantyInMonths;

	 public Electronics() {
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode,String itemName,double unitPrice,int quantity,int warrantyInMonths) {
		super(itemCode,itemName,unitPrice,quantity);
		this.warrantyInMonths = warrantyInMonths;
	}

	/**
	 * @return the warrantyInMonths
	 */
	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	/**
	 * @param warrantyInMonths the warrantyInMonths to set
	 */
	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
	}
	
	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Electronics [warrantyInMonths=" + warrantyInMonths + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + warrantyInMonths;
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Electronics other = (Electronics) obj;
		if (warrantyInMonths != other.warrantyInMonths)
			return false;
		return true;
	}
	 
	 

}
