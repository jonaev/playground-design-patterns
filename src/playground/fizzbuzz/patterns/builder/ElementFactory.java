package playground.fizzbuzz.patterns.builder;

import playground.fizzbuzz.patterns.builder.elements.Element;

/**
 * Factory pattern implementation
 */
public interface ElementFactory {
	Element create(int i);
}
