package com.everyday.datastorage;

public class Electronics extends Items {
	
 public int warranty;
 
 public Electronics() {
	 
 }

public Electronics(int itemCode, String itemName, int unitPrice,int quantity,int warranty) {
	super(itemCode,itemName,unitPrice,quantity);
	this.warranty = warranty;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + warranty;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Electronics other = (Electronics) obj;
	if (warranty != other.warranty)
		return false;
	return true;
}

@Override
public String toString() {
	return "Electronics [warranty=" + warranty + ", itemCode=" + itemCode + ", itemName=" + itemName + ", unitPrice="
			+ unitPrice + ", quantity=" + quantity + "]";
}


 
 

}
