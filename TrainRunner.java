class TrainRunner {
    public static void main(String[] args) {
        Bogie b1 = new Bogie("D1", "Sleeper", 70, "Blue", 40.0, "ICF", 2000, true, 4, false);
        Train t1 = new Train("Jan-Shatabdi", 612571, b1);
        t1.displayDetails();

        Bogie b2 = new Bogie("A1", "AC 2-Tier", 52, "Red", 42.5, "RCF", 2015, true, 4, true);
        Train t2 = new Train("Rajdhani", 471276, b2);
        t2.displayDetails();

        Bogie b3 = new Bogie("C1", "Chair Car", 78, "White", 39.0, "ICF", 2022, true, 4, true);
        Train t3 = new Train("Vande Bharat", 20608, b3);
        t3.displayDetails();

        Bogie b4 = new Bogie("S5", "Sleeper", 72, "Blue", 38.5, "ICF", 2010, false, 4, false);
        Train t4 = new Train("Kaveri Express", 16021, b4);
        t4.displayDetails();

        Bogie b5 = new Bogie("H1", "First AC", 24, "Red", 45.0, "RCF", 2018, true, 4, true);
        Train t5 = new Train("Duronto", 12213, b5);
        t5.displayDetails();

        Bogie b6 = new Bogie("G3", "AC 3-Tier", 78, "Green", 41.0, "ICF", 2012, true, 4, true);
        Train t6 = new Train("Garib Rath", 12204, b6);
        t6.displayDetails();

        Bogie b7 = new Bogie("E1", "Exec Chair Car", 56, "Orange", 40.5, "RCF", 2019, true, 4, true);
        Train t7 = new Train("Tejas Express", 82902, b7);
        t7.displayDetails();

        Bogie b8 = new Bogie("B2", "AC 3-Tier", 72, "Blue", 41.8, "MCF", 2020, true, 4, true);
        Train t8 = new Train("Humsafar", 22317, b8);
        t8.displayDetails();

        Bogie b9 = new Bogie("S1", "Sleeper", 72, "Red", 38.0, "ICF", 2016, true, 4, false);
        Train t9 = new Train("Sampark Kranti", 12649, b9);
        t9.displayDetails();

        Bogie b10 = new Bogie("C5", "Chair Car", 78, "Grey", 39.5, "RCF", 2017, true, 4, true);
        Train t10 = new Train("Gatimaan", 12049, b10);
        t10.displayDetails();

        Bogie b11 = new Bogie("B4", "AC 3-Tier", 72, "Red LHB", 41.2, "MCF", 2018, true, 4, true);
        Train t11 = new Train("Coromandel", 12841, b11);
        t11.displayDetails();

        Bogie b12 = new Bogie("S10", "Sleeper", 72, "Yellow", 38.9, "ICF", 2014, false, 4, false);
        Train t12 = new Train("Vivek Express", 15905, b12);
        t12.displayDetails();

        Bogie b13 = new Bogie("A2", "AC 2-Tier", 52, "Red", 42.0, "RCF", 2017, true, 4, true);
        Train t13 = new Train("Kalka Mail", 12311, b13);
        t13.displayDetails();

        Bogie b14 = new Bogie("UR3", "General", 100, "Red-Yellow", 37.5, "ICF", 2018, true, 4, false);
        Train t14 = new Train("Antyodaya", 22877, b14);
        t14.displayDetails();

        Bogie b15 = new Bogie("PC", "Pantry", 15, "Red", 43.0, "MCF", 2015, true, 2, false);
        Train t15 = new Train("Goa Express", 12779, b15);
        t15.displayDetails();

        Bogie b16 = new Bogie("S2", "Sleeper", 72, "Yellow", 39.1, "ICF", 2011, false, 4, false);
        Train t16 = new Train("Navjivan Express", 12656, b16);
        t16.displayDetails();

        Bogie b17 = new Bogie("B3", "AC 3-Tier", 72, "Red LHB", 41.5, "RCF", 2019, true, 4, true);
        Train t17 = new Train("Kerala Express", 12626, b17);
        t17.displayDetails();

        Bogie b18 = new Bogie("M1", "Metro", 300, "Silver", 42.0, "BEML", 2021, false, 8, true);
        Train t18 = new Train("Namma Metro", 33001, b18);
        t18.displayDetails();

        Bogie b19 = new Bogie("C3", "Double Decker", 120, "Orange", 44.5, "RCF", 2017, true, 4, true);
        Train t19 = new Train("Uday Express", 22666, b19);
        t19.displayDetails();

        Bogie b20 = new Bogie("S7", "Sleeper", 72, "Red", 38.2, "ICF", 2013, false, 4, false);
        Train t20 = new Train("Saurashtra Mail", 22945, b20);
        t20.displayDetails();
    }
}