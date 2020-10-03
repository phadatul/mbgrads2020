package com.hsbc.model;

public class Juice {
	
	int jid;
	String jname;
	int price;
	
	
	
	public Juice() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Juice(int jid, String jname, int price) {
		super();
		this.jid = jid;
		this.jname = jname;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jid;
		result = prime * result + ((jname == null) ? 0 : jname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
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
		Juice other = (Juice) obj;
		if (jid != other.jid)
			return false;
		if (jname == null) {
			if (other.jname != null)
				return false;
		} else if (!jname.equals(other.jname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Juice [jid=" + jid + ", jname=" + jname + ", price=" + price + "]";
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public double cost()
	{
		return 0;
	}
	
	

}
