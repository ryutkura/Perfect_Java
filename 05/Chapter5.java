public class Chapter5 {


    public static void main(String... args){
        //書物クラスの定義図
        class Book{
            //2つのフィールドを持っている
        String title;
        String author;
    }
        
        //1つ目の書物オブジェクト    
        Book book1 = new Book();
        book1.title = "Peopleware";
        
        //2つ目の書物オブジェクト
        Book book2 = new Book();
        book2.title = "Showstopper!";
    }
}
