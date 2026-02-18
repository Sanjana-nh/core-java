class SwiggyExecutor{
	public static void main (String []args){
	String foodName = "Cheese Balls";
		double cost = Swiggy.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}