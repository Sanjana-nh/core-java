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
}