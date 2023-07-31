package random;

//Simplified Runlength Encoding
//Given an string of upper and lowercase letters (ex. tttfffeiiiakssd )
//Runlength Encoding would replace each character with the number of uninterrupted repetitions
//As follows tttfffeiiiakssd -> 3t3f1e3i1a1k2s1d


//write a function to do Runlength Decoding of a previously encoded string


public class RunlengthEncodingDemo {

	public static void main(String[] args) {

		System.out.println(decodeString("13t3f1e3i1a1k2s1d"));
		// Assert output is tttfffeiiiakssd
	}

	private static String decodeString(String encodedString) {

		StringBuilder decodedString = new StringBuilder();
		StringBuilder digitString = new StringBuilder();
		// tttfffeiiiakssd
		// 3t33f1e3i1a1k2s1d
		for (Character c : encodedString.toCharArray()) {
			if (Character.isDigit(c)) {
				digitString.append(c);
			} else {
				// we can assume it's a letter
				Integer number = Integer.parseInt(digitString.toString());
				for (int i = 0; i < number; i++) {
					decodedString.append(c);
				}
				digitString = new StringBuilder();
			}
		}
		return decodedString.toString();
		// 1. Iterate character by character over encoded string
		// 2. With each character determine Character.isDigit() or Character.isLetter().
		// 3. Iterate over digits until character is found. Stringbuilder the digits into a concatenated digit string.
		// 4. Convert digit string back into int
		// 5. Append int number of "that" letter to decodedString
	}
}


