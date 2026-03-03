class ColinExecutor {
	public static void main(String[] args) {
		Colin colin = new Colin();
		
		colin.colinId = 789;
		System.out.println("The Colin ID is : " + colin.colinId);
		
		colin.colinPrice = 120.50;
		System.out.println("The Price is : " + colin.colinPrice);
		
		colin.colinType = "Glass Cleaner";
		System.out.println("The Product Type: " + colin.colinType);
		
		colin.colinManufactureDate = "15-01-2026";
		System.out.println("MFG Date: " + colin.colinManufactureDate);
		
		colin.colinExpiryDate = "15-01-2028";
		System.out.println("Expiry Date: " + colin.colinExpiryDate);
		
		colin.isRefillable = true;
		System.out.println("Is it refillable: " + colin.isRefillable);
		
		colin.isScented = true;
		System.out.println("Is it scented? " + colin.isScented);
		
		colin.isInStock = true;
		System.out.println("Is product in stock? " + colin.isInStock);
	}
}