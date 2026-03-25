class CricBuz {
    String teamNames[] = new String[8];
    int index;

    public boolean addTeamName(String teamName) {
        boolean isTeamNameAdded = false;
        if (teamName != null && !teamName.isEmpty()) {
            teamNames[index] = teamName;
            index++;
            isTeamNameAdded = true; 
        } else {
            System.out.println(teamName + "is invalid");
        }
        return isTeamNameAdded;
    }

    public void getTeamNames() {
        for(String teamName : teamNames) {
            System.out.println(teamName);
        }
    }
}