class ECommerce {
    String productNames[] = new String[26];
    int index;

    public boolean addProductName(String productName) {
        boolean isProductNameAdded = false;
        if (productName != null && !productName.isEmpty()) {
            productNames[index] = productName;
            index++;
            isProductNameAdded = true; 
        } else {
            System.out.println(productName + "is invalid");
        }
        return isProductNameAdded;
    }

    public void getProductNames() {
        for(String productName : productNames) {
            System.out.println(productName);
        }
    }
public String getProductNamesByIndex (int index){
	String productName = null ;
	if (index < productNames .length){
		productName  = productNames [index];
		System.out.println("The productName  at index " + index  +" is: " + productName );
	}
	else {
		System.out.println("In valid value " + index);
	}
	return productName ;
}

	public int getIndexByProductNames(String productName ){
	int index = 0;
    for (String cproductName  : productNames ) {
        if (cproductName  == productName  ) {
			System.out.println("The index of " + cproductName  + "is: " + index);
            return index; 
        }
		else{
			 index++;
		}
		
    }
	System.out.println ("Invalid Name");

	return index ;
}
public boolean updateProductNames(String existingProductName , String updateProductName){
	boolean isProductNameUpdated = false;
	for(int index = 0 ; index< productNames.length;index++){
		if (productNames[index] == existingProductName){
			productNames[index] = updateProductName ;
			isProductNameUpdated = true;
			System.out.println("The updated name of " + existingProductName + " is :" + updateProductName);
		}
		
	}
	if (isProductNameUpdated == false){
		System.out.println("Faild to Update the Data");
	}
	return isProductNameUpdated;
}

public boolean deleteProductNames(String productName){
    boolean isProductNameDeleted = false;

    for(int index = 0; index < productNames.length; index++){
        if(productNames[index] != null && productNames[index].equals(productName)){
            productNames[index] = null;
            isProductNameDeleted = true;
            System.out.println(productName+ " is deleted");
            break;
        }
    }

    if(isProductNameDeleted == false){
        System.out.println(productName + " not found");
    }

    return isProductNameDeleted;
}
}