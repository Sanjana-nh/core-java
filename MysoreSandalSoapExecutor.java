class MysoreSandalSoapExecutor {
	public static void main(String[] args) {
		MysoreSandalSoap soap = new MysoreSandalSoap();
		
		soap.soapId = 2026;
		System.out.println("The Soap ID is : " + soap.soapId);
		
		soap.soapPrice = 85.00;
		System.out.println("The Price is : " + soap.soapPrice);
		
		soap.soapWeight = "150g";
		System.out.println("The Weight: " + soap.soapWeight);
		
		soap.soapFragrance = "Sandalwood";
		System.out.println("The Fragrance: " + soap.soapFragrance);
		
		soap.soapManufactureDate = "01-03-2026";
		System.out.println("MFG Date: " + soap.soapManufactureDate);
		
		soap.isOrganic = true;
		System.out.println("Is it organic: " + soap.isOrganic);
		
		soap.isHandmade = false;
		System.out.println("Is it handmade? " + soap.isHandmade);
		
		soap.isDiscountAvailable = true;
		System.out.println("Is discount available? " + soap.isDiscountAvailable);
	}
}