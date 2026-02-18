class BistroExecutor{
	public static void main (String []args){
	String foodName = "Garlic Mushroom Toast";
		double cost = Bistro.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}