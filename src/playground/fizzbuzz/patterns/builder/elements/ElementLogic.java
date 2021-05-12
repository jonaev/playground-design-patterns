package playground.fizzbuzz.patterns.builder.elements;

public class ElementLogic {

	public static ElementType decide(int i) {
		if (i % 3 == 0 && i % 5 == 0)
			return ElementType.FIZZBUZZ;
		else if (i % 3 == 0)
			return ElementType.FIZZ;
		else if (i % 5 == 0)
			return ElementType.BUZZ;
		else
			return ElementType.STANDARD;
	}

}
