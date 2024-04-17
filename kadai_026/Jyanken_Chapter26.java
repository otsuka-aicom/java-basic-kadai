package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	//Scannerクラスのオブジェクトの生成
	Scanner scanner = new Scanner(System.in);
	
	//自分のじゃんけんの手を入力するメソッド
	public String getMyChoice() {
		
		//入力を促す文の表示
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう\t");	


		
		//正しいじゃんけんの手であるか判定
		while(true) {
		
			//じゃんけんの手を入力
			String inputMy = scanner.nextLine();
			
			if(inputMy.equals("r") || inputMy.equals("s") || inputMy.equals("p")) {
				return inputMy;
			}else {
				System.out.println("正しい手ではありません。もう一度入力してください\t");
				
				//無効な入力の場合、ループの最初に戻る
				continue;
			}
				      
		}


	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		HashMap<Integer, String> inputYour = new HashMap<Integer, String>();
		
		inputYour.put(1, "r");
		inputYour.put(2, "s");
		inputYour.put(3, "p");
		
		int count = (int)Math.floor(Math.random() * 3 + 1);
		
		return inputYour.get(count);
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String inputMy, String inputYour) {
		HashMap<String, String> hand = new HashMap<String, String>();
		
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		System.out.println("自分の手は" + hand.get(inputMy) + ",対戦相手の手は" + hand.get(inputYour));
		
		if (inputMy.equals("r") && inputYour.equals("r") || inputMy.equals("s") && inputYour.equals("s") || inputMy.equals("p") && inputYour.equals("p") ) {
			
			 System.out.println("あいこです");
			 
		}else if (inputMy.equals("r") && inputYour.equals("s") || inputMy.equals("s") && inputYour.equals("p") || inputMy.equals("p") && inputYour.equals("r") ) {
			
			System.out.println("自分の勝ちです");
			
		}else {
			
			System.out.println("自分の負けです");
			
		}

	}

}

