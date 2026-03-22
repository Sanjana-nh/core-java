class Form {
    String formName; String originState; int approximateOriginYear; String traditionalProp; int typicalNumberOfPerformers; 
    double performanceDurationMins; boolean isClassical; String primaryCostumeColor; String accompanyingMusicInstrument; String difficultyLevel;

    public Form(String formName, String originState, int approximateOriginYear, String traditionalProp, int typicalNumberOfPerformers, double performanceDurationMins, boolean isClassical, String primaryCostumeColor, String accompanyingMusicInstrument, String difficultyLevel) {
        this.formName = formName; this.originState = originState; this.approximateOriginYear = approximateOriginYear;
        this.traditionalProp = traditionalProp; this.typicalNumberOfPerformers = typicalNumberOfPerformers;
        this.performanceDurationMins = performanceDurationMins; this.isClassical = isClassical;
        this.primaryCostumeColor = primaryCostumeColor; this.accompanyingMusicInstrument = accompanyingMusicInstrument;
        this.difficultyLevel = difficultyLevel;
    }

    public void displayDetails() {
        System.out.println("------------------------");
        System.out.println("Form : " + formName + " | State : " + originState + " | Year : " + approximateOriginYear);
        System.out.println("Prop : " + traditionalProp + " | Performers : " + typicalNumberOfPerformers + " | Duration : " + performanceDurationMins);
        System.out.println("Classical : " + isClassical + " | Color : " + primaryCostumeColor + " | Instrument : " + accompanyingMusicInstrument + " | Diff : " + difficultyLevel);
    }
}



