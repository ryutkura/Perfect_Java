public class Chapter5_2 {
    public static void main(String[] args){
        class My{
            //�t�B�[���h�錾
            private final String s = "foo";

            //�ʂ̃t�B�[���h�ϐ��̏������q��s���g�p�\
            private final String s2 = s;

            //���\�b�h����s���g�p�\
            void method(){
                System.out.println("�����method��"+s);//����method�S��foo���\�����ꂽ
                System.out.println("�����method��"+s2);
                System.out.println("�����method��this."+this.s);
            }
            
            void method2(){
                System.out.println("�����method2��"+s);//����method�S��foo���\�����ꂽ
                System.out.println("�����method2��this."+this.s);
            }
            
            My(String s){
                System.out.println("�����My(String)��"+ s);/*�����ňꔭ�L���V���\�����ꂽ*/
                System.out.println("�����My(Stirng)��this."+this.s);/*���̍s�ł�foo���\�����ꂽ */
            }

            My(){
                String s = "bar";
                System.out.println("����̓R���X�g���N�^���ł�"+s);/*���̍s�ł�bar���\�����ꂽ*/
                System.out.println("����̓R���X�g���N�^���ł�this."+this.s);//���̍s�ł�foo���\�����ꂽ
            }
        }

        My my = new My("�����ňꔭ�L���V�I");
        my.method();
        
        My my2 = new My();
        my2.method2();
        


    }
}
