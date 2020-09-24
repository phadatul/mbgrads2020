package com.hsbc.mb1.dao;

import java.util.Collection;
import com.hsbc.mb1.model.*;

public interface itemDAO {
	
	public Apparel createApparel(Apparel apparel);

	public Electronics createElectronics(Electronics electronics);

	public FoodItems createFoodItems(FoodItems foodItems);

	public Collection<Apparel> fetchAllApparels();

	public Collection<Electronics> Electronics();

	public Collection<FoodItems> FoodItems();

}
