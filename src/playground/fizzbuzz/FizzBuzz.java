package playground.fizzbuzz;

import playground.fizzbuzz.patterns.builder.ElementBuilder;
import playground.fizzbuzz.patterns.builder.ElementFactory;
import playground.fizzbuzz.patterns.builder.FizzBuzzBuilder;
import playground.fizzbuzz.patterns.builder.FizzBuzzFactory;
import playground.fizzbuzz.patterns.builder.af.FancyElementFactory;
import playground.fizzbuzz.patterns.builder.elements.Element;

/**
 * multiplies of 3 => Fizz
 * multipies of 5 => Buzz
 * multipites of 3 and 5 => FizzBuzz
 */
public class FizzBuzz {

//	public static void main(String[] args) {
//		ElementBuilder elementBuilder = new FizzBuzzBuilder();
//		for (int i = 1; i < 20; i++) {
//			Element element = elementBuilder.with(i).build();
//			System.out.println(element.print());
//		}
//	}

//	public static void main(String[] args) {
//		ElementFactory factory = new FizzBuzzFactory();
//		for (int i = 1; i < 20; i++) {
//			Element element = factory.create(i);
//			System.out.println(element.print());
//		}
//	}

	public static void main(String[] args) {
		ElementBuilder elementBuilder = new FizzBuzzBuilder();
		for (int i = 1; i < 20; i++) {
			Element element = elementBuilder
					.with(i)
					.withFactory(new FancyElementFactory())
					.build();
			System.out.println(element.print());
		}
	}
}
