class CompanyRunner {
    public static void main(String[] args) {
        
        Company c1 = new Company();
        c1.companyName = "Infosys"; c1.headquarters = "Bengaluru";
        Project p1 = new Project();
        p1.projectId = "PRJ-01"; p1.projectName = "Finacle Upgrade"; p1.clientName = "HDFC Bank"; p1.budgetMillions = 15.5; p1.teamSize = 120; p1.isCompleted = false; p1.durationMonths = 18; p1.techStack = "Java, Angular"; p1.projectManager = "Ramesh"; p1.revenueGenerated = 5.0;
        c1.project = p1; c1.getCompanyDetails();

        Company c2 = new Company();
        c2.companyName = "Wipro"; c2.headquarters = "Bengaluru";
        Project p2 = new Project();
        p2.projectId = "PRJ-02"; p2.projectName = "Cloud Migration"; p2.clientName = "Walmart"; p2.budgetMillions = 25.0; p2.teamSize = 85; p2.isCompleted = true; p2.durationMonths = 12; p2.techStack = "AWS, Python"; p2.projectManager = "Suresh"; p2.revenueGenerated = 30.0;
        c2.project = p2; c2.getCompanyDetails();

        Company c3 = new Company();
        c3.companyName = "TCS"; c3.headquarters = "Mumbai";
        Project p3 = new Project();
        p3.projectId = "PRJ-03"; p3.projectName = "Passport Seva"; p3.clientName = "Govt of India"; p3.budgetMillions = 50.0; p3.teamSize = 300; p3.isCompleted = false; p3.durationMonths = 60; p3.techStack = "Java, Oracle"; p3.projectManager = "Amit"; p3.revenueGenerated = 15.0;
        c3.project = p3; c3.getCompanyDetails();

        Company c4 = new Company();
        c4.companyName = "Accenture"; c4.headquarters = "Dublin";
        Project p4 = new Project();
        p4.projectId = "PRJ-04"; p4.projectName = "AI Chatbot"; p4.clientName = "Verizon"; p4.budgetMillions = 8.5; p4.teamSize = 40; p4.isCompleted = true; p4.durationMonths = 6; p4.techStack = "Python, NLP"; p4.projectManager = "Priya"; p4.revenueGenerated = 12.0;
        c4.project = p4; c4.getCompanyDetails();

        Company c5 = new Company();
        c5.companyName = "Cognizant"; c5.headquarters = "Teaneck";
        Project p5 = new Project();
        p5.projectId = "PRJ-05"; p5.projectName = "Health Portal"; p5.clientName = "CVS Health"; p5.budgetMillions = 12.0; p5.teamSize = 90; p5.isCompleted = false; p5.durationMonths = 24; p5.techStack = "React, Node.js"; p5.projectManager = "Kiran"; p5.revenueGenerated = 4.0;
        c5.project = p5; c5.getCompanyDetails();

        Company c6 = new Company();
        c6.companyName = "Tech Mahindra"; c6.headquarters = "Pune";
        Project p6 = new Project();
        p6.projectId = "PRJ-06"; p6.projectName = "5G Rollout Support"; p6.clientName = "AT&T"; p6.budgetMillions = 40.0; p6.teamSize = 250; p6.isCompleted = false; p6.durationMonths = 36; p6.techStack = "Telecom, C++"; p6.projectManager = "Vikram"; p6.revenueGenerated = 10.0;
        c6.project = p6; c6.getCompanyDetails();

        Company c7 = new Company();
        c7.companyName = "HCL Tech"; c7.headquarters = "Noida";
        Project p7 = new Project();
        p7.projectId = "PRJ-07"; p7.projectName = "Cybersecurity Audit"; p7.clientName = "Barclays"; p7.budgetMillions = 5.0; p7.teamSize = 25; p7.isCompleted = true; p7.durationMonths = 3; p7.techStack = "Splunk, SIEM"; p7.projectManager = "Neha"; p7.revenueGenerated = 6.5;
        c7.project = p7; c7.getCompanyDetails();

        Company c8 = new Company();
        c8.companyName = "Capgemini"; c8.headquarters = "Paris";
        Project p8 = new Project();
        p8.projectId = "PRJ-08"; p8.projectName = "ERP Implementation"; p8.clientName = "Unilever"; p8.budgetMillions = 35.0; p8.teamSize = 150; p8.isCompleted = false; p8.durationMonths = 20; p8.techStack = "SAP S/4HANA"; p8.projectManager = "Rahul"; p8.revenueGenerated = 18.0;
        c8.project = p8; c8.getCompanyDetails();

        Company c9 = new Company();
        c9.companyName = "IBM"; c9.headquarters = "Armonk";
        Project p9 = new Project();
        p9.projectId = "PRJ-09"; p9.projectName = "Quantum Research"; p9.clientName = "NASA"; p9.budgetMillions = 100.0; p9.teamSize = 50; p9.isCompleted = false; p9.durationMonths = 48; p9.techStack = "Qiskit, Python"; p9.projectManager = "Dr. Smith"; p9.revenueGenerated = 25.0;
        c9.project = p9; c9.getCompanyDetails();

        Company c10 = new Company();
        c10.companyName = "LTI Mindtree"; c10.headquarters = "Mumbai";
        Project p10 = new Project();
        p10.projectId = "PRJ-10"; p10.projectName = "Data Warehouse"; p10.clientName = "Target"; p10.budgetMillions = 14.0; p10.teamSize = 75; p10.isCompleted = true; p10.durationMonths = 10; p10.techStack = "Snowflake, Azure"; p10.projectManager = "Anjali"; p10.revenueGenerated = 16.5;
        c10.project = p10; c10.getCompanyDetails();

        Company c11 = new Company();
        c11.companyName = "Mphasis"; c11.headquarters = "Bengaluru";
        Project p11 = new Project();
        p11.projectId = "PRJ-11"; p11.projectName = "Mortgage App"; p11.clientName = "Wells Fargo"; p11.budgetMillions = 9.0; p11.teamSize = 60; p11.isCompleted = false; p11.durationMonths = 12; p11.techStack = "Swift, Kotlin"; p11.projectManager = "Manoj"; p11.revenueGenerated = 3.0;
        c11.project = p11; c11.getCompanyDetails();

        Company c12 = new Company();
        c12.companyName = "Oracle"; c12.headquarters = "Austin";
        Project p12 = new Project();
        p12.projectId = "PRJ-12"; p12.projectName = "Cloud Infra Setup"; p12.clientName = "Zoom"; p12.budgetMillions = 60.0; p12.teamSize = 200; p12.isCompleted = true; p12.durationMonths = 14; p12.techStack = "OCI, Linux"; p12.projectManager = "David"; p12.revenueGenerated = 75.0;
        c12.project = p12; c12.getCompanyDetails();

        Company c13 = new Company();
        c13.companyName = "Cisco"; c13.headquarters = "San Jose";
        Project p13 = new Project();
        p13.projectId = "PRJ-13"; p13.projectName = "Network Upgradation"; p13.clientName = "Jio"; p13.budgetMillions = 80.0; p13.teamSize = 400; p13.isCompleted = false; p13.durationMonths = 24; p13.techStack = "Networking, C"; p13.projectManager = "Sanjay"; p13.revenueGenerated = 20.0;
        c13.project = p13; c13.getCompanyDetails();

        Company c14 = new Company();
        c14.companyName = "Microsoft"; c14.headquarters = "Redmond";
        Project p14 = new Project();
        p14.projectId = "PRJ-14"; p14.projectName = "Azure AD Integration"; p14.clientName = "Ford"; p14.budgetMillions = 22.0; p14.teamSize = 80; p14.isCompleted = true; p14.durationMonths = 8; p14.techStack = "Azure, C#"; p14.projectManager = "Sarah"; p14.revenueGenerated = 28.0;
        c14.project = p14; c14.getCompanyDetails();

        Company c15 = new Company();
        c15.companyName = "Google"; c15.headquarters = "Mountain View";
        Project p15 = new Project();
        p15.projectId = "PRJ-15"; p15.projectName = "Maps API Extension"; p15.clientName = "Uber"; p15.budgetMillions = 45.0; p15.teamSize = 110; p15.isCompleted = false; p15.durationMonths = 15; p15.techStack = "Go, C++"; p15.projectManager = "Sundar"; p15.revenueGenerated = 15.0;
        c15.project = p15; c15.getCompanyDetails();

        Company c16 = new Company();
        c16.companyName = "Amazon"; c16.headquarters = "Seattle";
        Project p16 = new Project();
        p16.projectId = "PRJ-16"; p16.projectName = "Logistics Dashboard"; p16.clientName = "FedEx"; p16.budgetMillions = 18.0; p16.teamSize = 95; p16.isCompleted = true; p16.durationMonths = 9; p16.techStack = "AWS, React"; p16.projectManager = "Jeff"; p16.revenueGenerated = 22.0;
        c16.project = p16; c16.getCompanyDetails();

        Company c17 = new Company();
        c17.companyName = "SAP"; c17.headquarters = "Walldorf";
        Project p17 = new Project();
        p17.projectId = "PRJ-17"; p17.projectName = "Supply Chain Modernization"; p17.clientName = "Coca-Cola"; p17.budgetMillions = 55.0; p17.teamSize = 160; p17.isCompleted = false; p17.durationMonths = 22; p17.techStack = "ABAP, HANA"; p17.projectManager = "Klaus"; p17.revenueGenerated = 12.0;
        c17.project = p17; c17.getCompanyDetails();

        Company c18 = new Company();
        c18.companyName = "Deloitte"; c18.headquarters = "London";
        Project p18 = new Project();
        p18.projectId = "PRJ-18"; p18.projectName = "Risk Assessment Tool"; p18.clientName = "Citibank"; p18.budgetMillions = 11.0; p18.teamSize = 45; p18.isCompleted = true; p18.durationMonths = 5; p18.techStack = "Java, Spring Boot"; p18.projectManager = "Emma"; p18.revenueGenerated = 14.5;
        c18.project = p18; c18.getCompanyDetails();

        Company c19 = new Company();
        c19.companyName = "TCS"; c19.headquarters = "Mumbai";
        Project p19 = new Project();
        p19.projectId = "PRJ-19"; p19.projectName = "Retail POS System"; p19.clientName = "Reliance Retail"; p19.budgetMillions = 16.0; p19.teamSize = 80; p19.isCompleted = false; p19.durationMonths = 14; p19.techStack = "Angular, Node.js"; p19.projectManager = "Ravi"; p19.revenueGenerated = 4.0;
        c19.project = p19; c19.getCompanyDetails();

        Company c20 = new Company();
        c20.companyName = "Infosys"; c20.headquarters = "Bengaluru";
        Project p20 = new Project();
        p20.projectId = "PRJ-20"; p20.projectName = "Smart City IoT"; p20.clientName = "BBMP"; p20.budgetMillions = 30.0; p20.teamSize = 130; p20.isCompleted = false; p20.durationMonths = 36; p20.techStack = "IoT, Python"; p20.projectManager = "Gowda"; p20.revenueGenerated = 8.0;
        c20.project = p20; c20.getCompanyDetails();
    }
}