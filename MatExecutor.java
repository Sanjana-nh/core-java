class MatExecutor {
	public static void main(String[] args) {
		Mat mat = new Mat();
		
		mat.matId =88;
		System.out.println("The Mat ID is : " + mat.matId);
		
		mat.matPrice = 450.75;
		System.out.println("The Price is : " + mat.matPrice);
		
		mat.matBrand = "Kurl-on";
		System.out.println("The Brand: " + mat.matBrand);
		
		mat.matMaterial = "Rubber";
		System.out.println("Material: " + mat.matMaterial);
		
		mat.matDimensions = "6x4 Feet";
		System.out.println("Dimensions: " + mat.matDimensions);
		
		mat.isAntiSkid = true;
		System.out.println("Is it anti-skid: " + mat.isAntiSkid);
		
		mat.isWaterproof = true;
		System.out.println("Is it waterproof? " + mat.isWaterproof);
		
		mat.isEcoFriendly = false;
		System.out.println("Is it eco-friendly? " + mat.isEcoFriendly);
	}
}