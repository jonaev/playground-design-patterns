package playground.fizzbuzz.patterns.builder.elements;

public class FancyBuzzElement extends BuzzElement{

	@Override
	public String print() {
		return super.print() + super.print();
	}
}
