class ProgrammingLanguage {
    String languageName;
    String primaryParadigm;
    Syntax syntax;

    public void getProgrammingLanguageDetails() {
        System.out.println("========================");
        System.out.println("Language : " + languageName);
        System.out.println("Paradigm : " + primaryParadigm);
        this.syntax.getSyntaxDetails();
    }
}