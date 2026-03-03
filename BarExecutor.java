class BarExecutor {
    public static void main(String[] args) {
        Bar order = new Bar();
        
        order.orderId = 731;
        System.out.println("Order ID: " + order.orderId);
        
        order.brandName = "Kingfisher";
        System.out.println("Brand Name: " + order.brandName);
        
        order.category = "Mild Beer";
        System.out.println("Category: " + order.category);
        
        order.price = 280.00;
        System.out.println("Price: " + order.price);
        
        order.quantity = 3;
        System.out.println("Quantity: " + order.quantity);
        
        order.isChilled = true;
        System.out.println("Is it chilled? " + order.isChilled);
        
        order.isImported = false;
        System.out.println("Is it imported? " + order.isImported);
        
        order.isPaid = true;
        System.out.println("Payment Status: " + order.isPaid);
    }
}