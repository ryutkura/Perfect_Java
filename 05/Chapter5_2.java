public class Chapter5_2 {
    public static void main(String[] args){
        class My{
            //�t�B�[���h�錾
            private final String s = "foo";

            //�ʂ̃t�B�[���h�ϐ��̏������q��s���g�p�\
            private final String s2 = s;

            //���\�b�h����s���g�p�\
            void method(){
                System.out.println("�����method��"+s);
                System.out.println("�����method��"+s2);
            }

            My(){
                System.out.println("����̓R���X�g���N�^���ł�"+s);
            }
        }

        My my = new My();
        my.method();
        


    }
}
