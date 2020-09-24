package com.practical.DAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.practical.entity.Products;
import com.practical.services.CompareProductByQuantity;
/**
 * 
 * @author Swarga Sarkar
 * @purpose This implements all the methods of ProductsDAO interface
 *
 */

public class ProductsDAOImpl implements ProductsDAO {
	
	public List<Products> productList;
	public ProductsDAOImpl() {
		productList= new ArrayList<Products>();
	}

	@Override
	public List<Products> getProducts(List list) {
		// TODO Auto-generated method stub
		ArrayList<Products> newList= new ArrayList<>();
		Collections.sort(list, new CompareProductByQuantity());
		for(int i=0;i<3;i++)
		{
			newList.add((Products) list.get(i));
		}
		return newList;
	}

	@Override
	public void addProduct(Products p) {
		
		productList.add(p);
		
	}

	@Override
	public List<Products> getAllProducts() {
		// TODO Auto-generated method stub
		return this.productList;
	}

}
