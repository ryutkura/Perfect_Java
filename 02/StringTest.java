public class StringTest {
    public static void main(String[] args){
        if(args.length < 1){
            System.err.println("�����Ƀ��[����From�w�b�_���w�肵�Ă�������");
            System.exit(-1);    /*�v���O������r���ŏI������ȈՃR�[�h */
        }
        String input = args[0]; /*�R�}���h���C��������1�Ԗڂ��擾 */
        int begin = input.indexOf('<');
        if(begin >= 0){
            begin++;
            int end = input.indexOf('<');
            if(end > begin){
                String addr = input.substring(begin, end);
                System.out.println(addr);
            }
        }
    }
}
