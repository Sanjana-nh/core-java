class UberEatsExecutor{
	public static void main (String []args){
	String foodName = "Mysore Pak";
		double cost = UberEats.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}