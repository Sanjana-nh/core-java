class EatsureExecutor{
	public static void main (String []args){
	String foodName = "Paneer Shawarma";
		double cost = Eatsure.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}