package com.hsbc.businesslogic;

import java.util.Collections;
import java.util.List;
import com.hsbc.sortutil.SortWithQuantity;
import com.hsbc.dataaccess.DataAccess;
import com.hsbc.entityclasses.Product;

/**
 * This class represents Business Logic layer.
 * 
 * @author Jayprakash Chawla
 *
 */
public class BusinessLogic {

	private DataAccess da;

	public BusinessLogic() {
		da = new DataAccess();
	}

	public void addNewItem(Product p) {
		this.da.addNewItem(p);
	}

	public List<Product> getItems() {
		return this.da.getAllItems();
	}

	/**
	 * This method generates a report on basis of list object.
	 * @return
	 */
	public List generateReport() {
		SortWithQuantity swq = new SortWithQuantity();
		Collections.sort(this.getItems(), swq);
		return this.getItems();
	}
}
