class NewsPaper {
    String paperName;
    String language;
    Article article;

    public void getNewsPaperDetails() {
        System.out.println("========================");
        System.out.println("Paper Name : " + paperName);
        System.out.println("Language : " + language);
        this.article.getArticleDetails();
    }
}