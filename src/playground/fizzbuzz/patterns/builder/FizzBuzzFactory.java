package playground.fizzbuzz.patterns.builder;

import playground.fizzbuzz.patterns.builder.elements.BuzzElement;
import playground.fizzbuzz.patterns.builder.elements.Element;
import playground.fizzbuzz.patterns.builder.elements.FizzBuzzElement;
import playground.fizzbuzz.patterns.builder.elements.FizzElement;
import playground.fizzbuzz.patterns.builder.elements.StandardElement;

public class FizzBuzzFactory implements ElementFactory{


	@Override
	public Element create(int i) {
		if (FizzBuzzElement.shouldBeUsed(i))
			return new FizzBuzzElement();
		else if (FizzElement.shouldBeUsed(i))
			return new FizzElement();
		else if (BuzzElement.shouldBeUsed(i))
			return new BuzzElement();
		else return new StandardElement(i);
	}
}
