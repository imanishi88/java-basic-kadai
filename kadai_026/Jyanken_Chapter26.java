package kadai_026;

import java.util.HashMap;
import java.util.Scanner;


public class Jyanken_Chapter26 {
	
	public String getMyChoice() {//自分のじゃんけんの手を入力
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String rock = "r";
			String scissors = "s";
			String paper = "p";
			
			String input = scanner.next();
		
			//正しいじゃんけんの手であるか判定

		    if (rock.equals(input) || scissors.equals(input) || paper.equals(input)) {
		    	
		    	  //じゃんけんクラスを実行するクラスに自分の手をかえす
		    	  return input;
		    } else {
		    	  System.out.println("入力が正しくありません");
		    }
		}
}

		//エラーを出力し、再度自分のじゃんけんの手を選ぶ
		//自分のじゃんけんの手を入力


	public String getRandom() { //対戦相手のじゃんけんの手を乱数で選ぶ
		 //配列にじゃんけんの手をセット
		String[] challenger = {"r","s","p"};
		
		         //乱数の範囲で指定した3までの数値を四捨五入して出力する
		         int random = (int)(Math.floor(Math.random() * 3));
		         //乱数で対戦相手の手を選ぶ
		         //じゃんけんクラスを実行するクラスに対戦相手の手を返す
				return challenger[random];
		      }
	

		

	
		
	public void playGame(String userHand, String pcHand) {//じゃんけんを行う
		//自分と対戦相手の手を出力する(HashMap)

		HashMap<String,String> hand = new HashMap<String, String>();{
		
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		
		
		System.out.println("自分の手は" + hand.get(userHand) + "対戦相手の手は," + hand.get(pcHand));
		
		 



				//自分と対戦相手の手を比較する
		if (userHand.equals(pcHand)) {
			System.out.println("あいこです");
		}
		else if ((userHand.equals("r") && pcHand.equals("s")) ||(userHand.equals("s") && pcHand.equals("p"))
				|| (userHand.equals("p") && pcHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		}
		else {
			System.out.println("自分の負けです");
		}
		}
	}
}

		//じゃんけんの結果を出力する
