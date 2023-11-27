package MyTest1;

public class MyProgram {

	public static void main(String[] args) {

		Car myCar1 = new Car();		
		myCar1.a = 100;
		DataCollection input = new DataCollection();
		input.x = 100;
		myCar1.calAdd(input);
		System.out.println(input.x);
		
		
		
	}

}
