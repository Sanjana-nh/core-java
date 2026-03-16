class Coffee {
    String coffeeId;
    String coffeeName;
    String size;
    double priceRs;
    boolean isHot;
    String milkType;
    String sweetnessLevel;
    int calories;
    String roastType;
    boolean hasWhippedCream;

    public void getCoffeeDetails() {
        System.out.println("------------------------");
        System.out.println("The Coffee Details are:");
        System.out.println("Coffee ID : " + coffeeId);
        System.out.println("Name : " + coffeeName);
        System.out.println("Size : " + size);
        System.out.println("Price (Rs) : " + priceRs);
        System.out.println("Is Hot : " + isHot);
        System.out.println("Milk Type : " + milkType);
        System.out.println("Sweetness : " + sweetnessLevel);
        System.out.println("Calories : " + calories);
        System.out.println("Roast Type : " + roastType);
        System.out.println("Whipped Cream : " + hasWhippedCream);
    }
}



