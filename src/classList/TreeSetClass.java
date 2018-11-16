package classList;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetClass {

	public static void main(String[] args) {
		String tongueTwister = "I feel, a feel, a funny feel, a funny feel I feel, "
				+ "if you feel the feel I feel, I feel the feel you feel";

		Set<String> words = new TreeSet<>();

		for (String word : tongueTwister.split("\\W+")) {

			System.out.println(word);
			words.add(word);
		}
		System.out.println(words);
	}

}
