package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {
    // 名をセット
    public void setGivenName() {
        this.givenName = "一郎";
    }

    // 個別紹介
    @Override
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
