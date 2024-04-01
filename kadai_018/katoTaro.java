package kadai_018;

public class katoTaro extends kato{
	public katoTaro() {
        setGivenName("太郎");
        setAddress("東京都中野区・・です");
    }

    @Override
    public void hobby() {
        System.out.println("Javaが得意です");
    }
}
