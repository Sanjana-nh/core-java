class Form{
	String formName;
	String originState;
	int year;
	String traditionalProp;
    int typicalNumberOfPerformers;
    double performanceDurationMins;
    boolean isClassical;
    String primaryCostumeColor;
    String accompanyingMusicInstrument;
    String difficultyLevel;
	
	public void getFormDetails() {
        System.out.println("------------------------");
        System.out.println("The Dance Form Details are:");
        System.out.println("Form Name : " + formName);
        System.out.println("Origin State : " + originState);
        System.out.println("Approx Origin Year : " + approximateOriginYear);
        System.out.println("Traditional Prop : " + traditionalProp);
        System.out.println("Performers : " + typicalNumberOfPerformers);
        System.out.println("Duration (Mins) : " + performanceDurationMins);
        System.out.println("Is Classical : " + isClassical);
        System.out.println("Costume Color : " + primaryCostumeColor);
        System.out.println("Main Instrument : " + accompanyingMusicInstrument);
        System.out.println("Difficulty : " + difficultyLevel);

}