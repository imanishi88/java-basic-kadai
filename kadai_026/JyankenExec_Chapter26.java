package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
		
		Jyanken_Chapter26 jyanken = new Jyanken_Chapter26();//インスタンス作成
		//自分のじゃんけんの手を入力
		String userHand = jyanken.getMyChoice();
		String pcHand = jyanken.getRandom();
	
		
		jyanken.playGame(userHand,pcHand);
		
		
	}
}