class Movie {
    static String title;
    static String leadActor;
    static String leadActress;
    static String director;
    static String releaseYear;
    static String boxOffice;
    static String rating;
    
    public static boolean initializeMovie(String t, String actor, String actress, 
                                          String dir, String year, String box, String rate)
        {
            boolean isMovieInitialized = false;
            boolean isTitleValid = false;
            boolean isActorValid = false;
            boolean isActressValid = false;
            boolean isDirValid = false;
            boolean isYearValid = false;
            boolean isBoxValid = false;
            boolean isRateValid = false;
            
            if(t != null && !t.isEmpty())
            {
                System.out.println("title is validated");    
                title = t ;
            }
            else {
                System.out.println("title not found");
            }

            if(actor != null && !actor.isEmpty())
            {
                System.out.println("actor is validated");    
                leadActor = actor ;
            }
            else {
                System.out.println("actor not found");
            }

            if(actress != null && !actress.isEmpty())
            {
                System.out.println("actress is validated");    
                leadActress = actress ;
            }
            else {
                System.out.println("actress not found");
            }

            if(dir != null && !dir.isEmpty())
            {
                System.out.println("dir is validated");    
                director = dir ;
            }
            else {
                System.out.println("dir not found");
            }

            if(year != null && !year.isEmpty())
            {
                System.out.println("year is validated");    
                releaseYear = year ;
            }
            else {
                System.out.println("year not found");
            }

            if(box != null && !box.isEmpty())
            {
                System.out.println("box is validated");    
                boxOffice = box ;
            }
            else {
                System.out.println("box not found");
            }

            if(rate != null && !rate.isEmpty())
            {
                System.out.println("rate is validated");    
                rating = rate ;
            }
            else {
                System.out.println("rate not found");
            }

            if(isTitleValid == true && isActorValid == true && isActressValid == true && isDirValid == true && isYearValid == true && isBoxValid == true && isRateValid == true )
                isMovieInitialized = true;
                return isMovieInitialized;
        }

        public static void getMovieDetails(){
            System.out.println("The movie details are:");
            System.out.println("Title :" + title);
            System.out.println("Lead Actor :" + leadActor);
            System.out.println("Lead Actress :" + leadActress);
            System.out.println("Director :" + director);
            System.out.println("Release Year :" + releaseYear);
            System.out.println("Box Office :" + boxOffice);
            System.out.println("Rating :" + rating);
            System.out.println("--------------------------------------------------");
        }
}