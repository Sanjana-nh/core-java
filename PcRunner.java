class PcRunner {
    public static void main(String[] args) {
        
        Pc pc1 = new Pc();
        pc1.pcName = "Gaming Beast V1";
        pc1.buildType = "High-End Gaming";
        
        Hardware hw1 = new Hardware();
        hw1.componentType = "Graphics Card";
        hw1.manufacturer = "NVIDIA";
        hw1.modelName = "RTX 4090";
        hw1.releaseYear = 2022;
        hw1.price = 1599.99;
        hw1.warrantyYears = 3;
        hw1.powerDrawWatts = 450;
        hw1.hasRGB = true;
        hw1.formFactor = "Triple Slot";
        hw1.weightInKg = 2.1;
        
        pc1.hardware = hw1;
        pc1.getPcDetails();

        Pc pc2 = new Pc();
        pc2.pcName = "Office Workstation";
        pc2.buildType = "Productivity";
        
        Hardware hw2 = new Hardware();
        hw2.componentType = "Processor";
        hw2.manufacturer = "Intel";
        hw2.modelName = "Core i5-13400";
        hw2.releaseYear = 2023;
        hw2.price = 239.00;
        hw2.warrantyYears = 3;
        hw2.powerDrawWatts = 65;
        hw2.hasRGB = false;
        hw2.formFactor = "LGA 1700";
        hw2.weightInKg = 0.05;
        
        pc2.hardware = hw2;
        pc2.getPcDetails();

        Pc pc3 = new Pc();
        pc3.pcName = "Budget Gamer";
        pc3.buildType = "Entry-Level Gaming";
        
        Hardware hw3 = new Hardware();
        hw3.componentType = "Graphics Card";
        hw3.manufacturer = "AMD";
        hw3.modelName = "Radeon RX 7600";
        hw3.releaseYear = 2023;
        hw3.price = 269.99;
        hw3.warrantyYears = 2;
        hw3.powerDrawWatts = 165;
        hw3.hasRGB = false;
        hw3.formFactor = "Dual Slot";
        hw3.weightInKg = 0.8;
        
        pc3.hardware = hw3;
        pc3.getPcDetails();

        Pc pc4 = new Pc();
        pc4.pcName = "Creator Pro Mac";
        pc4.buildType = "Video Editing";
        
        Hardware hw4 = new Hardware();
        hw4.componentType = "Processor";
        hw4.manufacturer = "Apple";
        hw4.modelName = "M2 Ultra";
        hw4.releaseYear = 2023;
        hw4.price = 999.00;
        hw4.warrantyYears = 1;
        hw4.powerDrawWatts = 60;
        hw4.hasRGB = false;
        hw4.formFactor = "SoC";
        hw4.weightInKg = 0.1;
        
        pc4.hardware = hw4;
        pc4.getPcDetails();

        Pc pc5 = new Pc();
        pc5.pcName = "Home Server";
        pc5.buildType = "NAS Storage";
        
        Hardware hw5 = new Hardware();
        hw5.componentType = "Hard Drive";
        hw5.manufacturer = "Seagate";
        hw5.modelName = "IronWolf 8TB";
        hw5.releaseYear = 2021;
        hw5.price = 189.99;
        hw5.warrantyYears = 3;
        hw5.powerDrawWatts = 9;
        hw5.hasRGB = false;
        hw5.formFactor = "3.5 Inch";
        hw5.weightInKg = 0.7;
        
        pc5.hardware = hw5;
        pc5.getPcDetails();

        Pc pc6 = new Pc();
        pc6.pcName = "Esports Rig";
        pc6.buildType = "Competitive Gaming";
        
        Hardware hw6 = new Hardware();
        hw6.componentType = "Motherboard";
        hw6.manufacturer = "ASUS";
        hw6.modelName = "ROG Strix B650E-F";
        hw6.releaseYear = 2022;
        hw6.price = 299.99;
        hw6.warrantyYears = 3;
        hw6.powerDrawWatts = 35;
        hw6.hasRGB = true;
        hw6.formFactor = "ATX";
        hw6.weightInKg = 1.2;
        
        pc6.hardware = hw6;
        pc6.getPcDetails();

        Pc pc7 = new Pc();
        pc7.pcName = "Streaming Setup";
        pc7.buildType = "Content Creation";
        
        Hardware hw7 = new Hardware();
        hw7.componentType = "Memory (RAM)";
        hw7.manufacturer = "Corsair";
        hw7.modelName = "Vengeance RGB 32GB";
        hw7.releaseYear = 2023;
        hw7.price = 119.99;
        hw7.warrantyYears = 10;
        hw7.powerDrawWatts = 5;
        hw7.hasRGB = true;
        hw7.formFactor = "DIMM";
        hw7.weightInKg = 0.15;
        
        pc7.hardware = hw7;
        pc7.getPcDetails();

        Pc pc8 = new Pc();
        pc8.pcName = "Mini ITX Build";
        pc8.buildType = "Compact PC";
        
        Hardware hw8 = new Hardware();
        hw8.componentType = "Power Supply";
        hw8.manufacturer = "Corsair";
        hw8.modelName = "SF750";
        hw8.releaseYear = 2020;
        hw8.price = 169.99;
        hw8.warrantyYears = 7;
        hw8.powerDrawWatts = 750;
        hw8.hasRGB = false;
        hw8.formFactor = "SFX";
        hw8.weightInKg = 0.9;
        
        pc8.hardware = hw8;
        pc8.getPcDetails();

        Pc pc9 = new Pc();
        pc9.pcName = "Data Science Workstation";
        pc9.buildType = "Machine Learning";
        
        Hardware hw9 = new Hardware();
        hw9.componentType = "Processor";
        hw9.manufacturer = "AMD";
        hw9.modelName = "Threadripper PRO 5995WX";
        hw9.releaseYear = 2022;
        hw9.price = 6499.00;
        hw9.warrantyYears = 3;
        hw9.powerDrawWatts = 280;
        hw9.hasRGB = false;
        hw9.formFactor = "sWRX8";
        hw9.weightInKg = 0.1;
        
        pc9.hardware = hw9;
        pc9.getPcDetails();

        Pc pc10 = new Pc();
        pc10.pcName = "Student Laptop Base";
        pc10.buildType = "Everyday Use";
        
        Hardware hw10 = new Hardware();
        hw10.componentType = "Solid State Drive";
        hw10.manufacturer = "Samsung";
        hw10.modelName = "980 PRO 1TB";
        hw10.releaseYear = 2021;
        hw10.price = 89.99;
        hw10.warrantyYears = 5;
        hw10.powerDrawWatts = 6;
        hw10.hasRGB = false;
        hw10.formFactor = "M.2 2280";
        hw10.weightInKg = 0.01;
        
        pc10.hardware = hw10;
        pc10.getPcDetails();

        Pc pc11 = new Pc();
        pc11.pcName = "Silent Build";
        pc11.buildType = "Audio Production";
        
        Hardware hw11 = new Hardware();
        hw11.componentType = "CPU Cooler";
        hw11.manufacturer = "Noctua";
        hw11.modelName = "NH-D15";
        hw11.releaseYear = 2014;
        hw11.price = 109.95;
        hw11.warrantyYears = 6;
        hw11.powerDrawWatts = 2;
        hw11.hasRGB = false;
        hw11.formFactor = "Tower Air Cooler";
        hw11.weightInKg = 1.3;
        
        pc11.hardware = hw11;
        pc11.getPcDetails();

        Pc pc12 = new Pc();
        pc12.pcName = "Custom Watercooled";
        pc12.buildType = "Enthusiast";
        
        Hardware hw12 = new Hardware();
        hw12.componentType = "PC Case";
        hw12.manufacturer = "Lian Li";
        hw12.modelName = "O11 Dynamic EVO";
        hw12.releaseYear = 2022;
        hw12.price = 159.99;
        hw12.warrantyYears = 1;
        hw12.powerDrawWatts = 0;
        hw12.hasRGB = true;
        hw12.formFactor = "Mid Tower";
        hw12.weightInKg = 13.2;
        
        pc12.hardware = hw12;
        pc12.getPcDetails();

        Pc pc13 = new Pc();
        pc13.pcName = "HTPC Living Room";
        pc13.buildType = "Media Center";
        
        Hardware hw13 = new Hardware();
        hw13.componentType = "Motherboard";
        hw13.manufacturer = "MSI";
        hw13.modelName = "MPG B550I GAMING EDGE";
        hw13.releaseYear = 2020;
        hw13.price = 199.99;
        hw13.warrantyYears = 3;
        hw13.powerDrawWatts = 25;
        hw13.hasRGB = false;
        hw13.formFactor = "Mini-ITX";
        hw13.weightInKg = 0.8;
        
        pc13.hardware = hw13;
        pc13.getPcDetails();

        Pc pc14 = new Pc();
        pc14.pcName = "1080p King";
        pc14.buildType = "Mid-Range Gaming";
        
        Hardware hw14 = new Hardware();
        hw14.componentType = "Processor";
        hw14.manufacturer = "AMD";
        hw14.modelName = "Ryzen 5 5600X";
        hw14.releaseYear = 2020;
        hw14.price = 159.00;
        hw14.warrantyYears = 3;
        hw14.powerDrawWatts = 65;
        hw14.hasRGB = false;
        hw14.formFactor = "AM4";
        hw14.weightInKg = 0.05;
        
        pc14.hardware = hw14;
        pc14.getPcDetails();

        Pc pc15 = new Pc();
        pc15.pcName = "Design Studio Pro";
        pc15.buildType = "3D Rendering";
        
        Hardware hw15 = new Hardware();
        hw15.componentType = "Graphics Card";
        hw15.manufacturer = "NVIDIA";
        hw15.modelName = "RTX 4080 Super";
        hw15.releaseYear = 2024;
        hw15.price = 999.00;
        hw15.warrantyYears = 3;
        hw15.powerDrawWatts = 320;
        hw15.hasRGB = true;
        hw15.formFactor = "Triple Slot";
        hw15.weightInKg = 1.8;
        
        pc15.hardware = hw15;
        pc15.getPcDetails();

        Pc pc16 = new Pc();
        pc16.pcName = "Retro Emulation Station";
        pc16.buildType = "Casual Gaming";
        
        Hardware hw16 = new Hardware();
        hw16.componentType = "Solid State Drive";
        hw16.manufacturer = "Crucial";
        hw16.modelName = "MX500 2TB";
        hw16.releaseYear = 2018;
        hw16.price = 129.99;
        hw16.warrantyYears = 5;
        hw16.powerDrawWatts = 3;
        hw16.hasRGB = false;
        hw16.formFactor = "2.5 Inch SATA";
        hw16.weightInKg = 0.04;
        
        pc16.hardware = hw16;
        pc16.getPcDetails();

        Pc pc17 = new Pc();
        pc17.pcName = "Ultimate 4K Rig";
        pc17.buildType = "High-End Gaming";
        
        Hardware hw17 = new Hardware();
        hw17.componentType = "Processor";
        hw17.manufacturer = "AMD";
        hw17.modelName = "Ryzen 7 7800X3D";
        hw17.releaseYear = 2023;
        hw17.price = 399.00;
        hw17.warrantyYears = 3;
        hw17.powerDrawWatts = 120;
        hw17.hasRGB = false;
        hw17.formFactor = "AM5";
        hw17.weightInKg = 0.05;
        
        pc17.hardware = hw17;
        pc17.getPcDetails();

        Pc pc18 = new Pc();
        pc18.pcName = "Enterprise Server Node";
        pc18.buildType = "Data Center";
        
        Hardware hw18 = new Hardware();
        hw18.componentType = "Memory (RAM)";
        hw18.manufacturer = "Kingston";
        hw18.modelName = "Server Premier 64GB ECC";
        hw18.releaseYear = 2022;
        hw18.price = 249.99;
        hw18.warrantyYears = 10;
        hw18.powerDrawWatts = 6;
        hw18.hasRGB = false;
        hw18.formFactor = "RDIMM";
        hw18.weightInKg = 0.02;
        
        pc18.hardware = hw18;
        pc18.getPcDetails();

        Pc pc19 = new Pc();
        pc19.pcName = "Power User Desktop";
        pc19.buildType = "Multitasking";
        
        Hardware hw19 = new Hardware();
        hw19.componentType = "Power Supply";
        hw19.manufacturer = "EVGA";
        hw19.modelName = "SuperNOVA 850 G6";
        hw19.releaseYear = 2021;
        hw19.price = 139.99;
        hw19.warrantyYears = 10;
        hw19.powerDrawWatts = 850;
        hw19.hasRGB = false;
        hw19.formFactor = "ATX";
        hw19.weightInKg = 1.6;
        
        pc19.hardware = hw19;
        pc19.getPcDetails();

        Pc pc20 = new Pc();
        pc20.pcName = "Showpiece Build";
        pc20.buildType = "Display PC";
        
        Hardware hw20 = new Hardware();
        hw20.componentType = "CPU Cooler";
        hw20.manufacturer = "NZXT";
        hw20.modelName = "Kraken Elite 360";
        hw20.releaseYear = 2023;
        hw20.price = 279.99;
        hw20.warrantyYears = 6;
        hw20.powerDrawWatts = 15;
        hw20.hasRGB = true;
        hw20.formFactor = "360mm AIO Liquid Cooler";
        hw20.weightInKg = 1.9;
        
        pc20.hardware = hw20;
        pc20.getPcDetails();
    }
}