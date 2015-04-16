import java.util.Random;


public class RandomSentence {

	//private String [] article, noun, verb, preposition;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RandomSentence();
	}

	public RandomSentence(){
		String [] article = {"the", "a", "one", "some", "any"};
		String [] noun = {"boy", "girl", "town", "car", "dog"};
		String [] verbs = {"drove", "jumpbed", "run", "walked", "skipped"};
		String [] preposition = {"to", "from", "over","under", "on"};
		
		Random r = new Random();
		
		for(int i=1; i<=20; i++){
			String sentence = String.format("%s %s %s %s %s %s.",
					article[r.nextInt(5)], noun[r.nextInt(5)], verbs[r.nextInt(5)],preposition[r.nextInt(5)],
					article[r.nextInt(5)],noun[r.nextInt(5)]);
			//sentence = sentence.replace(sentence.charAt(0), (sentence.substring(0,1)).toUpperCase().charAt(0));
			sentence = sentence.replaceFirst("^[a-z]", (sentence.substring(0,1)).toUpperCase());
			System.out.printf("%s\n", sentence);
				
		
		}
	}
}
