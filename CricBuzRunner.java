class CricBuzRunner {
    public static void main(String[] args) {
        CricBuz cricBuz = new CricBuz();

        cricBuz.addTeamName("Royal Challengers Bengaluru");
        cricBuz.addTeamName("Chennai Super Kings");
        cricBuz.addTeamName("Mumbai Indians");
        cricBuz.addTeamName("Kolkata Knight Riders");
        cricBuz.addTeamName("Sunrisers Hyderabad");
        cricBuz.addTeamName("Delhi Capitals");
        cricBuz.addTeamName("Punjab Kings");
        cricBuz.addTeamName("Rajasthan Royals");

        cricBuz.getTeamNames();
		cricBuz.getTeamNamesByIndex(6);
		cricBuz.getIndexByTeamNames("Delhi Capitals");
		cricBuz.updateTeamNames("Punjab Kings", "Gujurat Titains");
		cricBuz.getTeamNames();
		cricBuz.deleteTeamNames("Punjab Kings");
		cricBuz.getTeamNames();
    }
}