package com.hsbc.datamodel;

public class Electronics {
	int eleid;
	int elename;
	int eleprice;
	int elewarranty;
	int quantity;
	public Electronics() {
		
	}
	public Electronics(int eleid, int elename, int eleprice, int elewarranty, int quantity) {
		super();
		this.eleid = eleid;
		this.elename = elename;
		this.eleprice = eleprice;
		this.elewarranty = elewarranty;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Electronics [eleid=" + eleid + ", elename=" + elename + ", eleprice=" + eleprice + ", elewarranty="
				+ elewarranty + ", quantity=" + quantity + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eleid;
		result = prime * result + elename;
		result = prime * result + eleprice;
		result = prime * result + elewarranty;
		result = prime * result + quantity;
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
		Electronics other = (Electronics) obj;
		if (eleid != other.eleid)
			return false;
		if (elename != other.elename)
			return false;
		if (eleprice != other.eleprice)
			return false;
		if (elewarranty != other.elewarranty)
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}
	

}
