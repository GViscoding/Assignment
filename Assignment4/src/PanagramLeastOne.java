
public class PanagramLeastOne {

	public static String removeSpace(String s) {
		String ss = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				ss += s.charAt(i);
			}
		}
		return ss;
	}
	
	public static void main(String[] args) {
		
		String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		
		s1 = removeSpace(s1);
		System.out.println(s1);
		
		//converting the given String to character Array.
		char ch[] = s1.toCharArray();
		
		//creating a new character array for further use.
		char ch1[] = new char[27];
		
		//using for Loop keeping those characters at their respective positions.
		for(int i=0;i<ch.length;i++) {
			int temp = 0;
			temp = ch[i] - 65;
			ch1[temp]++;	
		}
		
		
		boolean flag=false;
		
		//Checking weather ch1 contains all the character's indexes or not.  
		for(int i=0;i<ch1.length-1;i++) {
			if (ch1[i] == 0) {
				flag = true;
			}
			else {
				continue;
			}
		}
		
		if(flag) {
			System.out.println("It is not a Panagram");
		}
		else {
			System.out.println("It is a Panagram");
		}
	}

}
