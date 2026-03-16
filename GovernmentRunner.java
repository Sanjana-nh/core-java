class GovernmentRunner {
    public static void main(String[] args) {
        
        Government g1 = new Government();
        g1.rulingParty = "NDA"; g1.termYear = 2024;
        Policy p1 = new Policy();
        p1.policyId = "POL-01"; p1.policyName = "Make in India"; p1.sector = "Manufacturing"; p1.budgetAllocatedCr = 50000.0; p1.launchYear = 2014; p1.isActive = true; p1.targetBeneficiary = "Industries/Startups"; p1.ministerInCharge = "Piyush Goyal"; p1.durationYears = 10; p1.isNationwide = true;
        g1.policy = p1; g1.getGovernmentDetails();

        Government g2 = new Government();
        g2.rulingParty = "NDA"; g2.termYear = 2024;
        Policy p2 = new Policy();
        p2.policyId = "POL-02"; p2.policyName = "Digital India"; p2.sector = "Technology"; p2.budgetAllocatedCr = 40000.0; p2.launchYear = 2015; p2.isActive = true; p2.targetBeneficiary = "Citizens/IT Sector"; p2.ministerInCharge = "Ashwini Vaishnaw"; p2.durationYears = 9; p2.isNationwide = true;
        g2.policy = p2; g2.getGovernmentDetails();

        Government g3 = new Government();
        g3.rulingParty = "NDA"; g3.termYear = 2024;
        Policy p3 = new Policy();
        p3.policyId = "POL-03"; p3.policyName = "PM Kisan Samman Nidhi"; p3.sector = "Agriculture"; p3.budgetAllocatedCr = 60000.0; p3.launchYear = 2019; p3.isActive = true; p3.targetBeneficiary = "Small Farmers"; p3.ministerInCharge = "Narendra Singh Tomar"; p3.durationYears = 5; p3.isNationwide = true;
        g3.policy = p3; g3.getGovernmentDetails();

        Government g4 = new Government();
        g4.rulingParty = "NDA"; g4.termYear = 2024;
        Policy p4 = new Policy();
        p4.policyId = "POL-04"; p4.policyName = "Ayushman Bharat"; p4.sector = "Healthcare"; p4.budgetAllocatedCr = 7200.0; p4.launchYear = 2018; p4.isActive = true; p4.targetBeneficiary = "BPL Families"; p4.ministerInCharge = "Mansukh Mandaviya"; p4.durationYears = 6; p4.isNationwide = true;
        g4.policy = p4; g4.getGovernmentDetails();

        Government g5 = new Government();
        g5.rulingParty = "NDA"; g5.termYear = 2024;
        Policy p5 = new Policy();
        p5.policyId = "POL-05"; p5.policyName = "Swachh Bharat Abhiyan"; p5.sector = "Sanitation"; p5.budgetAllocatedCr = 12000.0; p5.launchYear = 2014; p5.isActive = true; p5.targetBeneficiary = "All Citizens"; p5.ministerInCharge = "Gajendra Singh Shekhawat"; p5.durationYears = 10; p5.isNationwide = true;
        g5.policy = p5; g5.getGovernmentDetails();

        Government g6 = new Government();
        g6.rulingParty = "UPA"; g6.termYear = 2009;
        Policy p6 = new Policy();
        p6.policyId = "POL-06"; p6.policyName = "MGNREGA"; p6.sector = "Employment"; p6.budgetAllocatedCr = 86000.0; p6.launchYear = 2005; p6.isActive = true; p6.targetBeneficiary = "Rural Workers"; p6.ministerInCharge = "Giriraj Singh"; p6.durationYears = 19; p6.isNationwide = true;
        g6.policy = p6; g6.getGovernmentDetails();

        Government g7 = new Government();
        g7.rulingParty = "UPA"; g7.termYear = 2009;
        Policy p7 = new Policy();
        p7.policyId = "POL-07"; p7.policyName = "Right to Education (RTE)"; p7.sector = "Education"; p7.budgetAllocatedCr = 30000.0; p7.launchYear = 2009; p7.isActive = true; p7.targetBeneficiary = "Children (6-14)"; p7.ministerInCharge = "Dharmendra Pradhan"; p7.durationYears = 15; p7.isNationwide = true;
        g7.policy = p7; g7.getGovernmentDetails();

        Government g8 = new Government();
        g8.rulingParty = "NDA"; g8.termYear = 2024;
        Policy p8 = new Policy();
        p8.policyId = "POL-08"; p8.policyName = "Smart Cities Mission"; p8.sector = "Urban Development"; p8.budgetAllocatedCr = 48000.0; p8.launchYear = 2015; p8.isActive = true; p8.targetBeneficiary = "Urban Citizens"; p8.ministerInCharge = "Hardeep Singh Puri"; p8.durationYears = 9; p8.isNationwide = true;
        g8.policy = p8; g8.getGovernmentDetails();

        Government g9 = new Government();
        g9.rulingParty = "NDA"; g9.termYear = 2024;
        Policy p9 = new Policy();
        p9.policyId = "POL-09"; p9.policyName = "Beti Bachao Beti Padhao"; p9.sector = "Women & Child Dev"; p9.budgetAllocatedCr = 200.0; p9.launchYear = 2015; p9.isActive = true; p9.targetBeneficiary = "Girl Child"; p9.ministerInCharge = "Smriti Irani"; p9.durationYears = 9; p9.isNationwide = true;
        g9.policy = p9; g9.getGovernmentDetails();

        Government g10 = new Government();
        g10.rulingParty = "State Govt (Karnataka)"; g10.termYear = 2023;
        Policy p10 = new Policy();
        p10.policyId = "POL-10"; p10.policyName = "Gruha Jyothi"; p10.sector = "Energy"; p10.budgetAllocatedCr = 9000.0; p10.launchYear = 2023; p10.isActive = true; p10.targetBeneficiary = "Households"; p10.ministerInCharge = "K. J. George"; p10.durationYears = 5; p10.isNationwide = false;
        g10.policy = p10; g10.getGovernmentDetails();

        Government g11 = new Government();
        g11.rulingParty = "State Govt (Karnataka)"; g11.termYear = 2023;
        Policy p11 = new Policy();
        p11.policyId = "POL-11"; p11.policyName = "Shakti Scheme"; p11.sector = "Transport"; p11.budgetAllocatedCr = 4000.0; p11.launchYear = 2023; p11.isActive = true; p11.targetBeneficiary = "Women"; p11.ministerInCharge = "Ramalinga Reddy"; p11.durationYears = 5; p11.isNationwide = false;
        g11.policy = p11; g11.getGovernmentDetails();

        Government g12 = new Government();
        g12.rulingParty = "State Govt (Karnataka)"; g12.termYear = 2023;
        Policy p12 = new Policy();
        p12.policyId = "POL-12"; p12.policyName = "Anna Bhagya"; p12.sector = "Food Security"; p12.budgetAllocatedCr = 10000.0; p12.launchYear = 2013; p12.isActive = true; p12.targetBeneficiary = "BPL Card Holders"; p12.ministerInCharge = "K. H. Muniyappa"; p12.durationYears = 10; p12.isNationwide = false;
        g12.policy = p12; g12.getGovernmentDetails();

        Government g13 = new Government();
        g13.rulingParty = "NDA"; g13.termYear = 2024;
        Policy p13 = new Policy();
        p13.policyId = "POL-13"; p13.policyName = "Atmanirbhar Bharat"; p13.sector = "Economy"; p13.budgetAllocatedCr = 2000000.0; p13.launchYear = 2020; p13.isActive = true; p13.targetBeneficiary = "MSMEs & Citizens"; p13.ministerInCharge = "Nirmala Sitharaman"; p13.durationYears = 4; p13.isNationwide = true;
        g13.policy = p13; g13.getGovernmentDetails();

        Government g14 = new Government();
        g14.rulingParty = "NDA"; g14.termYear = 2024;
        Policy p14 = new Policy();
        p14.policyId = "POL-14"; p14.policyName = "Jal Jeevan Mission"; p14.sector = "Water Resources"; p14.budgetAllocatedCr = 70000.0; p14.launchYear = 2019; p14.isActive = true; p14.targetBeneficiary = "Rural Households"; p14.ministerInCharge = "Gajendra Singh Shekhawat"; p14.durationYears = 5; p14.isNationwide = true;
        g14.policy = p14; g14.getGovernmentDetails();

        Government g15 = new Government();
        g15.rulingParty = "UPA"; g15.termYear = 2013;
        Policy p15 = new Policy();
        p15.policyId = "POL-15"; p15.policyName = "National Food Security Act"; p15.sector = "Food Security"; p15.budgetAllocatedCr = 150000.0; p15.launchYear = 2013; p15.isActive = true; p15.targetBeneficiary = "Poor Citizens"; p15.ministerInCharge = "Piyush Goyal"; p15.durationYears = 11; p15.isNationwide = true;
        g15.policy = p15; g15.getGovernmentDetails();

        Government g16 = new Government();
        g16.rulingParty = "NDA"; g16.termYear = 2024;
        Policy p16 = new Policy();
        p16.policyId = "POL-16"; p16.policyName = "PM Awas Yojana"; p16.sector = "Housing"; p16.budgetAllocatedCr = 48000.0; p16.launchYear = 2015; p16.isActive = true; p16.targetBeneficiary = "Urban/Rural Poor"; p16.ministerInCharge = "Hardeep Singh Puri"; p16.durationYears = 9; p16.isNationwide = true;
        g16.policy = p16; g16.getGovernmentDetails();

        Government g17 = new Government();
        g17.rulingParty = "NDA"; g17.termYear = 2024;
        Policy p17 = new Policy();
        p17.policyId = "POL-17"; p17.policyName = "Ujjwala Yojana"; p17.sector = "Energy"; p17.budgetAllocatedCr = 8000.0; p17.launchYear = 2016; p17.isActive = true; p17.targetBeneficiary = "BPL Women"; p17.ministerInCharge = "Hardeep Singh Puri"; p17.durationYears = 8; p17.isNationwide = true;
        g17.policy = p17; g17.getGovernmentDetails();

        Government g18 = new Government();
        g18.rulingParty = "NDA"; g18.termYear = 2024;
        Policy p18 = new Policy();
        p18.policyId = "POL-18"; p18.policyName = "FAME India"; p18.sector = "Transport"; p18.budgetAllocatedCr = 10000.0; p18.launchYear = 2015; p18.isActive = true; p18.targetBeneficiary = "EV Buyers & Mfg"; p18.ministerInCharge = "Mahendra Nath Pandey"; p18.durationYears = 9; p18.isNationwide = true;
        g18.policy = p18; g18.getGovernmentDetails();

        Government g19 = new Government();
        g19.rulingParty = "State Govt (Delhi)"; g19.termYear = 2020;
        Policy p19 = new Policy();
        p19.policyId = "POL-19"; p19.policyName = "Mohalla Clinics"; p19.sector = "Healthcare"; p19.budgetAllocatedCr = 500.0; p19.launchYear = 2015; p19.isActive = true; p19.targetBeneficiary = "Local Citizens"; p19.ministerInCharge = "Saurabh Bharadwaj"; p19.durationYears = 9; p19.isNationwide = false;
        g19.policy = p19; g19.getGovernmentDetails();

        Government g20 = new Government();
        g20.rulingParty = "State Govt (Telangana)"; g20.termYear = 2023;
        Policy p20 = new Policy();
        p20.policyId = "POL-20"; p20.policyName = "Rythu Bandhu"; p20.sector = "Agriculture"; p20.budgetAllocatedCr = 15000.0; p20.launchYear = 2018; p20.isActive = true; p20.targetBeneficiary = "Farmers"; p20.ministerInCharge = "Thummala Nageswara Rao"; p20.durationYears = 6; p20.isNationwide = false;
        g20.policy = p20; g20.getGovernmentDetails();
    }
}