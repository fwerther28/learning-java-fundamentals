package theory_concepts.lambda.function.util;

import java.util.function.Function;

import theory_concepts.lambda.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

	@Override
	public String apply(Product p) {
		return p.getName().toUpperCase();
	}
}
