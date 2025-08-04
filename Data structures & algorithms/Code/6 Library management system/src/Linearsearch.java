import java.sql.SQLOutput;

public class Linearsearch {
    public static void linearsearch(Book[] books,String title){
        for(Book book:books){
            if(title.equalsIgnoreCase(book.title)){
                System.out.println("Book found "+book.title+" Price: "+book.author);
            }
        }
    }

}
