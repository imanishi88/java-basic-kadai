//車クラス
package kadai_15;

class Car_Chapter15 {

	private int gear = 1; //ギア
	private int speed = 10;//スピード
	
	public Car_Chapter15( int gear, int speed ) {
		this.gear  = gear;
		this.speed = speed;
		
	}
	
	//ギア変更のメソッド
	public void gearChange( int afterGear ) {
		System.out.println("ギア" + this.gear +  "から" + afterGear + "に切り替えられました");
		
		this.gear = afterGear;
	
				switch(this.gear) {
			case 1 -> this.speed = 10;
			case 2 -> this.speed = 20;
			case 3 -> this.speed = 30;
			case 4 -> this.speed = 40;
			case 5 -> this.speed = 50;
			default ->this.speed = 10;
		
	}
}

	//車を走行させるメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
