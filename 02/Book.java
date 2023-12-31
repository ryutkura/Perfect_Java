import java.util.Date;

public class Book {
    private final String title;
    private final String author;
    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString(){
        return title + " written by " + author;
    }

    public static void main(String... args){
        Book book = new Book("Peopleware", "DeMarco");
        System.out.println(book);
        Date dt = new Date();
        System.out.println(dt);
        int i = Integer.MAX_VALUE;
        System.out.println(i);
        i++;
        System.out.println(i);
    }
}
