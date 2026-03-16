class Groww {
    String accountHolderName;
    String dematAccountNumber;
    Stock stock;

    public void getGrowwDetails() {
        System.out.println("========================");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Demat A/C : " + dematAccountNumber);
        this.stock.getStockDetails();
    }
}