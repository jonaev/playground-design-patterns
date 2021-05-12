package playground.fizzbuzz.patterns.builder.elements;

public class BuzzElement implements Element {

	public static Boolean shouldBeUsed(int i) {
		return i % 5 == 0;
	}

	@Override
	public String print() {
		return "Buzz";
	}
}
