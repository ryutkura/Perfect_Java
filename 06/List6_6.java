import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class List6_6 {
    public static void main(String[] args){

        int sum = 0;

         List<Integer> list = new ArrayList<>();//コレクションオブジェクト生成
        list.add(1);                    //コレクションオブジェクトに要素オブジェクトを追加
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(5);

        System.out.println("拡張for文のパターン");
        //拡張for構文を使うパターン
        for(Integer n: list){
            sum += n;
            System.out.println(sum);
        }
        
        //イテレータを使うパターン
        // for(Iterator<Integer> it = list.iterator(); it.hasNext(); ){
            //     Integer n = it.next();
            //     sum += n;
            // }
            
        sum = 0;
        System.out.println("インデックスでfor文のパターン");
        //インデックスでforループをまわすパターン
        for(int i = 0; i < list.size(); i++){
            Integer n = list.get(i);
            sum += n;
            System.out.println(sum);
        }

    }
}
