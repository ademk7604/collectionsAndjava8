package d30_OptionalClass;

import java.util.Optional;

public class Driver2IllegalArgumentException {

	public static void main(String[] args) {
		Motor motor = new Motor(1600);
		//Motor motor = null;
		Car car = new Car("X Marka", "Y Model", Optional.ofNullable(motor));
		System.out.println(car);
	}
	
}
