public class Chapter5_2 {
    public static void main(String[] args){
        class My{
            //フィールド宣言
            private final String s = "foo";

            //別のフィールド変数の初期化子でsを使用可能
            private final String s2 = s;

            //メソッド内でsを使用可能
            void method(){
                System.out.println("これはmethodの"+s);
                System.out.println("これはmethodの"+s2);
            }

            My(){
                System.out.println("これはコンストラクタ内での"+s);
            }
        }

        My my = new My();
        my.method();
        


    }
}
