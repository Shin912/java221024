package Day11;

public class ClassUpCastinEx01 {

	public static void main(String[] args) {
		/* 자식 클래스인 KiaCar 객체를 부모 클래스인 Car 객체에 저장 : 업캐스팅
		 * 업캐스팅은 자동으로 동작*/
		//Car car = new KiaCar(4, "K5", 0x00ff00, "123허1234");
		//car.print();
		
		Car [] carList = new Car[5];
		carList[0] = new KiaCar(4, "K5", 0x00ff00, "123허1234");
		carList[1] = new HyundaiCar(4, "쏘나타", 0xff0000, "456가1234");
	}

}
