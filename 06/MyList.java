import java.util.*;

public class MyList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();//�R���N�V�����I�u�W�F�N�g����
        list.add("one");
        list.add("two");
        list.add("three");

        //�S�v�f�����ɕ\������for��
        for(String s : list){
            System.out.println(s);
        }
    }    
}
