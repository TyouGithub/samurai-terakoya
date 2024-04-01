package kadai_018;

public class katoHanako extends kato{
    public katoHanako() {
        setGivenName("花子");
        setAddress("東京都中野区・・です");
    }

    @Override
    public void hobby() {
        System.out.println("趣味は読書です");
    }
}

