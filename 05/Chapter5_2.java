public class Chapter5_2 {
    public static void main(String[] args){
        class My{
            //フィールド宣言
            private final String s = "foo";

            //別のフィールド変数の初期化子でsを使用可能
            private final String s2 = s;

            //メソッド内でsを使用可能
            void method(){
                System.out.println("これはmethodの"+s);//このmethod全部fooが表示された
                System.out.println("これはmethodの"+s2);
                System.out.println("これはmethodのthis."+this.s);
            }
            
            void method2(){
                System.out.println("これはmethod2の"+s);//このmethod全部fooが表示された
                System.out.println("これはmethod2のthis."+this.s);
            }
            
            My(String s){
                System.out.println("これはMy(String)の"+ s);/*ここで一発キヨシが表示された*/
                System.out.println("これはMy(Stirng)のthis."+this.s);/*この行ではfooが表示された */
            }

            My(){
                String s = "bar";
                System.out.println("これはコンストラクタ内での"+s);/*この行ではbarが表示された*/
                System.out.println("これはコンストラクタ内でのthis."+this.s);//この行ではfooが表示された
            }
        }

        My my = new My("ここで一発キヨシ！");
        my.method();
        
        My my2 = new My();
        my2.method2();
        


    }
}
