class PillowExecutor{
	public static void main(String[] args) {
		Pillow pillow = new Pillow();
		
		pillow.pillowId = 763;
		System.out.println("The Pillow ID is : " + pillow.pillowId);
		
		pillow.pillowPrice = 899.00;
		System.out.println("The Price is : " + pillow.pillowPrice);
		
		pillow.pillowBrand = "Sleepwell";
		System.out.println("The Brand: " + pillow.pillowBrand);
		
		pillow.pillowMaterial = "Cotton";
		System.out.println("Material: " + pillow.pillowMaterial);
		
		pillow.pillowSize = "King Size";
		System.out.println("Size: " + pillow.pillowSize);
		
		pillow.isWashable = true;
		System.out.println("Is it washable: " + pillow.isWashable);
		
		pillow.isMemoryFoam = false;
		System.out.println("Is it memory foam? " + pillow.isMemoryFoam);
		
		pillow.isAvailable = true;
		System.out.println("Is product in stock? " + pillow.isAvailable);
	}
}