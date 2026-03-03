class AgarbattiExecutor{
	public static void main(String[] args) {
		Agarbatti agarbatti = new Agarbatti();
		
		agarbatti.agarbattiId = 587;
		System.out.println("The Agarbatti ID is : " + agarbatti.agarbattiId);
		
		agarbatti.agarbattiPrice = 60.00;
		System.out.println("The Price is : " + agarbatti.agarbattiPrice);
		
		agarbatti.agarbattiBrand = "Cycle Pure";
		System.out.println("The Brand: " + agarbatti.agarbattiBrand);
		
		agarbatti.agarbattiFragrance = "Mogra";
		System.out.println("The Fragrance: " + agarbatti.agarbattiFragrance);
		
		agarbatti.sticksCount = 40;
		System.out.println("Number of sticks: " + agarbatti.sticksCount);
		
		agarbatti.isHandrolled = true;
		System.out.println("Is it hand-rolled: " + agarbatti.isHandrolled);
		
		agarbatti.isCharcoalFree = true;
		System.out.println("Is it charcoal-free? " + agarbatti.isCharcoalFree);
		
		agarbatti.isInStock = true;
		System.out.println("Is product in stock? " + agarbatti.isInStock);
	}
}