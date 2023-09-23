import java.util.*;

public class MyList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();//コレクションオブジェクト生成
        list.add("one");
        list.add("two");
        list.add("three");

        //全要素を順に表示するfor文
        for(String s : list){
            System.out.println(s);
        }
    }    
}
