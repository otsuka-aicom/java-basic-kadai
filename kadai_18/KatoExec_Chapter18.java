package kadai_018;

public class KatoExec_Chapter18 {
	
	   public static void main(String[] args) {

		      
		      Kato_Chapter18 taro = new KatoTaro_Chapter18();
		      
		      Kato_Chapter18 ichiro = new KatoIchiro_Chapter18();

		      Kato_Chapter18 hanako = new KatoHanako_Chapter18();
	
			  String familyName = taro.getFamilyName();
			  String address = taro.getAddress();
			  
			  taro.setGivenName("太郎");
			  ichiro.setGivenName("一郎");
			  hanako.setGivenName("花子");
			  			 
		      taro.commonIntroduce(familyName, taro.givenName);
		      taro.execIntroduce(address);
		      taro.eachIntroduce();

		      System.out.println("\n");
		      
		      ichiro.commonIntroduce(familyName, ichiro.givenName);
		      ichiro.execIntroduce(address);
		      ichiro.eachIntroduce();
		      
		      System.out.println("\n");
		      
		      hanako.commonIntroduce(familyName, hanako.givenName);
		      hanako.execIntroduce(address);
		      hanako.eachIntroduce();
		      
		      

		      
	 }
}
