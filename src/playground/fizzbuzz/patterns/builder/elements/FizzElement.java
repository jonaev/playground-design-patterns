package playground.fizzbuzz.patterns.builder.elements;

public class FizzElement implements Element{

	public static Boolean shouldBeUsed(int i) {
		return i % 3 == 0;
	}

	@Override
	public String print() {
		return "Fizz";
	}
}
