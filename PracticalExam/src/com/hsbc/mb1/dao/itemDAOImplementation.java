package com.hsbc.mb1.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class itemDAOImplementation 
{
	public class itemDAOImplementation implements itemDAO {
		private static Set<Apparel> apparelSet=new HashSet<>();
		private static Set<Electronics> electronicsSet=new HashSet<>();
		private static Set<Fooditems> fooditemsSet=new HashSet<>();
		
		@Override
		public Apparel createApparel(Apparel apparel) {
			// TODO Auto-generated method stub
			apparelSet.add(apparel);
			return apparel;
		}

		@Override
		public Electronics createElectronics(Electronics electronics) {
			electronicsSet.add(electronics);
			return electronics;
		}

		@Override
		public Fooditems createFooditems(Fooditems fooditems) {
			fooditemsSet.add(fooditems);
			return fooditems;
		}

		@Override
		public Collection<Apparel> fetchAllApparels() {
			// TODO Auto-generated method stub
			return apperalSet;
		}

		@Override
		public Collection<Electronics> Electronics() {
			// TODO Auto-generated method stub
			return electronicsSet;
		}

		@Override
		public Collection<	Fooditems> Fooditems() {
			// TODO Auto-generated method stub
			return fooditemsSet;
		}
	}
}
