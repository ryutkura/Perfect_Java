public class Seisu {
        public static void main(String args[]){
            int n;
            //10�i��
            n = 255;
            System.out.println(n);
            //16�i��
            n = 0xff;
            System.out.println(n);
            //16�i���̕��̐�
            n = -0xff;
            System.out.println(n);
            //a����f�܂ł̕����͑啶���ł��ǂ��i�������̕�����ʓI�j
            n = 0xFF;
            System.out.println(n);
            //0x�̑����0X�ł��ǂ��i0x�̕�����ʓI�j
            n = 0XFF;
            System.out.println(n);
            //8�i��
            n = 0377;
            System.out.println(n);
            //8�i���̕��̐�
            n = -0377;
            System.out.println(n);
            //2�i��
            n = 0b11111111;
            System.out.println(n);
            //_��2�i���œ��ɗL��
            n = 0b1111_1111;
        }
}
