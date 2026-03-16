class NewsPaperRunner {
    public static void main(String[] args) {
        
        NewsPaper np1 = new NewsPaper();
        np1.paperName = "The Times of India"; np1.language = "English";
        Article a1 = new Article();
        a1.articleId = "ART-001"; a1.headline = "Sensex Hits Record High"; a1.authorName = "Ramesh Kumar"; a1.category = "Business"; a1.wordCount = 500; a1.isFrontPage = true; a1.publishDate = "2024-05-01"; a1.readingTimeMins = 3; a1.numberOfImages = 2; a1.isExclusive = false;
        np1.article = a1; np1.getNewsPaperDetails();

        NewsPaper np2 = new NewsPaper();
        np2.paperName = "The Hindu"; np2.language = "English";
        Article a2 = new Article();
        a2.articleId = "ART-002"; a2.headline = "Monsoon to Arrive Early"; a2.authorName = "Priya Menon"; a2.category = "Environment"; a2.wordCount = 450; a2.isFrontPage = true; a2.publishDate = "2024-05-02"; a2.readingTimeMins = 2; a2.numberOfImages = 1; a2.isExclusive = false;
        np2.article = a2; np2.getNewsPaperDetails();

        NewsPaper np3 = new NewsPaper();
        np3.paperName = "Deccan Herald"; np3.language = "English";
        Article a3 = new Article();
        a3.articleId = "ART-003"; a3.headline = "Traffic Diversions in CBD"; a3.authorName = "Amit Sharma"; a3.category = "City News"; a3.wordCount = 300; a3.isFrontPage = false; a3.publishDate = "2024-05-03"; a3.readingTimeMins = 1; a3.numberOfImages = 1; a3.isExclusive = false;
        np3.article = a3; np3.getNewsPaperDetails();

        NewsPaper np4 = new NewsPaper();
        np4.paperName = "Prajavani"; np4.language = "Kannada";
        Article a4 = new Article();
        a4.articleId = "ART-004"; a4.headline = "New Metro Line Approved"; a4.authorName = "Gowda K"; a4.category = "Infrastructure"; a4.wordCount = 600; a4.isFrontPage = true; a4.publishDate = "2024-05-04"; a4.readingTimeMins = 4; a4.numberOfImages = 3; a4.isExclusive = true;
        np4.article = a4; np4.getNewsPaperDetails();

        NewsPaper np5 = new NewsPaper();
        np5.paperName = "Economic Times"; np5.language = "English";
        Article a5 = new Article();
        a5.articleId = "ART-005"; a5.headline = "Tech Startups Secure Funding"; a5.authorName = "Neha Singh"; a5.category = "Startups"; a5.wordCount = 800; a5.isFrontPage = false; a5.publishDate = "2024-05-05"; a5.readingTimeMins = 5; a5.numberOfImages = 2; a5.isExclusive = true;
        np5.article = a5; np5.getNewsPaperDetails();

        NewsPaper np6 = new NewsPaper();
        np6.paperName = "Indian Express"; np6.language = "English";
        Article a6 = new Article();
        a6.articleId = "ART-006"; a6.headline = "Elections Phase 3 Concludes"; a6.authorName = "Vikram Reddy"; a6.category = "Politics"; a6.wordCount = 1200; a6.isFrontPage = true; a6.publishDate = "2024-05-06"; a6.readingTimeMins = 8; a6.numberOfImages = 4; a6.isExclusive = false;
        np6.article = a6; np6.getNewsPaperDetails();

        NewsPaper np7 = new NewsPaper();
        np7.paperName = "Dainik Jagran"; np7.language = "Hindi";
        Article a7 = new Article();
        a7.articleId = "ART-007"; a7.headline = "Farmers Protest Updates"; a7.authorName = "Anil Desai"; a7.category = "National"; a7.wordCount = 400; a7.isFrontPage = false; a7.publishDate = "2024-05-07"; a7.readingTimeMins = 2; a7.numberOfImages = 1; a7.isExclusive = false;
        np7.article = a7; np7.getNewsPaperDetails();

        NewsPaper np8 = new NewsPaper();
        np8.paperName = "The Telegraph"; np8.language = "English";
        Article a8 = new Article();
        a8.articleId = "ART-008"; a8.headline = "Local Team Wins Championship"; a8.authorName = "Suresh Nair"; a8.category = "Sports"; a8.wordCount = 350; a8.isFrontPage = false; a8.publishDate = "2024-05-08"; a8.readingTimeMins = 2; a8.numberOfImages = 2; a8.isExclusive = false;
        np8.article = a8; np8.getNewsPaperDetails();

        NewsPaper np9 = new NewsPaper();
        np9.paperName = "Mint"; np9.language = "English";
        Article a9 = new Article();
        a9.articleId = "ART-009"; a9.headline = "RBI Keeps Repo Rate Unchanged"; a9.authorName = "Deepak Joshi"; a9.category = "Economy"; a9.wordCount = 650; a9.isFrontPage = true; a9.publishDate = "2024-05-09"; a9.readingTimeMins = 4; a9.numberOfImages = 1; a9.isExclusive = true;
        np9.article = a9; np9.getNewsPaperDetails();

        NewsPaper np10 = new NewsPaper();
        np10.paperName = "Hindustan Times"; np10.language = "English";
        Article a10 = new Article();
        a10.articleId = "ART-010"; a10.headline = "New Movie Breaks Records"; a10.authorName = "Aditi Rao"; a10.category = "Entertainment"; a10.wordCount = 400; a10.isFrontPage = false; a10.publishDate = "2024-05-10"; a10.readingTimeMins = 3; a10.numberOfImages = 3; a10.isExclusive = false;
        np10.article = a10; np10.getNewsPaperDetails();

        NewsPaper np11 = new NewsPaper();
        np11.paperName = "The Hindu"; np11.language = "English";
        Article a11 = new Article();
        a11.articleId = "ART-011"; a11.headline = "Chandrayaan Data Analyzed"; a11.authorName = "Kiran B"; a11.category = "Science"; a11.wordCount = 900; a11.isFrontPage = false; a11.publishDate = "2024-05-11"; a11.readingTimeMins = 6; a11.numberOfImages = 2; a11.isExclusive = true;
        np11.article = a11; np11.getNewsPaperDetails();

        NewsPaper np12 = new NewsPaper();
        np12.paperName = "Deccan Chronicle"; np12.language = "English";
        Article a12 = new Article();
        a12.articleId = "ART-012"; a12.headline = "City Water Crisis Deepens"; a12.authorName = "Ashok Kumar"; a12.category = "Civic Issues"; a12.wordCount = 550; a12.isFrontPage = true; a12.publishDate = "2024-05-12"; a12.readingTimeMins = 3; a12.numberOfImages = 2; a12.isExclusive = false;
        np12.article = a12; np12.getNewsPaperDetails();

        NewsPaper np13 = new NewsPaper();
        np13.paperName = "Malayala Manorama"; np13.language = "Malayalam";
        Article a13 = new Article();
        a13.articleId = "ART-013"; a13.headline = "Boat Race Preparations Begin"; a13.authorName = "Manoj Iyer"; a13.category = "Culture"; a13.wordCount = 450; a13.isFrontPage = false; a13.publishDate = "2024-05-13"; a13.readingTimeMins = 2; a13.numberOfImages = 3; a13.isExclusive = false;
        np13.article = a13; np13.getNewsPaperDetails();

        NewsPaper np14 = new NewsPaper();
        np14.paperName = "Eenadu"; np14.language = "Telugu";
        Article a14 = new Article();
        a14.articleId = "ART-014"; a14.headline = "State Budget Highlights"; a14.authorName = "Ravi Verma"; a14.category = "Politics"; a14.wordCount = 800; a14.isFrontPage = true; a14.publishDate = "2024-05-14"; a14.readingTimeMins = 5; a14.numberOfImages = 1; a14.isExclusive = false;
        np14.article = a14; np14.getNewsPaperDetails();

        NewsPaper np15 = new NewsPaper();
        np15.paperName = "The Times of India"; np15.language = "English";
        Article a15 = new Article();
        a15.articleId = "ART-015"; a15.headline = "New IT Park Inaugurated"; a15.authorName = "Vinay R"; a15.category = "Technology"; a15.wordCount = 300; a15.isFrontPage = false; a15.publishDate = "2024-05-15"; a15.readingTimeMins = 2; a15.numberOfImages = 2; a15.isExclusive = false;
        np15.article = a15; np15.getNewsPaperDetails();

        NewsPaper np16 = new NewsPaper();
        np16.paperName = "Business Standard"; np16.language = "English";
        Article a16 = new Article();
        a16.articleId = "ART-016"; a16.headline = "Gold Prices Surge Globally"; a16.authorName = "Arjun Menon"; a16.category = "Commodities"; a16.wordCount = 500; a16.isFrontPage = true; a16.publishDate = "2024-05-16"; a16.readingTimeMins = 3; a16.numberOfImages = 1; a16.isExclusive = false;
        np16.article = a16; np16.getNewsPaperDetails();

        NewsPaper np17 = new NewsPaper();
        np17.paperName = "Dina Thanthi"; np17.language = "Tamil";
        Article a17 = new Article();
        a17.articleId = "ART-017"; a17.headline = "Heavy Rains Predicted"; a17.authorName = "Karthik N"; a17.category = "Weather"; a17.wordCount = 200; a17.isFrontPage = true; a17.publishDate = "2024-05-17"; a17.readingTimeMins = 1; a17.numberOfImages = 0; a17.isExclusive = false;
        np17.article = a17; np17.getNewsPaperDetails();

        NewsPaper np18 = new NewsPaper();
        np18.paperName = "The Tribune"; np18.language = "English";
        Article a18 = new Article();
        a18.articleId = "ART-018"; a18.headline = "University Announces New Courses"; a18.authorName = "Sneha Gupta"; a18.category = "Education"; a18.wordCount = 400; a18.isFrontPage = false; a18.publishDate = "2024-05-18"; a18.readingTimeMins = 2; a18.numberOfImages = 1; a18.isExclusive = false;
        np18.article = a18; np18.getNewsPaperDetails();

        NewsPaper np19 = new NewsPaper();
        np19.paperName = "Navbharat Times"; np19.language = "Hindi";
        Article a19 = new Article();
        a19.articleId = "ART-019"; a19.headline = "Festival Season Sales Begin"; a19.authorName = "Pooja Hegde"; a19.category = "Lifestyle"; a19.wordCount = 450; a19.isFrontPage = false; a19.publishDate = "2024-05-19"; a19.readingTimeMins = 3; a19.numberOfImages = 4; a19.isExclusive = false;
        np19.article = a19; np19.getNewsPaperDetails();

        NewsPaper np20 = new NewsPaper();
        np20.paperName = "The Hindu"; np20.language = "English";
        Article a20 = new Article();
        a20.articleId = "ART-020"; a20.headline = "Op-Ed: The Future of AI"; a20.authorName = "Sanjay"; a20.category = "Opinion"; a20.wordCount = 1000; a20.isFrontPage = false; a20.publishDate = "2024-05-20"; a20.readingTimeMins = 6; a20.numberOfImages = 1; a20.isExclusive = true;
        np20.article = a20; np20.getNewsPaperDetails();
    }
}