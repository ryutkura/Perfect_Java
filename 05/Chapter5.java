public class Chapter5 {


    public static void main(String... args){
        //書物クラスの定義図
        class Book{
            //2つのフィールドを持っている
            String title;//それぞれ独立した値をセットできる
            String author;

            //メソッド StringBuilderのlengthとかappendとか
            void printTitle(){
                //メソッドにはオブジェクトに対する処理が書かれている
                System.out.println(this.title);//thisは省略可能
            }
        }
        
        //1つ目の書物オブジェクト    
        Book book1 = new Book();//Bookオブジェクトのtitleフィールドを生成。titleフィールドのフィールド変数
        book1.title = "Peopleware";//StringオブジェクトのPeoplewareを生成。こいつはフィールドオブジェクト
        book1.printTitle();//オブジェクトに処理を依頼したりオブジェクトの状態を知るために呼び出す
        //レジィの術式みたく↑こいつらに実体がある。概念的に雛形がクラスにあるのは術式と同じ、術式発動したらレシートは実体になる
        
        //2つ目の書物オブジェクト
        Book book2 = new Book();
        book2.title = "Showstopper!";

        //
    }
}
