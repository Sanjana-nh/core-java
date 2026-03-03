class MilitaryHotelExecutor {
    public static void main(String[] args) {
        MilitaryHotel order = new MilitaryHotel();
        
        order.hotelId = 363;
        System.out.println("Hotel ID: " + order.hotelId);
        
        order.hotelName = "Shivaji Military Hotel";
        System.out.println("Hotel Name: " + order.hotelName);
        
        order.dishName = "Mutton Biryani";
        System.out.println("Dish ordered: " + order.dishName);
        
        order.price = 350.00;
        System.out.println("Price: " + order.price);
        
        order.quantity = 2;
        System.out.println("Quantity: " + order.quantity);
        
        order.isSpicy = true;
        System.out.println("Is it spicy? " + order.isSpicy);
        
        order.isNonVeg = true;
        System.out.println("Is it Non-Veg? " + order.isNonVeg);
        
        order.isTakeaway = false;
        System.out.println("Is it a takeaway? " + order.isTakeaway);
    }
}