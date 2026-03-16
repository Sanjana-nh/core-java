class ProductionHouseRunner {
    public static void main(String[] args) {
        
        ProductionHouse ph1 = new ProductionHouse();
        ph1.houseName = "Hombale Films"; ph1.founderName = "Vijay Kiragandur";
        Movie m1 = new Movie();
        m1.movieId = "MOV-01"; m1.movieTitle = "K.G.F: Chapter 2"; m1.genre = "Action"; m1.director = "Prashanth Neel"; m1.budgetCrores = 100.0; m1.boxOfficeCollectionCrores = 1200.0; m1.isBlockbuster = true; m1.releaseYear = 2022; m1.leadActor = "Yash"; m1.imdbRating = 8.3;
        ph1.movie = m1; ph1.getProductionHouseDetails();

        ProductionHouse ph2 = new ProductionHouse();
        ph2.houseName = "Hombale Films"; ph2.founderName = "Vijay Kiragandur";
        Movie m2 = new Movie();
        m2.movieId = "MOV-02"; m2.movieTitle = "Kantara"; m2.genre = "Action Thriller"; m2.director = "Rishab Shetty"; m2.budgetCrores = 16.0; m2.boxOfficeCollectionCrores = 400.0; m2.isBlockbuster = true; m2.releaseYear = 2022; m2.leadActor = "Rishab Shetty"; m2.imdbRating = 8.2;
        ph2.movie = m2; ph2.getProductionHouseDetails();

        ProductionHouse ph3 = new ProductionHouse();
        ph3.houseName = "Yash Raj Films"; ph3.founderName = "Yash Chopra";
        Movie m3 = new Movie();
        m3.movieId = "MOV-03"; m3.movieTitle = "Pathaan"; m3.genre = "Action Spy"; m3.director = "Siddharth Anand"; m3.budgetCrores = 225.0; m3.boxOfficeCollectionCrores = 1050.0; m3.isBlockbuster = true; m3.releaseYear = 2023; m3.leadActor = "Shah Rukh Khan"; m3.imdbRating = 5.9;
        ph3.movie = m3; ph3.getProductionHouseDetails();

        ProductionHouse ph4 = new ProductionHouse();
        ph4.houseName = "Yash Raj Films"; ph4.founderName = "Yash Chopra";
        Movie m4 = new Movie();
        m4.movieId = "MOV-04"; m4.movieTitle = "War"; m4.genre = "Action Thriller"; m4.director = "Siddharth Anand"; m4.budgetCrores = 150.0; m4.boxOfficeCollectionCrores = 475.0; m4.isBlockbuster = true; m4.releaseYear = 2019; m4.leadActor = "Hrithik Roshan"; m4.imdbRating = 6.5;
        ph4.movie = m4; ph4.getProductionHouseDetails();

        ProductionHouse ph5 = new ProductionHouse();
        ph5.houseName = "Mythri Movie Makers"; ph5.founderName = "Naveen Yerneni";
        Movie m5 = new Movie();
        m5.movieId = "MOV-05"; m5.movieTitle = "Pushpa: The Rise"; m5.genre = "Action Drama"; m5.director = "Sukumar"; m5.budgetCrores = 170.0; m5.boxOfficeCollectionCrores = 350.0; m5.isBlockbuster = true; m5.releaseYear = 2021; m5.leadActor = "Allu Arjun"; m5.imdbRating = 7.6;
        ph5.movie = m5; ph5.getProductionHouseDetails();

        ProductionHouse ph6 = new ProductionHouse();
        ph6.houseName = "DVV Entertainments"; ph6.founderName = "D. V. V. Danayya";
        Movie m6 = new Movie();
        m6.movieId = "MOV-06"; m6.movieTitle = "RRR"; m6.genre = "Epic Action"; m6.director = "S. S. Rajamouli"; m6.budgetCrores = 550.0; m6.boxOfficeCollectionCrores = 1300.0; m6.isBlockbuster = true; m6.releaseYear = 2022; m6.leadActor = "Ram Charan & Jr NTR"; m6.imdbRating = 7.8;
        ph6.movie = m6; ph6.getProductionHouseDetails();

        ProductionHouse ph7 = new ProductionHouse();
        ph7.houseName = "Red Chillies Entertainment"; ph7.founderName = "Shah Rukh Khan";
        Movie m7 = new Movie();
        m7.movieId = "MOV-07"; m7.movieTitle = "Jawan"; m7.genre = "Action Thriller"; m7.director = "Atlee"; m7.budgetCrores = 300.0; m7.boxOfficeCollectionCrores = 1140.0; m7.isBlockbuster = true; m7.releaseYear = 2023; m7.leadActor = "Shah Rukh Khan"; m7.imdbRating = 7.0;
        ph7.movie = m7; ph7.getProductionHouseDetails();

        ProductionHouse ph8 = new ProductionHouse();
        ph8.houseName = "Dharma Productions"; ph8.founderName = "Yash Johar";
        Movie m8 = new Movie();
        m8.movieId = "MOV-08"; m8.movieTitle = "Brahmastra"; m8.genre = "Fantasy Action"; m8.director = "Ayan Mukerji"; m8.budgetCrores = 410.0; m8.boxOfficeCollectionCrores = 430.0; m8.isBlockbuster = false; m8.releaseYear = 2022; m8.leadActor = "Ranbir Kapoor"; m8.imdbRating = 5.6;
        ph8.movie = m8; ph8.getProductionHouseDetails();

        ProductionHouse ph9 = new ProductionHouse();
        ph9.houseName = "Lyca Productions"; ph9.founderName = "Subaskaran Allirajah";
        Movie m9 = new Movie();
        m9.movieId = "MOV-09"; m9.movieTitle = "Ponniyin Selvan: I"; m9.genre = "Historical Epic"; m9.director = "Mani Ratnam"; m9.budgetCrores = 250.0; m9.boxOfficeCollectionCrores = 500.0; m9.isBlockbuster = true; m9.releaseYear = 2022; m9.leadActor = "Vikram"; m9.imdbRating = 7.6;
        ph9.movie = m9; ph9.getProductionHouseDetails();

        ProductionHouse ph10 = new ProductionHouse();
        ph10.houseName = "Arka Media Works"; ph10.founderName = "Shobu Yarlagadda";
        Movie m10 = new Movie();
        m10.movieId = "MOV-10"; m10.movieTitle = "Baahubali 2: The Conclusion"; m10.genre = "Epic Action"; m10.director = "S. S. Rajamouli"; m10.budgetCrores = 250.0; m10.boxOfficeCollectionCrores = 1810.0; m10.isBlockbuster = true; m10.releaseYear = 2017; m10.leadActor = "Prabhas"; m10.imdbRating = 8.2;
        ph10.movie = m10; ph10.getProductionHouseDetails();

        ProductionHouse ph11 = new ProductionHouse();
        ph11.houseName = "Hombale Films"; ph11.founderName = "Vijay Kiragandur";
        Movie m11 = new Movie();
        m11.movieId = "MOV-11"; m11.movieTitle = "Salaar: Part 1"; m11.genre = "Action Thriller"; m11.director = "Prashanth Neel"; m11.budgetCrores = 270.0; m11.boxOfficeCollectionCrores = 700.0; m11.isBlockbuster = true; m11.releaseYear = 2023; m11.leadActor = "Prabhas"; m11.imdbRating = 6.5;
        ph11.movie = m11; ph11.getProductionHouseDetails();

        ProductionHouse ph12 = new ProductionHouse();
        ph12.houseName = "Sun Pictures"; ph12.founderName = "Kalanithi Maran";
        Movie m12 = new Movie();
        m12.movieId = "MOV-12"; m12.movieTitle = "Jailer"; m12.genre = "Action Comedy"; m12.director = "Nelson"; m12.budgetCrores = 200.0; m12.boxOfficeCollectionCrores = 600.0; m12.isBlockbuster = true; m12.releaseYear = 2023; m12.leadActor = "Rajinikanth"; m12.imdbRating = 7.1;
        ph12.movie = m12; ph12.getProductionHouseDetails();

        ProductionHouse ph13 = new ProductionHouse();
        ph13.houseName = "Aamir Khan Productions"; ph13.founderName = "Aamir Khan";
        Movie m13 = new Movie();
        m13.movieId = "MOV-13"; m13.movieTitle = "Dangal"; m13.genre = "Sports Drama"; m13.director = "Nitesh Tiwari"; m13.budgetCrores = 70.0; m13.boxOfficeCollectionCrores = 2000.0; m13.isBlockbuster = true; m13.releaseYear = 2016; m13.leadActor = "Aamir Khan"; m13.imdbRating = 8.3;
        ph13.movie = m13; ph13.getProductionHouseDetails();

        ProductionHouse ph14 = new ProductionHouse();
        ph14.houseName = "Rajkumar Films"; ph14.founderName = "Dr. Rajkumar";
        Movie m14 = new Movie();
        m14.movieId = "MOV-14"; m14.movieTitle = "Raajakumara"; m14.genre = "Family Drama"; m14.director = "Santhosh Ananddram"; m14.budgetCrores = 15.0; m14.boxOfficeCollectionCrores = 75.0; m14.isBlockbuster = true; m14.releaseYear = 2017; m14.leadActor = "Puneeth Rajkumar"; m14.imdbRating = 7.9;
        ph14.movie = m14; ph14.getProductionHouseDetails();

        ProductionHouse ph15 = new ProductionHouse();
        ph15.houseName = "Geetha Arts"; ph15.founderName = "Allu Aravind";
        Movie m15 = new Movie();
        m15.movieId = "MOV-15"; m15.movieTitle = "Ala Vaikunthapurramuloo"; m15.genre = "Action Drama"; m15.director = "Trivikram Srinivas"; m15.budgetCrores = 100.0; m15.boxOfficeCollectionCrores = 260.0; m15.isBlockbuster = true; m15.releaseYear = 2020; m15.leadActor = "Allu Arjun"; m15.imdbRating = 7.3;
        ph15.movie = m15; ph15.getProductionHouseDetails();

        ProductionHouse ph16 = new ProductionHouse();
        ph16.houseName = "Vinod Chopra Films"; ph16.founderName = "Vidhu Vinod Chopra";
        Movie m16 = new Movie();
        m16.movieId = "MOV-16"; m16.movieTitle = "3 Idiots"; m16.genre = "Comedy Drama"; m16.director = "Rajkumar Hirani"; m16.budgetCrores = 55.0; m16.boxOfficeCollectionCrores = 400.0; m16.isBlockbuster = true; m16.releaseYear = 2009; m16.leadActor = "Aamir Khan"; m16.imdbRating = 8.4;
        ph16.movie = m16; ph16.getProductionHouseDetails();

        ProductionHouse ph17 = new ProductionHouse();
        ph17.houseName = "Haarika & Hassine Creations"; ph17.founderName = "S. Radha Krishna";
        Movie m17 = new Movie();
        m17.movieId = "MOV-17"; m17.movieTitle = "Guntur Kaaram"; m17.genre = "Action Drama"; m17.director = "Trivikram Srinivas"; m17.budgetCrores = 200.0; m17.boxOfficeCollectionCrores = 180.0; m17.isBlockbuster = false; m17.releaseYear = 2024; m17.leadActor = "Mahesh Babu"; m17.imdbRating = 5.4;
        ph17.movie = m17; ph17.getProductionHouseDetails();

        ProductionHouse ph18 = new ProductionHouse();
        ph18.houseName = "Seven Screen Studio"; ph18.founderName = "S. S. Lalit Kumar";
        Movie m18 = new Movie();
        m18.movieId = "MOV-18"; m18.movieTitle = "Leo"; m18.genre = "Action Thriller"; m18.director = "Lokesh Kanagaraj"; m18.budgetCrores = 300.0; m18.boxOfficeCollectionCrores = 620.0; m18.isBlockbuster = true; m18.releaseYear = 2023; m18.leadActor = "Vijay"; m18.imdbRating = 7.2;
        ph18.movie = m18; ph18.getProductionHouseDetails();

        ProductionHouse ph19 = new ProductionHouse();
        ph19.houseName = "Paramvah Studios"; ph19.founderName = "Rakshit Shetty";
        Movie m19 = new Movie();
        m19.movieId = "MOV-19"; m19.movieTitle = "777 Charlie"; m19.genre = "Adventure Drama"; m19.director = "Kiranraj K"; m19.budgetCrores = 20.0; m19.boxOfficeCollectionCrores = 105.0; m19.isBlockbuster = true; m19.releaseYear = 2022; m19.leadActor = "Rakshit Shetty"; m19.imdbRating = 8.8;
        ph19.movie = m19; ph19.getProductionHouseDetails();

        ProductionHouse ph20 = new ProductionHouse();
        ph20.houseName = "Viacom18 Studios"; ph20.founderName = "Network18 Group";
        Movie m20 = new Movie();
        m20.movieId = "MOV-20"; m20.movieTitle = "Fighter"; m20.genre = "Action"; m20.director = "Siddharth Anand"; m20.budgetCrores = 250.0; m20.boxOfficeCollectionCrores = 330.0; m20.isBlockbuster = false; m20.releaseYear = 2024; m20.leadActor = "Hrithik Roshan"; m20.imdbRating = 6.4;
        ph20.movie = m20; ph20.getProductionHouseDetails();
    }
}