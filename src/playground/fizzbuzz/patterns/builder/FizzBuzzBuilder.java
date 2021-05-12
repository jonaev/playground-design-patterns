package playground.fizzbuzz.patterns.builder;

import playground.fizzbuzz.patterns.builder.af.AbstractElementFactory;
import playground.fizzbuzz.patterns.builder.elements.BuzzElement;
import playground.fizzbuzz.patterns.builder.elements.Element;
import playground.fizzbuzz.patterns.builder.elements.ElementLogic;
import playground.fizzbuzz.patterns.builder.elements.ElementType;
import playground.fizzbuzz.patterns.builder.elements.FizzBuzzElement;
import playground.fizzbuzz.patterns.builder.elements.FizzElement;

public class FizzBuzzBuilder implements ElementBuilder {

	private int i;
	private AbstractElementFactory factory;

	@Override
	public ElementBuilder withFactory(AbstractElementFactory factory) {
		this.factory = factory;
		return this;
	}

	@Override
	public ElementBuilder with(int i) {
		this.i = i;
		return this;
	}

	@Override
	public Element build() {
		return factory.createElement(ElementLogic.decide(i), i);
	}
}
