public class Chapter5 {


    public static void main(String... args){
        //�����N���X�̒�`�}
        class Book{
            //2�̃t�B�[���h�������Ă���
            String title;//���ꂼ��Ɨ������l���Z�b�g�ł���
            String author;

            //���\�b�h StringBuilder��length�Ƃ�append�Ƃ�
            void printTitle(){
                //���\�b�h�ɂ̓I�u�W�F�N�g�ɑ΂��鏈����������Ă���
                System.out.println(this.title);//this�͏ȗ��\
            }
        }
        
        //1�ڂ̏����I�u�W�F�N�g    
        Book book1 = new Book();//Book�I�u�W�F�N�g��title�t�B�[���h�𐶐��Btitle�t�B�[���h�̃t�B�[���h�ϐ�
        book1.title = "Peopleware";//String�I�u�W�F�N�g��Peopleware�𐶐��B�����̓t�B�[���h�I�u�W�F�N�g
        book1.printTitle();//�I�u�W�F�N�g�ɏ������˗�������I�u�W�F�N�g�̏�Ԃ�m�邽�߂ɌĂяo��
        //���W�B�̏p���݂�����������Ɏ��̂�����B�T�O�I�ɐ��`���N���X�ɂ���̂͏p���Ɠ����A�p�����������烌�V�[�g�͎��̂ɂȂ�
        
        //2�ڂ̏����I�u�W�F�N�g
        Book book2 = new Book();
        book2.title = "Showstopper!";

        //
    }
}
