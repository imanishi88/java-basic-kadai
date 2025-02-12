package kadai_021;

public class DictionaryExec_Chapter {
	public static void main(String[] args) {
		
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		String[] fruit = { "apple", "banana", "grape", "orange" };
		
		for (String word : fruit) {
			String meaning = dictionary.getMeaning(word);
			if (meaning != null) {
				System.out.println(word + "の意味は" + meaning );
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}
}

