class DoloExecutor {
	public static void main(String[] args) {
		Dolo tablet = new Dolo();
		
		tablet.tabletId = 650;
		System.out.println("The Tablet ID is : " + tablet.tabletId);
		
		tablet.tabletPrice = 30.50;
		System.out.println("The Price is : " + tablet.tabletPrice);
		
		tablet.tabletMg = "650mg";
		System.out.println("The Dosage: " + tablet.tabletMg);
		
		tablet.manufactureDate = "10-02-2026";
		System.out.println("MFG Date: " + tablet.manufactureDate);
		
		tablet.expiryDate = "10-02-2028";
		System.out.println("Expiry Date: " + tablet.expiryDate);
		
		tablet.isPrescriptionRequired = false;
		System.out.println("Is prescription required: " + tablet.isPrescriptionRequired);
		
		tablet.isAvailable = true;
		System.out.println("Is it in stock? " + tablet.isAvailable);
		
		tablet.isGeneric = true;
		System.out.println("Is it a generic medicine? " + tablet.isGeneric);
	}
}