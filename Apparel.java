package com.hsbc.entity;
/**
 * 
 * @author Siddhant
 *@purpose This is apparel class which stores cloths and inherits Product class
 */

public class Apparel extends Products{   //using inheritance for reusuability
	
	private String material;

	
	public Apparel() {																	//default constructer
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode,String itemName,double unitPrice,int quantity,String material) {  //parametrized constructer
		super(itemCode,itemName,unitPrice,quantity);
		this.material = material;
	
	}

	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}

	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Apparel [material=" + material + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((material == null) ? 0 : material.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Apparel other = (Apparel) obj;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		return true;
	}

	
	

}
