package playground.fizzbuzz.patterns.builder.elements;

public class FancyFizzElement extends FizzElement{

	@Override
	public String print() {
		return super.print() + super.print();
	}
}
