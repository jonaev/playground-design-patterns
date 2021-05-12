package playground.fizzbuzz.patterns.builder.elements;

public class FizzBuzzElement implements Element{

	public static Boolean shouldBeUsed(int i) {
		return i % 3 == 0 && i % 5 == 0;

	}
	@Override
	public String print() {
		return "Fizzbuzz";
	}
}
