public class Hello {
    public static void main(String[] args) {
        System.out.println(args[0]);
        //System.out.println(args[1]);

        if(args.length < 1){
            System.err.println("���Ȃ���");
            System.exit(-1);    /*�v���O������r���ŏI������ȈՃR�[�h */
        }
        else{
            System.out.println("������");
        }
    }
}
