public class Main {
    public static void main(String[] args) {
        Book[] books={
                new Book(10,"Maths","Benedict"),
                new Book(30,"Science","Kumar"),
                new Book(20,"History","Dinesh")
        };


       Linearsearch.linearsearch(books,"Science");
       Binarysearch.binarysearch(books,"History");
    }
}