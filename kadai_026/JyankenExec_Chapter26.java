package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		
		//じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();
		
		String inputMy = jyanken.getMyChoice();
		
		String inputYour = jyanken.getRandom();
		
		jyanken.playGame(inputMy, inputYour);

	}
	
}