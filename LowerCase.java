public class LowerCase {
    public static void main(String[] args) {		
        String str = args[0];
        System.out.println(lowerCase(str));
    }
	
    public static String lowerCase(String s) {
       // String a = "" + (char) (s.charAt(0) + 32);
		String a = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if ((c >= 'A') && (c <= 'Z')) {
				a += (char) (c + 32);

			} else {
				a += c;
			}
		}

        return a;
    }
}