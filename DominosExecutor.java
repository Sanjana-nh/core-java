class DominosExecutor{
	public static void main (String []args){
	String foodName = "Chicken Sausage Pizza";
		double cost = Dominos.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}