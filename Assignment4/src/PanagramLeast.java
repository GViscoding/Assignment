
public class PanagramLeast {

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
		// TODO Auto-generated method stub
		String s1 = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
		s1 = removeSpace(s1);
		System.out.println(s1);
		System.out.println("-----------------------------------");
		char ch[] = s1.toCharArray();
		
		char ch1[] = new char[27];
		
		for(int i=0;i<ch.length;i++) {
			int temp = 0;
			temp = ch[i] - 65;
			ch1[temp]++;	
		}
		
		boolean flag=false;
		
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
