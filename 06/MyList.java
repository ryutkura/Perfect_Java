import java.util.*;

public class MyList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();//�R���N�V�����I�u�W�F�N�g����
        list.add("one");                    //�R���N�V�����I�u�W�F�N�g�ɗv�f�I�u�W�F�N�g��ǉ�
        list.add("two");
        list.add("three");

        // ���v�f�̌^�Ɋ�{�^�͎w��ł��Ȃ� int�͊�{�^�ł����ăN���X�ł͂Ȃ�����
        // List<int> List = new ArrayList<>();

        //����ăN���X�ł��鐔�l���b�p�[�^�͗v�f�Ɏw��ł���
        List<Integer> list2 = new ArrayList<>();    //ok �R���N�V�����^��z��^�����l�ł���

        //���߂ɂ������ʉ�
        System.out.println(list);//[one, two, three]�Əo�͂����
        
        //�S�v�f�����ɕ\������for��
        for(String s : list){
            System.out.println(s);
        }
    }    
}
