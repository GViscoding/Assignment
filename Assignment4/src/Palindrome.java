
public class Palindrome {

	public static void check(String s1) {
		String s2 = "";
		int len = s1.length();
		
		for(int i=len-1; i>=0; i--)
			s2 += s1.charAt(i);
		
		if(s2.equals(s1))
			System.out.println("String is a Plaindrome");
		else
			System.out.println("String is not a Plaindrome");
	}
	public static void main(String[] args) {
		String palin = "2552";
		
		check(palin);
	}

}
