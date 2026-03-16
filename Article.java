class Article {
    String articleId;
    String headline;
    String authorName;
    String category;
    int wordCount;
    boolean isFrontPage;
    String publishDate;
    int readingTimeMins;
    int numberOfImages;
    boolean isExclusive;

    public void getArticleDetails() {
        System.out.println("------------------------");
        System.out.println("The Article Details are:");
        System.out.println("Article ID : " + articleId);
        System.out.println("Headline : " + headline);
        System.out.println("Author : " + authorName);
        System.out.println("Category : " + category);
        System.out.println("Word Count : " + wordCount);
        System.out.println("Front Page : " + isFrontPage);
        System.out.println("Publish Date : " + publishDate);
        System.out.println("Reading Time : " + readingTimeMins + " mins");
        System.out.println("Images : " + numberOfImages);
        System.out.println("Exclusive : " + isExclusive);
    }
}



