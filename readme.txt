Layer 				File				Description
Entity Classes			Apparel.java			these are used to create entities 
				Electronic.java			these are used to create entities
				FoodItem.java			these are used to create entities an

Business Logic			CompareFoodByQuantity.java		these are used to implement comparator for entity classes 
				CompareApparelByQuantity.java	these are used to implement comparator for entity classes
				CompareElectronicsByQuantity.java	these are used to implement comparator for entity classes
				SortItems.java			to sort all the items belionging to a particular entity
				DisplayItems.java			to print all required fiels

Data Access Layer			DataAccess.java			to add and retrieve records

Exception Layer			InvalidCategoryException.java		to check category of item
				ItemCodeAlreadyPresentException.java	to check if item is present

View Layer			Demo.java			implements main method to execute entire program