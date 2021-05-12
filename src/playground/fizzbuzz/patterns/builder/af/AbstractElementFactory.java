package playground.fizzbuzz.patterns.builder.af;

import playground.fizzbuzz.patterns.builder.elements.Element;
import playground.fizzbuzz.patterns.builder.elements.ElementType;

/**
 * Abstract factory implementation
 */
public abstract class AbstractElementFactory {

	public Element createElement(ElementType elementType, int i) {
		switch (elementType) {
			case FIZZBUZZ: return createFizzBuzz();
			case BUZZ: return createBuzz();
			case FIZZ: return createFizz();
			default: return createNormalElement(i);
		}
	}
	protected abstract Element createFizz();
	protected abstract Element createBuzz();
	protected abstract Element createFizzBuzz();
	protected abstract Element createNormalElement(int i);
}
