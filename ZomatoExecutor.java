class ZomatoExecutor{
	public static void main (String []args){
	String foodName = "Egg Curry";
		double cost = Zomato.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}