class Movie {
    String movieId;
    String movieTitle;
    String genre;
    String director;
    double budgetCrores;
    double boxOfficeCollectionCrores;
    boolean isBlockbuster;
    int releaseYear;
    String leadActor;
    double imdbRating;

    public void getMovieDetails() {
        System.out.println("------------------------");
        System.out.println("The Movie Details are:");
        System.out.println("Movie ID : " + movieId);
        System.out.println("Title : " + movieTitle);
        System.out.println("Genre : " + genre);
        System.out.println("Director : " + director);
        System.out.println("Budget (Cr) : " + budgetCrores);
        System.out.println("Box Office (Cr): " + boxOfficeCollectionCrores);
        System.out.println("Blockbuster : " + isBlockbuster);
        System.out.println("Release Year : " + releaseYear);
        System.out.println("Lead Actor : " + leadActor);
        System.out.println("IMDB Rating : " + imdbRating);
    }
}



