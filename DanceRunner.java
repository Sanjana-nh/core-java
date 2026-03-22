class DanceRunner {
    public static void main(String[] args) {
        Form f1 = new Form("Bharatanatyam", "Tamil Nadu", 200, "Ghungroo", 1, 45.0, true, "Red/Gold", "Mridangam", "High");
        Dance d1 = new Dance("Cultural Fest", "Town Hall", f1); d1.displayDetails();

        Form f2 = new Form("Kathak", "UP", 400, "Ghungroo", 2, 30.0, true, "Yellow", "Tabla", "High");
        Dance d2 = new Dance("Spring Festival", "Open Air Theatre", f2); d2.displayDetails();

        Form f3 = new Form("Kuchipudi", "Andhra Pradesh", 1500, "Brass Plate", 1, 40.0, true, "Green/Pink", "Violin", "Very High");
        Dance d3 = new Dance("Formation Day", "Palace Grounds", f3); d3.displayDetails();

        Form f4 = new Form("Odissi", "Odisha", 200, "Silver Jewelry", 3, 35.0, true, "White/Red", "Pakhawaj", "Medium");
        Dance d4 = new Dance("Heritage Night", "Kala Mandir", f4); d4.displayDetails();

        Form f5 = new Form("Kathakali", "Kerala", 1600, "Facial Masks", 5, 60.0, true, "Green/Red", "Chenda", "High");
        Dance d5 = new Dance("Temple Utsav", "Courtyard", f5); d5.displayDetails();

        Form f6 = new Form("Bhangra", "Punjab", 1400, "Kato", 8, 15.0, false, "Orange", "Dhol", "Medium");
        Dance d6 = new Dance("Harvest", "Village Square", f6); d6.displayDetails();

        Form f7 = new Form("Garba", "Gujarat", 1000, "Clay Lantern", 20, 120.0, false, "Multi", "Dholak", "Low");
        Dance d7 = new Dance("Navratri Utsav", "Community Hall", f7); d7.displayDetails();

        Form f8 = new Form("Ghoomar", "Rajasthan", 1300, "Veil", 10, 20.0, false, "Maroon", "Shenai", "Medium");
        Dance d8 = new Dance("Rajputana Night", "City Palace", f8); d8.displayDetails();

        Form f9 = new Form("Bihu", "Assam", 1100, "Japi", 12, 25.0, false, "Brown", "Pepa", "Low");
        Dance d9 = new Dance("Bihu Fest", "River Bank", f9); d9.displayDetails();

        Form f10 = new Form("Yakshagana", "Karnataka", 1500, "Headgear", 6, 180.0, false, "Red/Yellow", "Chande", "Very High");
        Dance d10 = new Dance("Folk Arts", "Ravindra Kalakshetra", f10); d10.displayDetails();

        Form f11 = new Form("Lavani", "Maharashtra", 1700, "Saree", 4, 20.0, false, "Purple", "Dholki", "Medium");
        Dance d11 = new Dance("Monsoon Mela", "Shilparamam", f11); d11.displayDetails();

        Form f12 = new Form("Rouf", "J&K", 1200, "Anklets", 15, 15.0, false, "Blue", "Vocal", "Low");
        Dance d12 = new Dance("Winter Solstice", "Dal Lake", f12); d12.displayDetails();

        Form f13 = new Form("Chhau", "West Bengal", 1800, "Sword/Shield", 10, 40.0, false, "Blue", "Dhumsa", "High");
        Dance d13 = new Dance("Tribal Fest", "Maidan", f13); d13.displayDetails();

        Form f14 = new Form("Kalbelia", "Rajasthan", 1900, "Beads", 3, 25.0, false, "Black", "Poongi", "Medium");
        Dance d14 = new Dance("Desert Fest", "Sand Dunes", f14); d14.displayDetails();

        Form f15 = new Form("Manipuri", "Manipur", 1400, "Potloi", 4, 30.0, true, "Green/Gold", "Pung", "Medium");
        Dance d15 = new Dance("Univ Fest", "Auditorium", f15); d15.displayDetails();

        Form f16 = new Form("Mohiniyattam", "Kerala", 1600, "Jasmine", 1, 35.0, true, "White/Gold", "Edakka", "High");
        Dance d16 = new Dance("Womens Day", "Kerala Samajam", f16); d16.displayDetails();

        Form f17 = new Form("Sattriya", "Assam", 1500, "Cymbals", 6, 50.0, true, "White", "Khol", "Medium");
        Dance d17 = new Dance("Prayer", "Sattriya Math", f17); d17.displayDetails();

        Form f18 = new Form("Dollu Kunitha", "Karnataka", 1700, "Drum", 12, 20.0, false, "Black/Yellow", "Dollu", "Medium");
        Dance d18 = new Dance("Parade", "Grounds", f18); d18.displayDetails();

        Form f19 = new Form("Kamsale", "Karnataka", 1800, "Brass Cymbals", 5, 15.0, false, "Orange", "Kamsale", "High");
        Dance d19 = new Dance("Fair", "Panchayat", f19); d19.displayDetails();

        Form f20 = new Form("Dandiya", "Gujarat", 1200, "Sticks", 50, 180.0, false, "Mix", "Dhol", "Low");
        Dance d20 = new Dance("Gathering", "Compound", f20); d20.displayDetails();
    }
}