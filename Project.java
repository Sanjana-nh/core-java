class Project {
    String projectId;
    String projectName;
    String clientName;
    double budgetMillions;
    int teamSize;
    boolean isCompleted;
    int durationMonths;
    String techStack;
    String projectManager;
    double revenueGenerated;

    public void getProjectDetails() {
        System.out.println("------------------------");
        System.out.println("The Project Details are:");
        System.out.println("Project ID : " + projectId);
        System.out.println("Name : " + projectName);
        System.out.println("Client : " + clientName);
        System.out.println("Budget ($M) : " + budgetMillions);
        System.out.println("Team Size : " + teamSize);
        System.out.println("Completed : " + isCompleted);
        System.out.println("Duration (M) : " + durationMonths);
        System.out.println("Tech Stack : " + techStack);
        System.out.println("Manager : " + projectManager);
        System.out.println("Revenue : " + revenueGenerated);
    }
}



