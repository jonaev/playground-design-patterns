package playground.fizzbuzz.patterns.builder.elements;

public class StandardElement implements Element {
	private final int i;

	public StandardElement(int i) {
		this.i = i;
	}

	@Override
	public String print() {
		return String.valueOf(i);
	}
}
