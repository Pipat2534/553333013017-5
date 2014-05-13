package ArrayLisyPQ;

import java.util.Arrays;

public class ClassTest {

	public static void main(String[] args) {
		Car[] CarArrays = new Car[] {
				new Car("TOYOTA","รถสิบล้อ",1500000),
				new Car("ISUZU","รถตู้",500000)};
				Arrays.sort(CarArrays);
				System.out.println(Arrays.toString(CarArrays));

	}
}