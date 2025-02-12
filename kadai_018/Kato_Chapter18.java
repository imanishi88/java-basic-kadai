package kadai_018;

abstract public class Kato_Chapter18 {
	
	public String familyName = "加藤"; // 姓
	public String givenName;   // 名
	public String address = "東京都中野区●×";    //住所
	
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	//共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
    abstract public void eachIntroduce(); //個別の紹介を出力する
	
    public void exechIntroduce() { //紹介を実行する
		this.eachIntroduce();
		
	}
}