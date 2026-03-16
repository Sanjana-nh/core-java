class LibraryRunner{
public static void main(String [] args){

Library library = new Library();
library.libName = "Kuvempu Library";

Book book =  new Book ();
book.bookId = 73;
book.bookName = "Big Bang Theory";

library.book = book ;

library.getLibraryDetails();

}



}