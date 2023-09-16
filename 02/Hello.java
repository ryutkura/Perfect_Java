public class Hello {
    public static void main(String[] args) {
        System.out.println(args[0]);
        //System.out.println(args[1]);

        if(args.length < 1){
            System.err.println("少ないよ");
            System.exit(-1);    /*プログラムを途中で終了する簡易コード */
        }
        else{
            System.out.println("多いね");
        }
    }
}
