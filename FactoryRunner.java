class FactoryRunner {
    public static void main(String[] args) {
        
        Factory f1 = new Factory();
        f1.factoryName = "Peenya Auto Parts"; f1.industrialSector = "Automotive";
        Machine m1 = new Machine();
        m1.machineId = "MAC-001"; m1.machineName = "CNC Lathe"; m1.manufacturer = "Haas"; m1.installationYear = 2018; m1.powerDrawKW = 15.5; m1.operatingTempC = 45.0; m1.isAutomated = true; m1.maintenanceIntervalDays = 30; m1.operatorRole = "CNC Machinist"; m1.weightTons = 4.5;
        f1.machine = m1; f1.getFactoryDetails();

        Factory f2 = new Factory();
        f2.factoryName = "Bommasandra Textiles"; f2.industrialSector = "Garments";
        Machine m2 = new Machine();
        m2.machineId = "MAC-002"; m2.machineName = "Industrial Loom"; m2.manufacturer = "Toyota"; m2.installationYear = 2015; m2.powerDrawKW = 8.0; m2.operatingTempC = 35.0; m2.isAutomated = true; m2.maintenanceIntervalDays = 60; m2.operatorRole = "Loom Technician"; m2.weightTons = 2.1;
        f2.machine = m2; f2.getFactoryDetails();

        Factory f3 = new Factory();
        f3.factoryName = "Whitefield Electronics"; f3.industrialSector = "PCB Assembly";
        Machine m3 = new Machine();
        m3.machineId = "MAC-003"; m3.machineName = "Pick and Place Machine"; m3.manufacturer = "Yamaha"; m3.installationYear = 2021; m3.powerDrawKW = 5.2; m3.operatingTempC = 25.0; m3.isAutomated = true; m3.maintenanceIntervalDays = 15; m3.operatorRole = "SMT Operator"; m3.weightTons = 1.2;
        f3.machine = m3; f3.getFactoryDetails();

        Factory f4 = new Factory();
        f4.factoryName = "Jigani Marble Works"; f4.industrialSector = "Construction Materials";
        Machine m4 = new Machine();
        m4.machineId = "MAC-004"; m4.machineName = "Stone Cutter"; m4.manufacturer = "Breton"; m4.installationYear = 2010; m4.powerDrawKW = 45.0; m4.operatingTempC = 60.0; m4.isAutomated = false; m4.maintenanceIntervalDays = 10; m4.operatorRole = "Heavy Cutter"; m4.weightTons = 8.0;
        f4.machine = m4; f4.getFactoryDetails();

        Factory f5 = new Factory();
        f5.factoryName = "Narasapura Aerospace"; f5.industrialSector = "Aviation Parts";
        Machine m5 = new Machine();
        m5.machineId = "MAC-005"; m5.machineName = "5-Axis Milling Machine"; m5.manufacturer = "DMG Mori"; m5.installationYear = 2023; m5.powerDrawKW = 25.0; m5.operatingTempC = 40.0; m5.isAutomated = true; m5.maintenanceIntervalDays = 45; m5.operatorRole = "Precision Engineer"; m5.weightTons = 6.5;
        f5.machine = m5; f5.getFactoryDetails();

        Factory f6 = new Factory();
        f6.factoryName = "Bidadi Food Processors"; f6.industrialSector = "FMCG";
        Machine m6 = new Machine();
        m6.machineId = "MAC-006"; m6.machineName = "Dough Mixer"; m6.manufacturer = "Hobart"; m6.installationYear = 2019; m6.powerDrawKW = 12.0; m6.operatingTempC = 30.0; m6.isAutomated = false; m6.maintenanceIntervalDays = 20; m6.operatorRole = "Food Technician"; m6.weightTons = 1.5;
        f6.machine = m6; f6.getFactoryDetails();

        Factory f7 = new Factory();
        f7.factoryName = "Doddaballapur Polymers"; f7.industrialSector = "Plastics";
        Machine m7 = new Machine();
        m7.machineId = "MAC-007"; m7.machineName = "Injection Molder"; m7.manufacturer = "Engel"; m7.installationYear = 2017; m7.powerDrawKW = 55.0; m7.operatingTempC = 220.0; m7.isAutomated = true; m7.maintenanceIntervalDays = 30; m7.operatorRole = "Molding Supervisor"; m7.weightTons = 12.0;
        f7.machine = m7; f7.getFactoryDetails();

        Factory f8 = new Factory();
        f8.factoryName = "Hoskote Metal Works"; f8.industrialSector = "Metallurgy";
        Machine m8 = new Machine();
        m8.machineId = "MAC-008"; m8.machineName = "Hydraulic Press"; m8.manufacturer = "Schuler"; m8.installationYear = 2012; m8.powerDrawKW = 80.0; m8.operatingTempC = 50.0; m8.isAutomated = false; m8.maintenanceIntervalDays = 60; m8.operatorRole = "Press Operator"; m8.weightTons = 25.0;
        f8.machine = m8; f8.getFactoryDetails();

        Factory f9 = new Factory();
        f9.factoryName = "Nelamangala Print Tech"; f9.industrialSector = "Printing";
        Machine m9 = new Machine();
        m9.machineId = "MAC-009"; m9.machineName = "Offset Press"; m9.manufacturer = "Heidelberg"; m9.installationYear = 2016; m9.powerDrawKW = 35.0; m9.operatingTempC = 28.0; m9.isAutomated = true; m9.maintenanceIntervalDays = 14; m9.operatorRole = "Print Master"; m9.weightTons = 9.0;
        f9.machine = m9; f9.getFactoryDetails();

        Factory f10 = new Factory();
        f10.factoryName = "Ramanagara Silk Mill"; f10.industrialSector = "Textiles";
        Machine m10 = new Machine();
        m10.machineId = "MAC-010"; m10.machineName = "Silk Reeler"; m10.manufacturer = "Local Fab"; m10.installationYear = 2005; m10.powerDrawKW = 5.0; m10.operatingTempC = 70.0; m10.isAutomated = false; m10.maintenanceIntervalDays = 7; m10.operatorRole = "Reeler"; m10.weightTons = 0.8;
        f10.machine = m10; f10.getFactoryDetails();

        Factory f11 = new Factory();
        f11.factoryName = "Kumbalgodu Beverages"; f11.industrialSector = "FMCG";
        Machine m11 = new Machine();
        m11.machineId = "MAC-011"; m11.machineName = "Bottling Line"; m11.manufacturer = "Krones"; m11.installationYear = 2020; m11.powerDrawKW = 40.0; m11.operatingTempC = 20.0; m11.isAutomated = true; m11.maintenanceIntervalDays = 30; m11.operatorRole = "Line Supervisor"; m11.weightTons = 15.0;
        f11.machine = m11; f11.getFactoryDetails();

        Factory f12 = new Factory();
        f12.factoryName = "Makali Pharma"; f12.industrialSector = "Pharmaceuticals";
        Machine m12 = new Machine();
        m12.machineId = "MAC-012"; m12.machineName = "Tablet Press"; m12.manufacturer = "Fette"; m12.installationYear = 2022; m12.powerDrawKW = 18.0; m12.operatingTempC = 22.0; m12.isAutomated = true; m12.maintenanceIntervalDays = 15; m12.operatorRole = "Pharma Tech"; m12.weightTons = 3.2;
        f12.machine = m12; f12.getFactoryDetails();

        Factory f13 = new Factory();
        f13.factoryName = "Attibele Chemicals"; f13.industrialSector = "Chemicals";
        Machine m13 = new Machine();
        m13.machineId = "MAC-013"; m13.machineName = "Industrial Centrifuge"; m13.manufacturer = "Alfa Laval"; m13.installationYear = 2014; m13.powerDrawKW = 60.0; m13.operatingTempC = 85.0; m13.isAutomated = true; m13.maintenanceIntervalDays = 45; m13.operatorRole = "Chemical Engineer"; m13.weightTons = 5.5;
        f13.machine = m13; f13.getFactoryDetails();

        Factory f14 = new Factory();
        f14.factoryName = "Dobbaspet Steel"; f14.industrialSector = "Manufacturing";
        Machine m14 = new Machine();
        m14.machineId = "MAC-014"; m14.machineName = "Plasma Cutter"; m14.manufacturer = "Hypertherm"; m14.installationYear = 2019; m14.powerDrawKW = 22.0; m14.operatingTempC = 300.0; m14.isAutomated = true; m14.maintenanceIntervalDays = 20; m14.operatorRole = "Welder"; m14.weightTons = 2.8;
        f14.machine = m14; f14.getFactoryDetails();

        Factory f15 = new Factory();
        f15.factoryName = "Vasanthapura Woodworks"; f15.industrialSector = "Furniture";
        Machine m15 = new Machine();
        m15.machineId = "MAC-015"; m15.machineName = "Edge Bander"; m15.manufacturer = "Homag"; m15.installationYear = 2017; m15.powerDrawKW = 14.0; m15.operatingTempC = 180.0; m15.isAutomated = true; m15.maintenanceIntervalDays = 30; m15.operatorRole = "Carpenter"; m15.weightTons = 1.9;
        f15.machine = m15; f15.getFactoryDetails();

        Factory f16 = new Factory();
        f16.factoryName = "Yeshwanthpur Packaging"; f16.industrialSector = "Logistics";
        Machine m16 = new Machine();
        m16.machineId = "MAC-016"; m16.machineName = "Corrugated Box Maker"; m16.manufacturer = "Bobst"; m16.installationYear = 2013; m16.powerDrawKW = 30.0; m16.operatingTempC = 40.0; m16.isAutomated = true; m16.maintenanceIntervalDays = 60; m16.operatorRole = "Packaging Operator"; m16.weightTons = 10.0;
        f16.machine = m16; f16.getFactoryDetails();

        Factory f17 = new Factory();
        f17.factoryName = "Harohalli Cables"; f17.industrialSector = "Electricals";
        Machine m17 = new Machine();
        m17.machineId = "MAC-017"; m17.machineName = "Wire Extruder"; m17.manufacturer = "Maillefer"; m17.installationYear = 2016; m17.powerDrawKW = 75.0; m17.operatingTempC = 150.0; m17.isAutomated = true; m17.maintenanceIntervalDays = 45; m17.operatorRole = "Extrusion Tech"; m17.weightTons = 7.0;
        f17.machine = m17; f17.getFactoryDetails();

        Factory f18 = new Factory();
        f18.factoryName = "Kanakapura Dairy"; f18.industrialSector = "Food Processing";
        Machine m18 = new Machine();
        m18.machineId = "MAC-018"; m18.machineName = "Pasteurizer"; m18.manufacturer = "Tetra Pak"; m18.installationYear = 2021; m18.powerDrawKW = 28.0; m18.operatingTempC = 72.0; m18.isAutomated = true; m18.maintenanceIntervalDays = 10; m18.operatorRole = "Dairy Engineer"; m18.weightTons = 4.0;
        f18.machine = m18; f18.getFactoryDetails();

        Factory f19 = new Factory();
        f19.factoryName = "Tumkur Road Glass"; f19.industrialSector = "Glass Manufacturing";
        Machine m19 = new Machine();
        m19.machineId = "MAC-019"; m19.machineName = "Glass Tempering Furnace"; m19.manufacturer = "Glaston"; m19.installationYear = 2011; m19.powerDrawKW = 300.0; m19.operatingTempC = 650.0; m19.isAutomated = true; m19.maintenanceIntervalDays = 90; m19.operatorRole = "Furnace Operator"; m19.weightTons = 35.0;
        f19.machine = m19; f19.getFactoryDetails();

        Factory f20 = new Factory();
        f20.factoryName = "Kengeri Leather"; f20.industrialSector = "Apparel";
        Machine m20 = new Machine();
        m20.machineId = "MAC-020"; m20.machineName = "Leather Stitching Machine"; m20.manufacturer = "Juki"; m20.installationYear = 2020; m20.powerDrawKW = 1.5; m20.operatingTempC = 25.0; m20.isAutomated = false; m20.maintenanceIntervalDays = 15; m20.operatorRole = "Tailor"; m20.weightTons = 0.1;
        f20.machine = m20; f20.getFactoryDetails();
    }
}