package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {	
	
	public void wordCheck(String words[]) {
		
		HashMap<String, String> word = new HashMap<String, String>();
		
			word.put("apple","りんご");
			word.put("peache","桃");
			word.put("banana","バナナ");
			word.put("lemon","レモン");
			word.put("pear","梨");
			word.put("kiwi","キウィ");
			word.put("strawberry","いちご");
			word.put("grape","ぶどう");
			word.put("muscat","マスカット");
			word.put("cherry","さくらんぼ");

		for(int i = 0; i < words.length; i++) {
	
			if(word.containsKey(words[i])) {
				
				System.out.println(words[i] + "の意味は" + word.get(words[i]));
				
			}else {
				System.out.println(words[i] + "は辞書に存在しません");
			}
			
		}
		
	}
	
}
