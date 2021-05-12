package playground.fizzbuzz.patterns.builder.elements;

public class FancyStandardElement extends StandardElement {

	public FancyStandardElement(int i) {
		super(i);
	}

	@Override
	public String print() {
		return super.print() + "!";
	}
}
