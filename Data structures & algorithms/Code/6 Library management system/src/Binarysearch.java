import java.util.Arrays;
import java.util.Comparator;

public class Binarysearch {
    public static void binarysearch(Book[] books,String title){
        Arrays.sort(books, Comparator.comparing(b -> b.title.toLowerCase()));
        int left=0;
        int right=books.length-1;

        while(left<=right){
            int mid=(left+right)/2;
            int compare = books[mid].title.compareToIgnoreCase(title);

            if(compare==0) {
                System.out.println("Book is present");
                return;
            }
            else if(compare<0) left=mid+1;
            else right=mid-1;
        }
        System.out.println("Not found");
        return;
    }
}
