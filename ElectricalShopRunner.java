class ElectricalShopRunner {
    public static void main(String[] args) {
        ElectricalShop shop = new ElectricalShop();

        shop.addAppliance("Refrigerator");
        shop.addAppliance("Washing Machine");
        shop.addAppliance("Microwave Oven");
        shop.addAppliance("Air Conditioner");
        shop.addAppliance("Ceiling Fan");
        shop.addAppliance("Television");
        shop.addAppliance("Water Heater");
        shop.addAppliance("Vacuum Cleaner");
        shop.addAppliance("Toaster");
        shop.addAppliance("Blender");
        shop.addAppliance("Electric Kettle");
        shop.addAppliance("Dishwasher");
        shop.addAppliance("Iron Box");
        shop.addAppliance("Hair Dryer");
        shop.addAppliance("Water Purifier");
        shop.addAppliance("Exhaust Fan");
        shop.addAppliance("Induction Cooktop");
        shop.addAppliance("Rice Cooker");
        shop.addAppliance("Air Purifier");
        shop.addAppliance("Coffee Maker");

        shop.getAppliances();
		shop.getAppliancesByIndex(5);
		shop.getIndexByAppliances("Washing Machine");
		shop.updateAppliances("Blender", "Hair Straightner");
		shop.getAppliances();
		shop.deleteAppliances("Rice Cooker");
		shop.getAppliances();
    }
}