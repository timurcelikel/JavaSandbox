package sandbox;

import java.util.Optional;

public class OptionalsSandbox {

	public static void main(String[] args) {

		String email = null;
		Optional<Object> emptyOptional = Optional.empty();
		System.out.println(emptyOptional);

		// of() should only be used for values you know to be non-null. The below would throw an NPE
		//Optional<String> emailOptional = Optional.of(email);
		//System.out.println(emailOptional);

		// ofNullable() - Under the hood this checks if the value is null and returns an empty Optional, or it returns an Optional initialized with
		// the value
		Optional<String> stringOptional = Optional.ofNullable(email);
		System.out.println(stringOptional);
		//System.out.println(stringOptional.get());        // This would throw a No value present error

		// isPresent()
		if (stringOptional.isPresent()) {
			System.out.println("Value is present");
		}

		// orElse()
		String defaultOptional = stringOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional); // default@gmail.com

		// orElseGet()
		String defaultOptional2 = stringOptional.orElseGet(() -> "default@gmail.com");
		System.out.println(defaultOptional2); // default@gmail.com

		// orElseThrow() - Below will throw an error if email is null
		// String defaultOptional3 = stringOptional.orElseThrow(() -> new IllegalArgumentException("Email is null"));
		// System.out.println(defaultOptional3);

		String emailNonNull = "bob@me.com";
		Optional<String> emailOptional = Optional.ofNullable(emailNonNull);
		System.out.println(emailOptional);       // Optional[bob@me.com]
		System.out.println(emailOptional.get()); // bob@me.com

		String defaultOptional4 = emailOptional.orElse("default@gmail.com");
		System.out.println(defaultOptional4);        // bob@me.com

		// ifPresent()
		Optional<String> gender = Optional.of("Male");
		Optional<String> emptyOptional2 = Optional.empty();
		gender.ifPresent(s -> System.out.println("value is present"));                // prints the text
		emptyOptional2.ifPresent(s -> System.out.println("no value is present"));     // does not print the text

		// filter()
		String result = "abc";

		// old way
		if (result != null && result.contains("abc")) {
			System.out.println(result);
		}

		// new way
		Optional<String> optionalStr = Optional.of(result);
		optionalStr.filter(res -> res.contains("abc")).ifPresent(res -> System.out.println(res));

		// map()
		String result2 = " abc ";
		Optional<String> optionalStr2 = Optional.of(result);
		optionalStr2.filter(res -> res.contains("abc")).map(String::trim).ifPresent(res -> System.out.println(res));
	}

}
