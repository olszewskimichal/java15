package patternmatching;

public class PatternMatchingPreview {
	public static void main(String[] args) {
		println("dupa");
	}

	static void println(Object obj) {
		if (obj instanceof String s) {
			System.out.println(s);
		}
	}
}
