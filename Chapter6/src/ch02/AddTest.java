package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x, y)-> x+y; // return 이 있으면 {} 생략이 안됨.
		System.out.println( addL.add(2, 3));
	}

}
