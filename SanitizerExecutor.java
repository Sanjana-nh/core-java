class SanitizerExecutor {
	public static void main(String[] args) {
		Sanitizer sanitizer = new Sanitizer();
		
		sanitizer.sanitizerId = 334;
		System.out.println("The Sanitizer ID is : " + sanitizer.sanitizerId);
		
		sanitizer.sanitizerPrice = 55.00;
		System.out.println("The Price is : " + sanitizer.sanitizerPrice);
		
		sanitizer.sanitizerBrand = "Dettol";
		System.out.println("The Brand: " + sanitizer.sanitizerBrand);
		
		sanitizer.alcoholPercentage = "75%";
		System.out.println("Alcohol Content: " + sanitizer.alcoholPercentage);
		
		sanitizer.sanitizerVolume = "100ml";
		System.out.println("Volume: " + sanitizer.sanitizerVolume);
		
		sanitizer.isGelBased = true;
		System.out.println("Is it gel-based: " + sanitizer.isGelBased);
		
		sanitizer.isScented = false;
		System.out.println("Is it scented? " + sanitizer.isScented);
		
		sanitizer.isAvailable = true;
		System.out.println("Is product in stock? " + sanitizer.isAvailable);
	}
}