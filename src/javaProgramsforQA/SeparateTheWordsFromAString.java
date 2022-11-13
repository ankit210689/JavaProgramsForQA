package javaProgramsforQA;

public class SeparateTheWordsFromAString {
	public static void separateWords(){
		String str="Java,Python,Selenium,TestNG";
		String words[]=str.split(",");
		for (int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

	public static void main(String[] args) {
		separateWords();

	}

}
