import java.util.HashMap;
import java.util.Map;

public class Dictionary_Chapter21 {
        HashMap<String, String> fruits = new HashMap<>();

    // コンストラクタ
    public Dictionary_Chapter21() {
        fruits.put("apple", "りんご");
        fruits.put("peach", "桃");
        fruits.put("banana", "バナナ");
        fruits.put("lemon", "レモン");
        fruits.put("pear", "梨");
        fruits.put("kiwi", "キウィ");
        fruits.put("strawberry", "いちご");
        fruits.put("grape", "ぶどう");
        fruits.put("muscat", "マスカット");
        fruits.put("cherry", "さくらんぼ");
    }
    public void dictionaryNum(String name) {
        if(fruits.get(name) != null)
            System.out.println(name + "の意味は" + fruits.get(name));
        else
            System.out.println(name + "は辞書に存在しません");
    }

}
