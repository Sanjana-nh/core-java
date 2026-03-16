class LinkedInRunner {
    public static void main(String[] args) {
        
        LinkedIn l1 = new LinkedIn();
        l1.accountEmail = "sanjana.intern@email.com"; l1.subscriptionTier = "Basic";
        Profile p1 = new Profile();
        p1.profileId = "IN-001"; p1.fullName = "Sanjana"; p1.headline = "Java and Web Development Intern"; p1.currentCompany = "Tech Startup"; p1.location = "Bangalore, India"; p1.connectionsCount = 150; p1.isOpenToWork = true; p1.yearsOfExperience = 0.5; p1.industry = "Information Technology"; p1.hasPremium = false;
        l1.profile = p1; l1.getLinkedInDetails();

        LinkedIn l2 = new LinkedIn();
        l2.accountEmail = "rahul.dev@email.com"; l2.subscriptionTier = "Premium Career";
        Profile p2 = new Profile();
        p2.profileId = "IN-002"; p2.fullName = "Rahul Sharma"; p2.headline = "Senior Software Engineer"; p2.currentCompany = "Google"; p2.location = "Hyderabad, India"; p2.connectionsCount = 500; p2.isOpenToWork = false; p2.yearsOfExperience = 8.0; p2.industry = "Internet"; p2.hasPremium = true;
        l2.profile = p2; l2.getLinkedInDetails();

        LinkedIn l3 = new LinkedIn();
        l3.accountEmail = "priya.hr@email.com"; l3.subscriptionTier = "Recruiter Lite";
        Profile p3 = new Profile();
        p3.profileId = "IN-003"; p3.fullName = "Priya Patel"; p3.headline = "Talent Acquisition Specialist"; p3.currentCompany = "Amazon"; p3.location = "Bangalore, India"; p3.connectionsCount = 1200; p3.isOpenToWork = false; p3.yearsOfExperience = 5.0; p3.industry = "Human Resources"; p3.hasPremium = true;
        l3.profile = p3; l3.getLinkedInDetails();

        LinkedIn l4 = new LinkedIn();
        l4.accountEmail = "amit.manager@email.com"; l4.subscriptionTier = "Basic";
        Profile p4 = new Profile();
        p4.profileId = "IN-004"; p4.fullName = "Amit Kumar"; p4.headline = "Project Manager"; p4.currentCompany = "TCS"; p4.location = "Mumbai, India"; p4.connectionsCount = 450; p4.isOpenToWork = true; p4.yearsOfExperience = 12.0; p4.industry = "IT Services"; p4.hasPremium = false;
        l4.profile = p4; l4.getLinkedInDetails();

        LinkedIn l5 = new LinkedIn();
        l5.accountEmail = "neha.design@email.com"; l5.subscriptionTier = "Basic";
        Profile p5 = new Profile();
        p5.profileId = "IN-005"; p5.fullName = "Neha Singh"; p5.headline = "UX/UI Designer"; p5.currentCompany = "Flipkart"; p5.location = "Bangalore, India"; p5.connectionsCount = 300; p5.isOpenToWork = false; p5.yearsOfExperience = 4.0; p5.industry = "Design"; p5.hasPremium = false;
        l5.profile = p5; l5.getLinkedInDetails();

        LinkedIn l6 = new LinkedIn();
        l6.accountEmail = "vikram.data@email.com"; l6.subscriptionTier = "Premium Business";
        Profile p6 = new Profile();
        p6.profileId = "IN-006"; p6.fullName = "Vikram Reddy"; p6.headline = "Data Scientist"; p6.currentCompany = "Microsoft"; p6.location = "Hyderabad, India"; p6.connectionsCount = 800; p6.isOpenToWork = false; p6.yearsOfExperience = 6.0; p6.industry = "Software"; p6.hasPremium = true;
        l6.profile = p6; l6.getLinkedInDetails();

        LinkedIn l7 = new LinkedIn();
        l7.accountEmail = "sneha.sales@email.com"; l7.subscriptionTier = "Sales Navigator";
        Profile p7 = new Profile();
        p7.profileId = "IN-007"; p7.fullName = "Sneha Gupta"; p7.headline = "Director of Sales"; p7.currentCompany = "Salesforce"; p7.location = "Pune, India"; p7.connectionsCount = 2000; p7.isOpenToWork = false; p7.yearsOfExperience = 15.0; p7.industry = "Enterprise Software"; p7.hasPremium = true;
        l7.profile = p7; l7.getLinkedInDetails();

        LinkedIn l8 = new LinkedIn();
        l8.accountEmail = "karthik.student@email.com"; l8.subscriptionTier = "Basic";
        Profile p8 = new Profile();
        p8.profileId = "IN-008"; p8.fullName = "Karthik N"; p8.headline = "Computer Science Student"; p8.currentCompany = "University"; p8.location = "Chennai, India"; p8.connectionsCount = 50; p8.isOpenToWork = true; p8.yearsOfExperience = 0.0; p8.industry = "Higher Education"; p8.hasPremium = false;
        l8.profile = p8; l8.getLinkedInDetails();

        LinkedIn l9 = new LinkedIn();
        l9.accountEmail = "manoj.founder@email.com"; l9.subscriptionTier = "Premium Business";
        Profile p9 = new Profile();
        p9.profileId = "IN-009"; p9.fullName = "Manoj Iyer"; p9.headline = "Founder & CEO"; p9.currentCompany = "FinTech Innovators"; p9.location = "Bangalore, India"; p9.connectionsCount = 500; p9.isOpenToWork = false; p9.yearsOfExperience = 10.0; p9.industry = "Financial Services"; p9.hasPremium = true;
        l9.profile = p9; l9.getLinkedInDetails();

        LinkedIn l10 = new LinkedIn();
        l10.accountEmail = "ravi.cloud@email.com"; l10.subscriptionTier = "Basic";
        Profile p10 = new Profile();
        p10.profileId = "IN-010"; p10.fullName = "Ravi Verma"; p10.headline = "Cloud Architect"; p10.currentCompany = "IBM"; p10.location = "Noida, India"; p10.connectionsCount = 600; p10.isOpenToWork = true; p10.yearsOfExperience = 11.0; p10.industry = "IT Services"; p10.hasPremium = false;
        l10.profile = p10; l10.getLinkedInDetails();

        LinkedIn l11 = new LinkedIn();
        l11.accountEmail = "suresh.qa@email.com"; l11.subscriptionTier = "Basic";
        Profile p11 = new Profile();
        p11.profileId = "IN-011"; p11.fullName = "Suresh Nair"; p11.headline = "QA Automation Engineer"; p11.currentCompany = "Infosys"; p11.location = "Trivandrum, India"; p11.connectionsCount = 350; p11.isOpenToWork = true; p11.yearsOfExperience = 4.5; p11.industry = "Software Testing"; p11.hasPremium = false;
        l11.profile = p11; l11.getLinkedInDetails();

        LinkedIn l12 = new LinkedIn();
        l12.accountEmail = "anil.marketing@email.com"; l12.subscriptionTier = "Premium Career";
        Profile p12 = new Profile();
        p12.profileId = "IN-012"; p12.fullName = "Anil Desai"; p12.headline = "Digital Marketing Manager"; p12.currentCompany = "Ogilvy"; p12.location = "Mumbai, India"; p12.connectionsCount = 950; p12.isOpenToWork = false; p12.yearsOfExperience = 7.0; p12.industry = "Marketing"; p12.hasPremium = true;
        l12.profile = p12; l12.getLinkedInDetails();

        LinkedIn l13 = new LinkedIn();
        l13.accountEmail = "deepak.cyber@email.com"; l13.subscriptionTier = "Basic";
        Profile p13 = new Profile();
        p13.profileId = "IN-013"; p13.fullName = "Deepak Joshi"; p13.headline = "Cybersecurity Analyst"; p13.currentCompany = "Wipro"; p13.location = "Bangalore, India"; p13.connectionsCount = 280; p13.isOpenToWork = false; p13.yearsOfExperience = 3.0; p13.industry = "Computer & Network Security"; p13.hasPremium = false;
        l13.profile = p13; l13.getLinkedInDetails();

        LinkedIn l14 = new LinkedIn();
        l14.accountEmail = "gowda.ops@email.com"; l14.subscriptionTier = "Basic";
        Profile p14 = new Profile();
        p14.profileId = "IN-014"; p14.fullName = "Gowda K"; p14.headline = "Operations Lead"; p14.currentCompany = "Swiggy"; p14.location = "Bangalore, India"; p14.connectionsCount = 410; p14.isOpenToWork = true; p14.yearsOfExperience = 6.5; p14.industry = "Food Delivery"; p14.hasPremium = false;
        l14.profile = p14; l14.getLinkedInDetails();

        LinkedIn l15 = new LinkedIn();
        l15.accountEmail = "arjun.product@email.com"; l15.subscriptionTier = "Premium Business";
        Profile p15 = new Profile();
        p15.profileId = "IN-015"; p15.fullName = "Arjun Menon"; p15.headline = "Product Manager"; p15.currentCompany = "Atlassian"; p15.location = "Bangalore, India"; p15.connectionsCount = 1500; p15.isOpenToWork = false; p5.yearsOfExperience = 9.0; p15.industry = "Internet"; p15.hasPremium = true;
        l15.profile = p15; l15.getLinkedInDetails();

        LinkedIn l16 = new LinkedIn();
        l16.accountEmail = "vinay.finance@email.com"; l16.subscriptionTier = "Basic";
        Profile p16 = new Profile();
        p16.profileId = "IN-016"; p16.fullName = "Vinay R"; p16.headline = "Financial Analyst"; p16.currentCompany = "Goldman Sachs"; p16.location = "Bangalore, India"; p16.connectionsCount = 490; p16.isOpenToWork = false; p16.yearsOfExperience = 2.5; p16.industry = "Investment Banking"; p16.hasPremium = false;
        l16.profile = p16; l16.getLinkedInDetails();

        LinkedIn l17 = new LinkedIn();
        l17.accountEmail = "aditi.content@email.com"; l17.subscriptionTier = "Basic";
        Profile p17 = new Profile();
        p17.profileId = "IN-017"; p17.fullName = "Aditi Rao"; p17.headline = "Content Writer"; p17.currentCompany = "Freelance"; p17.location = "Delhi, India"; p17.connectionsCount = 320; p17.isOpenToWork = true; p17.yearsOfExperience = 4.0; p17.industry = "Writing and Editing"; p17.hasPremium = false;
        l17.profile = p17; l17.getLinkedInDetails();

        LinkedIn l18 = new LinkedIn();
        l18.accountEmail = "pooja.hr@email.com"; l18.subscriptionTier = "Recruiter Lite";
        Profile p18 = new Profile();
        p18.profileId = "IN-018"; p18.fullName = "Pooja Hegde"; p18.headline = "HR Business Partner"; p18.currentCompany = "Accenture"; p18.location = "Hyderabad, India"; p18.connectionsCount = 850; p18.isOpenToWork = false; p18.yearsOfExperience = 8.5; p18.industry = "Human Resources"; p18.hasPremium = true;
        l18.profile = p18; l18.getLinkedInDetails();

        LinkedIn l19 = new LinkedIn();
        l19.accountEmail = "ashok.civil@email.com"; l19.subscriptionTier = "Basic";
        Profile p19 = new Profile();
        p19.profileId = "IN-019"; p19.fullName = "Ashok Kumar"; p19.headline = "Civil Engineer"; p19.currentCompany = "L&T"; p19.location = "Chennai, India"; p19.connectionsCount = 210; p19.isOpenToWork = true; p19.yearsOfExperience = 5.5; p19.industry = "Construction"; p19.hasPremium = false;
        l19.profile = p19; l19.getLinkedInDetails();

        LinkedIn l20 = new LinkedIn();
        l20.accountEmail = "kiran.ai@email.com"; l20.subscriptionTier = "Premium Career";
        Profile p20 = new Profile();
        p20.profileId = "IN-020"; p20.fullName = "Kiran B"; p20.headline = "AI Researcher"; p20.currentCompany = "OpenAI"; p20.location = "San Francisco, USA"; p20.connectionsCount = 3000; p20.isOpenToWork = false; p20.yearsOfExperience = 7.0; p20.industry = "Artificial Intelligence"; p20.hasPremium = true;
        l20.profile = p20; l20.getLinkedInDetails();
    }
}