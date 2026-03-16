class Library{

	String libName;
	Book book;
	
	public void getLibraryDetails(){
	System.out.println("Name of the Library " +libName);
	System.out.println("Fetching Book Details");
	this.book.getBookDetails();
	}

}