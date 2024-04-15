package kadai_015;

public class Car_Chapter15 {
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す

	public void gearChange(int afterGear) {
		switch (afterGear) {
		case 1 -> speed = 10;
		case 2 -> speed = 20;
		case 3 -> speed = 30;
		case 4 -> speed = 40;
		case 5 -> speed = 50;
		
		default -> speed = 10;
		}
	} //ギアの値により速度を変える
	
	public void run() {
		System.out.println("現在の時速は" + speed +"kmです");
	} //ギアチェンジ後の速度を表示する
}


