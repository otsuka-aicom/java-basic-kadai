package kadai_018;

abstract public class Kato_Chapter18 {
	private String familyName = "加藤"; //姓を表す
	public String givenName; //名を表す
	public String address = "住所は東京都中野区〇×です"; //住所を表す
	
	public void commonIntroduce(String familynName, String givenName) {
		System.out.println("名前は" + (familynName + givenName) + "です");
	} //共通の紹介を出力する		
	
	abstract public void eachIntroduce(); //個別の紹介を出力する
	
	public void execIntroduce(String adress) {
		System.out.println("住所は" + address + "です");
	} //紹介を実行する

	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	
	public String getFamilyName() {
		return this.familyName ;
	}
	
	public String getAddress() {
		return this.address ;
	}
}
