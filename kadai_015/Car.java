package kadai_015;

public class Car{

	private int gear;
	private int speed;


	public Car() {
		// デフォルトのギアを1に設定
		this.gear = 1;
		// デフォルトの速度を10に設定
		this.speed = 10;
	}

	public Car(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void gearChange(int gear) {
		System.out.println("ギア" + this.gear + "から" + gear + "に替えました");
		switch(gear) {
		case 1: this.speed = 10; break;
		case 2: this.speed = 20; break;
		case 3: this.speed = 30; break;
		case 4: this.speed = 40; break;
		case 5: this.speed = 50; break;
		default: this.speed = 0;
		}
		this.gear = gear; // ギアを変更
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "㎞です");
	}


	public void gearChange(int gear, int speed) {
		System.out.println("ギア" + this.gear +"から" + gear +"に切り替えました");
		this.gear = gear;



	}




}


