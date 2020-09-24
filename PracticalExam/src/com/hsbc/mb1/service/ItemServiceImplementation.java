package com.hsbc.mb1.service;

import java.util.Collection;
import com.hsbc.mb1.model.*;

public class ItemServiceImplementation {
	
	public class ItemServiceImpl implements ItemService{
		
		itemDAO dao= new itemDAOImplementation();
		
		@Override
		public Apparel createApparel(String itemName, int itemCode, int itemQuantity, double itemPrice, String size, String material) {
			Apparel Apparel=new Apparel( itemName,  itemCode,  itemQuantity,  itemPrice,  size, material);
			Apparel ApparelCreated=this.dao.createApparel(Apparel);
			return ApparelCreated;
			
		}

		@Override
		public Electronics createElectronics(String itemName, int itemCode, int itemQuantity,
			double itemPrice, int warranty) {
			Electronics electronics=new Electronics(  itemName,  itemCode,  itemQuantity, itemPrice,  warranty);
			Electronics electronicsCreated=this.dao.createElectronics(electronics);
			return electronicsCreated;
		}

		@Override
		public FoodItems creatFoodItems(String itemName, int itemCode, int itemQuantity,double itemPrice, int dateManfacturingMonth, int dateManfacturingYear, int dateExpiryMonth,Boolean Vegitarian) {
			FoodItems foodItems = new FoodItems(itemName, itemCode, itemQuantity, itemPrice, dateManfacturingMonth, dateManfacturingYear, dateExpiryMonth, Vegitarian);
			return foodItems;
		}

		@Override
		public Collection<Apparel> fetchAllApparels() {
			// TODO Auto-generated method stub
			return this.dao.fetchAllApparels();
		}

		@Override
		public Collection<Electronics> Electronics() {
			// TODO Auto-generated method stub
			return this.dao.Electronics();
		}

		@Override
		public Collection<FoodItems> FoodItems() {
			// TODO Auto-generated method stub
			return this.dao.FoodItems();

}
