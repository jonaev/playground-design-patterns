package playground.fizzbuzz.patterns.builder.af;

import playground.fizzbuzz.patterns.builder.elements.Element;
import playground.fizzbuzz.patterns.builder.elements.FancyBuzzElement;
import playground.fizzbuzz.patterns.builder.elements.FancyFizzBuzzElement;
import playground.fizzbuzz.patterns.builder.elements.FancyFizzElement;
import playground.fizzbuzz.patterns.builder.elements.FancyStandardElement;

public class FancyElementFactory extends AbstractElementFactory{
	@Override
	protected Element createFizz() {
		return new FancyFizzElement();
	}

	@Override
	protected Element createBuzz() {
		return new FancyBuzzElement();
	}

	@Override
	protected Element createFizzBuzz() {
		return new FancyFizzBuzzElement();
	}

	@Override
	protected Element createNormalElement(int i) {
		return new FancyStandardElement(i);
	}
}
