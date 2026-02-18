class EatClubExecutor{
	public static void main (String []args){
	String foodName = "Japanese Curry Chicken";
		double cost = EatClub.search(foodName);
		System.out.println("The cost of " + foodName + " is " + cost);
	}
}