package playground.fizzbuzz.patterns.builder.elements;

public class FancyFizzBuzzElement extends FizzBuzzElement{

	@Override
	public String print() {
		return super.print() + super.print();
	}
}
