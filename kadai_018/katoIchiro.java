package kadai_018;

public class katoIchiro extends kato{
	public katoIchiro() {
        setGivenName("一郎");
        setAddress("東京都中野区・・です");
    }

    @Override
    public void hobby() {
        System.out.println("好きな食べ物はリンゴです");
    }
}
