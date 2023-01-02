
public class Palindrome2552 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "2552";
		String s2 = "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2+=s1.charAt(i);
		}
		
		if (s1==s2){
			System.out.println("2552 is a palindrome");
		}
		else {
			System.out.println("2552 is not a palindrome");
		}
	}

}
