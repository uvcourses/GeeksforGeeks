import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NumberWords {

	public String getWords(String paragraph, String Banned[]) {

		Set<String> ban = new HashSet<String>();
		StringBuilder str = new StringBuilder();
		Map<String, Integer> words = new HashMap();
		String finalString = "";
		int FreqCont = 0;
		String result = "";
		for (String bann : Banned)
			ban.add(bann);

		for (char c : paragraph.toCharArray()) {

			if (Character.isLetter(c)) {
				str.append(Character.toLowerCase(c));
			}

			else if (str.length() > 0) {
				finalString = str.toString();
				if (!ban.contains(finalString)) {

					words.put(finalString, words.getOrDefault(finalString, 0) + 1);
					if (words.get(finalString) > FreqCont) {
						result = finalString;
						FreqCont = words.get(finalString);
					}
				}
				str=new StringBuilder();
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberWords n = new NumberWords();
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String banned[] = { "hit" };
		System.out.println(n.getWords(paragraph, banned));
	}

}
