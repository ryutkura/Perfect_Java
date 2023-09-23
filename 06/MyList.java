import java.util.*;

public class MyList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();//コレクションオブジェクト生成
        list.add("one");                    //コレクションオブジェクトに要素オブジェクトを追加
        list.add("two");
        list.add("three");

        // ↓要素の型に基本型は指定できない intは基本型であってクラスではないから
        // List<int> List = new ArrayList<>();

        //よってクラスである数値ラッパー型は要素に指定できる
        List<Integer> list2 = new ArrayList<>();    //ok コレクション型や配列型も同様である

        //注釈にあった別解
        System.out.println(list);//[one, two, three]と出力される
        
        //全要素を順に表示するfor文
        for(String s : list){
            System.out.println(s);
        }
    }    
}
