package classList;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public HashMapClass() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<String, String> misspeltWords = new HashMap<String, String>();
		 
		 misspeltWords.put("calender", "calendar");
		 misspeltWords.put("tomatos", "tomatoes");
		 misspeltWords.put("existance", "existence");
		 misspeltWords.put("aquaintance", "acquaintance");
		 
		 String sentence = "Buy a calender for the year 2013";
		 
		 System.out.println("The given sentence is: " + sentence);
		 
		 for (String word : sentence.split("\\W+")) {
			 if (misspeltWords.containsKey(word)) {
				 System.out.println("The correct spelling for " + word +" is " + misspeltWords.get(word));
			 }
		 }
	}

}
