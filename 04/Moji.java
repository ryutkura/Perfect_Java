import java.util.Optional;

public class Moji {
    public static void main(String[] args){
        // //Optional<StringBuilder> osb������
        // Optional<StringBuilder> osb = Optional.of(sb);

        final StringBuilder sb = new StringBuilder("012");
        // sb = new StringBuilder("345");����������Ă��܂��ƍđ���ŃR���p�C���G���[���N����
        sb.append("345");//�������͓��ɃG���[�ɂȂ�Ȃ��B�Q�Ɛ��StringBuilder�I�u�W�F�N�g�̕�����͕ύX�ł���
        System.out.println(sb);

        int i = 0;
        for(i=0;i<5;i++){
            i += 0;
            System.out.println(i);
        }
        System.out.println(i);
        // for(int j=0;j<5;j++){
        //     j +=2;
        //     System.out.println(j);
        // }
        // System.out.println(j);�@����̓X�R�[�v�O�Ȃ̂ŃR���p�C���G���[������

        
        // //����񂾃I�u�W�F�N�g�̒P���Ȏ��o��
        // StringBuilder sb = osb.get();
    }
}
