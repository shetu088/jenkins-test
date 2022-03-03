package practice;

public class occurenceofagivencharacter {

	public static void main(String[] args) {
		String s = " My name is Shreshtha Singhal";
		char c = 'a';
		int count = s.length() - s.replace("a", "").length();
		System.out.println("The occurence of a in the string " +s+  " is "  +count);

	}

}
