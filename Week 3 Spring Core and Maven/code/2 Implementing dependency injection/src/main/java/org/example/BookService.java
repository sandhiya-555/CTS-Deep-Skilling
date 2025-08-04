package org.example;

public class BookService {
    private BookRepositry bookrepo;

    public void setBookrepo(BookRepositry bookrepo){
        this.bookrepo=bookrepo;
    }

    public void addbook(String bookn){
        System.out.println("Adding book "+bookn);
        bookrepo.savebook(bookn);
    }
}
