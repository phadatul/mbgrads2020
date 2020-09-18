package com.hsbc.ecommerce.services;

import com.hsbc.ecommerce.model.Candy;
import com.hsbc.ecommerce.model.Cookie;
import com.hsbc.ecommerce.model.DessertItem;
import com.hsbc.ecommerce.model.IceCream;
import com.hsbc.ecommerce.model.Sundae;

public class TestCheckout {
	public static void main(String[] args) {

		Candy candy = new Candy("OrangeCandy", 250);
		Cookie cookie = new Cookie("ChocolateCookie", 10);
		IceCream iceCream = new IceCream("Vanilla");
		Sundae sundae = new Sundae("Vanilla with cherry");
		
		DessertItem items[]= {candy,cookie,iceCream,sundae};
		
		Checkout c=new Checkout();
		c.addItems(items);
		
		System.out.println(c);
		c.clearCart();
		System.out.println(c);
	}

}
