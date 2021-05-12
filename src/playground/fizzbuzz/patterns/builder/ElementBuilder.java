package playground.fizzbuzz.patterns.builder;

import playground.fizzbuzz.patterns.builder.af.AbstractElementFactory;
import playground.fizzbuzz.patterns.builder.elements.Element;

/**
 * Builder pattern implementation
 */
public interface ElementBuilder {

	ElementBuilder withFactory(AbstractElementFactory factory);
	ElementBuilder with(int i);
	Element build();
}
