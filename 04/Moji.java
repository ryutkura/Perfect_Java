import java.util.Optional;

public class Moji {
    public static void main(String[] args){
        // //Optional<StringBuilder> osbを仮定
        // Optional<StringBuilder> osb = Optional.of(sb);

        final StringBuilder sb = new StringBuilder("012");
        // sb = new StringBuilder("345");←これをしてしまうと再代入でコンパイルエラーを起こす
        sb.append("345");//一方これは特にエラーにならない。参照先のStringBuilderオブジェクトの文字列は変更できる
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
        // System.out.println(j);　これはスコープ外なのでコンパイルエラーを招く

        
        // //くるんだオブジェクトの単純な取り出し
        // StringBuilder sb = osb.get();
    }
}
