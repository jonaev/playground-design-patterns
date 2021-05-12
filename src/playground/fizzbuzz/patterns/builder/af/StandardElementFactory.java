package playground.fizzbuzz.patterns.builder.af;

import playground.fizzbuzz.patterns.builder.elements.BuzzElement;
import playground.fizzbuzz.patterns.builder.elements.Element;
import playground.fizzbuzz.patterns.builder.elements.FizzBuzzElement;
import playground.fizzbuzz.patterns.builder.elements.FizzElement;
import playground.fizzbuzz.patterns.builder.elements.StandardElement;

public class StandardElementFactory extends AbstractElementFactory{

	@Override
	protected Element createFizz() {
		return new FizzElement();
	}

	@Override
	protected Element createBuzz() {
		return new BuzzElement();
	}

	@Override
	protected Element createFizzBuzz() {
		return new FizzBuzzElement();
	}

	@Override
	protected Element createNormalElement(int i) {
		return new StandardElement(i);
	}
}
