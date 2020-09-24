package com.hsbc.retail.productstructure;

public class Apparel extends RetailProducts {
	private String apparelSize;
	private int apparelWarranty;
	private String apparelMaterial;
	
	public Apparel() {
		super();
	}

	public Apparel(int itemCode, String itemName, double unitPrice, int quantity, String apparelSize, int apparelWarranty, String apparelMaterial) {
		super(itemCode, itemName, unitPrice, quantity);
		this.apparelSize = apparelSize;
		this.apparelWarranty = apparelWarranty;
		this.apparelMaterial = apparelMaterial;
	}

	public String getApparelSize() {
		return apparelSize;
	}

	public void setApparelSize(String apparelSize) {
		this.apparelSize = apparelSize;
	}

	public int getApparelWarranty() {
		return apparelWarranty;
	}

	public void setApparelWarranty(int apparelWarranty) {
		this.apparelWarranty = apparelWarranty;
	}
	
	public String getApparelMaterial() {
		return apparelMaterial;
	}

	public void setApparelMaterial(String apparelMaterial) {
		this.apparelMaterial = apparelMaterial;
	}

	
	@Override
	public String toString() {
		return "Apparel [ItemCode=" + getItemCode() + ", ItemName=" + getItemName() + ", QuantitySold=" + getQuantity()
				+ ", Size=" + apparelSize + ", Material=" + apparelMaterial + "]";
	}
	
}
