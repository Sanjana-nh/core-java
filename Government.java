class Government {
    String competitiveExamNames[] = new String[9];
    int index;

    public boolean addCompetitiveExamName(String competitiveExamName) {
        boolean isCompetitiveExamNameAdded = false;
        if (competitiveExamName != null && !competitiveExamName.isEmpty()) {
            competitiveExamNames[index] = competitiveExamName;
            index++;
            isCompetitiveExamNameAdded = true; 
        } else {
            System.out.println(competitiveExamName + "is invalid");
        }
        return isCompetitiveExamNameAdded;
    }

    public void getCompetitiveExamNames() {
        for(String competitiveExamName : competitiveExamNames) {
            System.out.println(competitiveExamName);
        }
    }
}