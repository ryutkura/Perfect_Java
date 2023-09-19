public class Chapter5 {


    public static void main(String[] args){
        //書物クラスの定義図
        class Book{
        //2つのフィールドを持っている
        String title;//それぞれ独立した値をセットできる
        String author;
        }
        
        //1つ目の書物オブジェクト    
        Book book1 = new Book();//Bookオブジェクトのtitleフィールドを生成。titleフィールドのフィールド変数
        book1.title = "Peopleware";//StringオブジェクトのPeoplewareを生成。こいつはフィールドオブジェクト
        
        //2つ目の書物オブジェクト
        Book book2 = new Book();
        book2.title = "Showstopper!";

        System.out.println("これは研究室で書いたコードです。\nこれが成功したらわざわざPCを持ち歩かなくても\nファイル管理ができるので研究が進みます");
        System.out.println("現在mainブランチにて作業中です。");
    }
}
