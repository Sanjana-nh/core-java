class SpidermanGame {
    static String gameTitle;
    static String character;
    static String activeSuit;
    static String mainVillain;
    static String currentBorough;
    static String difficulty;
    static String graphicsMode;
    static String hapticFeedback;
    static String completionProgress;
    static String price;
    
    public static boolean initializeGame(String title, String charac, String suit, 
                                         String villain, String borough, String diff, 
                                         String graphics, String haptic, String progress, String prc)
        {
            boolean isGameInitialized = false;
            boolean isTitleValid = false;
            boolean isCharacValid = false;
            boolean isSuitValid = false;
            boolean isVillainValid = false;
            boolean isBoroughValid = false;
            boolean isGraphicsValid = false;
            boolean isHapticValid = false;
            boolean isProgressValid = false;
            boolean isDiffValid = false;
            boolean isPrcValid = false;
            
            if(title != null && !title.isEmpty())
            {
                System.out.println("title is validated");    
                gameTitle = title ;
            }
            else {
                System.out.println("title not found");
            }

            if(charac != null && !charac.isEmpty())
            {
                System.out.println("charac is validated");    
                character = charac ;
            }
            else {
                System.out.println("charac not found");
            }

            if(suit != null && !suit.isEmpty())
            {
                System.out.println("suit is validated");    
                activeSuit = suit ;
            }
            else {
                System.out.println("suit not found");
            }

            if(villain != null && !villain.isEmpty())
            {
                System.out.println("villain is validated");    
                mainVillain = villain ;
            }
            else {
                System.out.println("villain not found");
            }

            if(borough != null && !borough.isEmpty())
            {
                System.out.println("borough is validated");    
                currentBorough = borough ;
            }
            else {
                System.out.println("borough not found");
            }

            if(diff != null && !diff.isEmpty())
            {
                System.out.println("diff is validated");    
                difficulty = diff ;
            }
            else {
                System.out.println("diff not found");
            }

            if(graphics != null && !graphics.isEmpty())
            {
                System.out.println("graphics is validated");    
                graphicsMode = graphics ;
            }
            else {
                System.out.println("graphics not found");
            }

            if(haptic != null && !haptic.isEmpty())
            {
                System.out.println("haptic is validated");    
                hapticFeedback = haptic ;
            }
            else {
                System.out.println("haptic not found");
            }

            if(progress != null && !progress.isEmpty())
            {
                System.out.println("progress is validated");    
                completionProgress = progress ;
            }
            else {
                System.out.println("progress not found");
            }

            if(prc != null && !prc.isEmpty())
            {
                System.out.println("prc is validated");    
                price = prc ;
            }
            else {
                System.out.println("prc not found");
            }

            if(isTitleValid == true && isCharacValid == true && isSuitValid == true && isVillainValid == true && isBoroughValid == true && isDiffValid == true && isGraphicsValid == true && isHapticValid == true && isProgressValid == true && isPrcValid == true )
                isGameInitialized = true;
                return isGameInitialized;
        }

        public static void getGameDetails(){
            System.out.println("The game details are:");
            System.out.println("Game Title :"+gameTitle);
            System.out.println("Character :"+character);
            System.out.println("Active Suit :"+activeSuit);
            System.out.println("Main Villain :"+mainVillain);
            System.out.println("Current Borough :"+currentBorough);
            System.out.println("Difficulty :"+difficulty);
            System.out.println("Graphics Mode :"+graphicsMode);
            System.out.println("Haptic Feedback :"+hapticFeedback);
            System.out.println("Completion Progress :"+completionProgress);
            System.out.println("Price :"+price);
            System.out.println("--------------------------------------------------");			
        }
}