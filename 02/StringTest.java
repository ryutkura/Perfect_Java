public class StringTest {
    public static void main(String[] args){
        if(args.length < 1){
            System.err.println("引数にメールのFromヘッダを指定してください");
            System.exit(-1);    /*プログラムを途中で終了する簡易コード */
        }
        String input = args[0]; /*コマンドライン引数の1番目を取得 */
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
