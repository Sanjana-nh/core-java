class ProgrammingLanguageRunner {
    public static void main(String[] args) {
        
        ProgrammingLanguage pl1 = new ProgrammingLanguage();
        pl1.languageName = "Java"; pl1.primaryParadigm = "Object-Oriented";
        Syntax s1 = new Syntax();
        s1.conceptName = "Class Declaration"; s1.keyword = "class"; s1.isCaseSensitive = true; s1.requiresSemicolon = false; s1.bracketType = "Curly Braces {}"; s1.exampleSnippet = "class MyClass {}"; s1.complexityLevel = 2; s1.introducedInVersion = 1.0; s1.isDeprecated = false; s1.category = "Structure";
        pl1.syntax = s1; pl1.getProgrammingLanguageDetails();

        ProgrammingLanguage pl2 = new ProgrammingLanguage();
        pl2.languageName = "Java"; pl2.primaryParadigm = "Object-Oriented";
        Syntax s2 = new Syntax();
        s2.conceptName = "Main Method"; s2.keyword = "public static void main"; s2.isCaseSensitive = true; s2.requiresSemicolon = false; s2.bracketType = "Curly Braces {}"; s2.exampleSnippet = "public static void main(String[] args)"; s2.complexityLevel = 3; s2.introducedInVersion = 1.0; s2.isDeprecated = false; s2.category = "Execution Entry";
        pl2.syntax = s2; pl2.getProgrammingLanguageDetails();

        ProgrammingLanguage pl3 = new ProgrammingLanguage();
        pl3.languageName = "HTML"; pl3.primaryParadigm = "Markup";
        Syntax s3 = new Syntax();
        s3.conceptName = "Division Container"; s3.keyword = "div"; s3.isCaseSensitive = false; s3.requiresSemicolon = false; s3.bracketType = "Angle Brackets <>"; s3.exampleSnippet = "<div>Content</div>"; s3.complexityLevel = 1; s3.introducedInVersion = 3.2; s3.isDeprecated = false; s3.category = "Layout";
        pl3.syntax = s3; pl3.getProgrammingLanguageDetails();

        ProgrammingLanguage pl4 = new ProgrammingLanguage();
        pl4.languageName = "HTML"; pl4.primaryParadigm = "Markup";
        Syntax s4 = new Syntax();
        s4.conceptName = "Hyperlink"; s4.keyword = "a"; s4.isCaseSensitive = false; s4.requiresSemicolon = false; s4.bracketType = "Angle Brackets <>"; s4.exampleSnippet = "<a href='url'>Link</a>"; s4.complexityLevel = 2; s4.introducedInVersion = 1.0; s4.isDeprecated = false; s4.category = "Navigation";
        pl4.syntax = s4; pl4.getProgrammingLanguageDetails();

        ProgrammingLanguage pl5 = new ProgrammingLanguage();
        pl5.languageName = "Java"; pl5.primaryParadigm = "Object-Oriented";
        Syntax s5 = new Syntax();
        s5.conceptName = "Variable Assignment"; s5.keyword = "int"; s5.isCaseSensitive = true; s5.requiresSemicolon = true; s5.bracketType = "None"; s5.exampleSnippet = "int x = 10;"; s5.complexityLevel = 1; s5.introducedInVersion = 1.0; s5.isDeprecated = false; s5.category = "Variables";
        pl5.syntax = s5; pl5.getProgrammingLanguageDetails();

        ProgrammingLanguage pl6 = new ProgrammingLanguage();
        pl6.languageName = "Java"; pl6.primaryParadigm = "Object-Oriented";
        Syntax s6 = new Syntax();
        s6.conceptName = "For Loop"; s6.keyword = "for"; s6.isCaseSensitive = true; s6.requiresSemicolon = true; s6.bracketType = "Parentheses & Curly"; s6.exampleSnippet = "for(int i=0; i<10; i++){}"; s6.complexityLevel = 4; s6.introducedInVersion = 1.0; s6.isDeprecated = false; s6.category = "Iteration";
        pl6.syntax = s6; pl6.getProgrammingLanguageDetails();

        ProgrammingLanguage pl7 = new ProgrammingLanguage();
        pl7.languageName = "HTML"; pl7.primaryParadigm = "Markup";
        Syntax s7 = new Syntax();
        s7.conceptName = "Image Embed"; s7.keyword = "img"; s7.isCaseSensitive = false; s7.requiresSemicolon = false; s7.bracketType = "Angle Brackets <>"; s7.exampleSnippet = "<img src='pic.jpg' />"; s7.complexityLevel = 2; s7.introducedInVersion = 2.0; s7.isDeprecated = false; s7.category = "Media";
        pl7.syntax = s7; pl7.getProgrammingLanguageDetails();

        ProgrammingLanguage pl8 = new ProgrammingLanguage();
        pl8.languageName = "Java"; pl8.primaryParadigm = "Object-Oriented";
        Syntax s8 = new Syntax();
        s8.conceptName = "If Condition"; s8.keyword = "if"; s8.isCaseSensitive = true; s8.requiresSemicolon = false; s8.bracketType = "Parentheses & Curly"; s8.exampleSnippet = "if(x > 0) {}"; s8.complexityLevel = 3; s8.introducedInVersion = 1.0; s8.isDeprecated = false; s8.category = "Control Flow";
        pl8.syntax = s8; pl8.getProgrammingLanguageDetails();

        ProgrammingLanguage pl9 = new ProgrammingLanguage();
        pl9.languageName = "Java"; pl9.primaryParadigm = "Object-Oriented";
        Syntax s9 = new Syntax();
        s9.conceptName = "Object Instantiation"; s9.keyword = "new"; s9.isCaseSensitive = true; s9.requiresSemicolon = true; s9.bracketType = "Parentheses ()"; s9.exampleSnippet = "Obj o = new Obj();"; s9.complexityLevel = 4; s9.introducedInVersion = 1.0; s9.isDeprecated = false; s9.category = "Memory Allocation";
        pl9.syntax = s9; pl9.getProgrammingLanguageDetails();

        ProgrammingLanguage pl10 = new ProgrammingLanguage();
        pl10.languageName = "HTML"; pl10.primaryParadigm = "Markup";
        Syntax s10 = new Syntax();
        s10.conceptName = "Paragraph"; s10.keyword = "p"; s10.isCaseSensitive = false; s10.requiresSemicolon = false; s10.bracketType = "Angle Brackets <>"; s10.exampleSnippet = "<p>Text</p>"; s10.complexityLevel = 1; s10.introducedInVersion = 1.0; s10.isDeprecated = false; s10.category = "Text Formatting";
        pl10.syntax = s10; pl10.getProgrammingLanguageDetails();

        ProgrammingLanguage pl11 = new ProgrammingLanguage();
        pl11.languageName = "Java"; pl11.primaryParadigm = "Object-Oriented";
        Syntax s11 = new Syntax();
        s11.conceptName = "Inheritance"; s11.keyword = "extends"; s11.isCaseSensitive = true; s11.requiresSemicolon = false; s11.bracketType = "None"; s11.exampleSnippet = "class A extends B {}"; s11.complexityLevel = 5; s11.introducedInVersion = 1.0; s11.isDeprecated = false; s11.category = "OOP";
        pl11.syntax = s11; pl11.getProgrammingLanguageDetails();

        ProgrammingLanguage pl12 = new ProgrammingLanguage();
        pl12.languageName = "Java"; pl12.primaryParadigm = "Object-Oriented";
        Syntax s12 = new Syntax();
        s12.conceptName = "Exception Handling"; s12.keyword = "try-catch"; s12.isCaseSensitive = true; s12.requiresSemicolon = false; s12.bracketType = "Curly Braces {}"; s12.exampleSnippet = "try {} catch(Exception e) {}"; s12.complexityLevel = 6; s12.introducedInVersion = 1.0; s12.isDeprecated = false; s12.category = "Error Handling";
        pl12.syntax = s12; pl12.getProgrammingLanguageDetails();

        ProgrammingLanguage pl13 = new ProgrammingLanguage();
        pl13.languageName = "HTML"; pl13.primaryParadigm = "Markup";
        Syntax s13 = new Syntax();
        s13.conceptName = "Unordered List"; s13.keyword = "ul"; s13.isCaseSensitive = false; s13.requiresSemicolon = false; s13.bracketType = "Angle Brackets <>"; s13.exampleSnippet = "<ul><li>Item</li></ul>"; s13.complexityLevel = 2; s13.introducedInVersion = 2.0; s13.isDeprecated = false; s13.category = "Lists";
        pl13.syntax = s13; pl13.getProgrammingLanguageDetails();

        ProgrammingLanguage pl14 = new ProgrammingLanguage();
        pl14.languageName = "Java"; pl14.primaryParadigm = "Object-Oriented";
        Syntax s14 = new Syntax();
        s14.conceptName = "Interface Implementation"; s14.keyword = "implements"; s14.isCaseSensitive = true; s14.requiresSemicolon = false; s14.bracketType = "None"; s14.exampleSnippet = "class A implements B {}"; s14.complexityLevel = 5; s14.introducedInVersion = 1.0; s14.isDeprecated = false; s14.category = "OOP";
        pl14.syntax = s14; pl14.getProgrammingLanguageDetails();

        ProgrammingLanguage pl15 = new ProgrammingLanguage();
        pl15.languageName = "HTML"; pl15.primaryParadigm = "Markup";
        Syntax s15 = new Syntax();
        s15.conceptName = "Input Field"; s15.keyword = "input"; s15.isCaseSensitive = false; s15.requiresSemicolon = false; s15.bracketType = "Angle Brackets <>"; s15.exampleSnippet = "<input type='text' />"; s15.complexityLevel = 3; s15.introducedInVersion = 2.0; s15.isDeprecated = false; s15.category = "Forms";
        pl15.syntax = s15; pl15.getProgrammingLanguageDetails();

        ProgrammingLanguage pl16 = new ProgrammingLanguage();
        pl16.languageName = "Java"; pl16.primaryParadigm = "Object-Oriented";
        Syntax s16 = new Syntax();
        s16.conceptName = "Return Statement"; s16.keyword = "return"; s16.isCaseSensitive = true; s16.requiresSemicolon = true; s16.bracketType = "None"; s16.exampleSnippet = "return x;"; s16.complexityLevel = 2; s16.introducedInVersion = 1.0; s16.isDeprecated = false; s16.category = "Methods";
        pl16.syntax = s16; pl16.getProgrammingLanguageDetails();

        ProgrammingLanguage pl17 = new ProgrammingLanguage();
        pl17.languageName = "Java"; pl17.primaryParadigm = "Object-Oriented";
        Syntax s17 = new Syntax();
        s17.conceptName = "Enhanced For Loop"; s17.keyword = "for-each"; s17.isCaseSensitive = true; s17.requiresSemicolon = false; s17.bracketType = "Parentheses & Curly"; s17.exampleSnippet = "for(int x : arr) {}"; s17.complexityLevel = 4; s17.introducedInVersion = 5.0; s17.isDeprecated = false; s17.category = "Iteration";
        pl17.syntax = s17; pl17.getProgrammingLanguageDetails();

        ProgrammingLanguage pl18 = new ProgrammingLanguage();
        pl18.languageName = "HTML"; pl18.primaryParadigm = "Markup";
        Syntax s18 = new Syntax();
        s18.conceptName = "Table Row"; s18.keyword = "tr"; s18.isCaseSensitive = false; s18.requiresSemicolon = false; s18.bracketType = "Angle Brackets <>"; s18.exampleSnippet = "<tr><td>Data</td></tr>"; s18.complexityLevel = 3; s18.introducedInVersion = 3.2; s18.isDeprecated = false; s18.category = "Tables";
        pl18.syntax = s18; pl18.getProgrammingLanguageDetails();

        ProgrammingLanguage pl19 = new ProgrammingLanguage();
        pl19.languageName = "Java"; pl19.primaryParadigm = "Object-Oriented";
        Syntax s19 = new Syntax();
        s19.conceptName = "Switch Case"; s19.keyword = "switch"; s19.isCaseSensitive = true; s19.requiresSemicolon = false; s19.bracketType = "Curly Braces {}"; s19.exampleSnippet = "switch(x) { case 1: }"; s19.complexityLevel = 4; s19.introducedInVersion = 1.0; s19.isDeprecated = false; s19.category = "Control Flow";
        pl19.syntax = s19; pl19.getProgrammingLanguageDetails();

        ProgrammingLanguage pl20 = new ProgrammingLanguage();
        pl20.languageName = "HTML"; pl20.primaryParadigm = "Markup";
        Syntax s20 = new Syntax();
        s20.conceptName = "Script Tag"; s20.keyword = "script"; s20.isCaseSensitive = false; s20.requiresSemicolon = false; s20.bracketType = "Angle Brackets <>"; s20.exampleSnippet = "<script>alert('Hi');</script>"; s20.complexityLevel = 5; s20.introducedInVersion = 3.2; s20.isDeprecated = false; s20.category = "Embeds";
        pl20.syntax = s20; pl20.getProgrammingLanguageDetails();
    }
}