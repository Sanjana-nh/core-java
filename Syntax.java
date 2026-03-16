class Syntax {
    String conceptName;
    String keyword;
    boolean isCaseSensitive;
    boolean requiresSemicolon;
    String bracketType;
    String exampleSnippet;
    int complexityLevel;
    double introducedInVersion;
    boolean isDeprecated;
    String category;

    public void getSyntaxDetails() {
        System.out.println("------------------------");
        System.out.println("The Syntax Details are:");
        System.out.println("Concept : " + conceptName);
        System.out.println("Keyword : " + keyword);
        System.out.println("Case Sensitive : " + isCaseSensitive);
        System.out.println("Needs Semicolon : " + requiresSemicolon);
        System.out.println("Bracket Type : " + bracketType);
        System.out.println("Example : " + exampleSnippet);
        System.out.println("Complexity (1-10): " + complexityLevel);
        System.out.println("Introduced In : " + introducedInVersion);
        System.out.println("Deprecated : " + isDeprecated);
        System.out.println("Category : " + category);
    }
}



