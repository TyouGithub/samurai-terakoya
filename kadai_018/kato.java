package kadai_018;

public  abstract class kato {
	//苗字の初期化
	public String familyName = "加藤";
	public String givenName;
	public String address;
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void name() {
		System.out.println("名前は"+	this.familyName+this.givenName+"です");
		
	}
	
	public void address(){
		System.out.println("住所は"+	this.address+"です");
		}
	
	public abstract void  hobby() ;

}
