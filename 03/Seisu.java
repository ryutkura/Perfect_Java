public class Seisu {
        public static void main(String args[]){
            int n;
            //10進数
            n = 255;
            System.out.println(n);
            //16進数
            n = 0xff;
            System.out.println(n);
            //16進数の負の数
            n = -0xff;
            System.out.println(n);
            //aからfまでの文字は大文字でも良い（小文字の方が一般的）
            n = 0xFF;
            System.out.println(n);
            //0xの代わりに0Xでも良い（0xの方が一般的）
            n = 0XFF;
            System.out.println(n);
            //8進数
            n = 0377;
            System.out.println(n);
            //8進数の負の数
            n = -0377;
            System.out.println(n);
            //2進数
            n = 0b11111111;
            System.out.println(n);
            //_は2進数で特に有効
            n = 0b1111_1111;
        }
}
