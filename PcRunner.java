class PcRunner {
    public static void main(String[] args) {
        Hardware h1 = new Hardware("GPU", "NVIDIA", "RTX 4090", 2022, 1599.99, 3, 450, true, "Triple Slot", 2.1);
        Pc p1 = new Pc("Gaming Beast", "High-End", h1); p1.displayDetails();

        Hardware h2 = new Hardware("CPU", "Intel", "Core i5", 2023, 239.0, 3, 65, false, "LGA1700", 0.05);
        Pc p2 = new Pc("Workstation", "Productivity", h2); p2.displayDetails();

        Hardware h3 = new Hardware("GPU", "AMD", "RX 7600", 2023, 269.99, 2, 165, false, "Dual Slot", 0.8);
        Pc p3 = new Pc("Budget Gamer", "Entry Level", h3); p3.displayDetails();

        Hardware h4 = new Hardware("CPU", "Apple", "M2 Ultra", 2023, 999.0, 1, 60, false, "SoC", 0.1);
        Pc p4 = new Pc("Mac Pro", "Video Editing", h4); p4.displayDetails();

        Hardware h5 = new Hardware("HDD", "Seagate", "IronWolf 8TB", 2021, 189.99, 3, 9, false, "3.5", 0.7);
        Pc p5 = new Pc("NAS", "Storage", h5); p5.displayDetails();

        Hardware h6 = new Hardware("Motherboard", "ASUS", "B650E", 2022, 299.99, 3, 35, true, "ATX", 1.2);
        Pc p6 = new Pc("Esports", "Competitive", h6); p6.displayDetails();

        Hardware h7 = new Hardware("RAM", "Corsair", "Vengeance 32GB", 2023, 119.99, 10, 5, true, "DIMM", 0.15);
        Pc p7 = new Pc("Streamer", "Content", h7); p7.displayDetails();

        Hardware h8 = new Hardware("PSU", "Corsair", "SF750", 2020, 169.99, 7, 750, false, "SFX", 0.9);
        Pc p8 = new Pc("Mini Build", "Compact", h8); p8.displayDetails();

        Hardware h9 = new Hardware("CPU", "AMD", "Threadripper", 2022, 6499.0, 3, 280, false, "sWRX8", 0.1);
        Pc p9 = new Pc("Data Science", "ML", h9); p9.displayDetails();

        Hardware h10 = new Hardware("SSD", "Samsung", "980 PRO", 2021, 89.99, 5, 6, false, "M.2", 0.01);
        Pc p10 = new Pc("Student", "Everyday", h10); p10.displayDetails();

        Hardware h11 = new Hardware("Cooler", "Noctua", "NH-D15", 2014, 109.95, 6, 2, false, "Tower", 1.3);
        Pc p11 = new Pc("Silent", "Audio", h11); p11.displayDetails();

        Hardware h12 = new Hardware("Case", "Lian Li", "O11 EVO", 2022, 159.99, 1, 0, true, "Mid Tower", 13.2);
        Pc p12 = new Pc("Watercooled", "Enthusiast", h12); p12.displayDetails();

        Hardware h13 = new Hardware("Motherboard", "MSI", "B550I", 2020, 199.99, 3, 25, false, "ITX", 0.8);
        Pc p13 = new Pc("HTPC", "Media", h13); p13.displayDetails();

        Hardware h14 = new Hardware("CPU", "AMD", "5600X", 2020, 159.0, 3, 65, false, "AM4", 0.05);
        Pc p14 = new Pc("1080p King", "Mid-Range", h14); p14.displayDetails();

        Hardware h15 = new Hardware("GPU", "NVIDIA", "RTX 4080", 2024, 999.0, 3, 320, true, "Triple Slot", 1.8);
        Pc p15 = new Pc("Design", "3D", h15); p15.displayDetails();

        Hardware h16 = new Hardware("SSD", "Crucial", "MX500", 2018, 129.99, 5, 3, false, "SATA", 0.04);
        Pc p16 = new Pc("Retro", "Casual", h16); p16.displayDetails();

        Hardware h17 = new Hardware("CPU", "AMD", "7800X3D", 2023, 399.0, 3, 120, false, "AM5", 0.05);
        Pc p17 = new Pc("4K Rig", "High-End", h17); p17.displayDetails();

        Hardware h18 = new Hardware("RAM", "Kingston", "ECC 64GB", 2022, 249.99, 10, 6, false, "RDIMM", 0.02);
        Pc p18 = new Pc("Server", "Data Center", h18); p18.displayDetails();

        Hardware h19 = new Hardware("PSU", "EVGA", "850 G6", 2021, 139.99, 10, 850, false, "ATX", 1.6);
        Pc p19 = new Pc("Power User", "Multi", h19); p19.displayDetails();

        Hardware h20 = new Hardware("Cooler", "NZXT", "Kraken Elite", 2023, 279.99, 6, 15, true, "AIO", 1.9);
        Pc p20 = new Pc("Showpiece", "Display", h20); p20.displayDetails();
    }
}