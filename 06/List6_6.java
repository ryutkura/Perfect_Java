import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class List6_6 {
    public static void main(String[] args){

        int sum = 0;

         List<Integer> list = new ArrayList<>();//�R���N�V�����I�u�W�F�N�g����
        list.add(1);                    //�R���N�V�����I�u�W�F�N�g�ɗv�f�I�u�W�F�N�g��ǉ�
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(5);

        System.out.println("�g��for���̃p�^�[��");
        //�g��for�\�����g���p�^�[��
        for(Integer n: list){
            sum += n;
            System.out.println(sum);
        }
        
        //�C�e���[�^���g���p�^�[��
        // for(Iterator<Integer> it = list.iterator(); it.hasNext(); ){
            //     Integer n = it.next();
            //     sum += n;
            // }
            
        sum = 0;
        System.out.println("�C���f�b�N�X��for���̃p�^�[��");
        //�C���f�b�N�X��for���[�v���܂킷�p�^�[��
        for(int i = 0; i < list.size(); i++){
            Integer n = list.get(i);
            sum += n;
            System.out.println(sum);
        }

    }
}
