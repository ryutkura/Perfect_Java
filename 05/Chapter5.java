public class Chapter5 {


    public static void main(String[] args){
        //�����N���X�̒�`�}
        class Book{
        //2�̃t�B�[���h�������Ă���
        String title;//���ꂼ��Ɨ������l���Z�b�g�ł���
        String author;
        }
        
        //1�ڂ̏����I�u�W�F�N�g    
        Book book1 = new Book();//Book�I�u�W�F�N�g��title�t�B�[���h�𐶐��Btitle�t�B�[���h�̃t�B�[���h�ϐ�
        book1.title = "Peopleware";//String�I�u�W�F�N�g��Peopleware�𐶐��B�����̓t�B�[���h�I�u�W�F�N�g
        
        //2�ڂ̏����I�u�W�F�N�g
        Book book2 = new Book();
        book2.title = "Showstopper!";

        System.out.println("����͌������ŏ������R�[�h�ł��B\n���ꂪ����������킴�킴PC�����������Ȃ��Ă�\n�t�@�C���Ǘ����ł���̂Ō������i�݂܂�");
        System.out.println("����main�u�����`�ɂč�ƒ��ł��B");
    }
}
