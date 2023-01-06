public class Maxchar {
	//method for removing spaces.
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
		int len = s1.length();
		
		//Creating an array of same size of ASSCI values in characters.
		int[] count = new int[256];
		
		//Variable which will let us know how much times that max occurring character is occurring.
		int max = -1;
		
		//Character variable to obtain the max occurring character. 
		char result = ' ';
		
		
		for (int i = 0; i < len; i++) 
			count[s1.charAt(i)]++;
		
		
		for (int i = 0; i < len; i++) {
			if(max < count[s1.charAt(i)]) {
				max = count[s1.charAt(i)];
				result = s1.charAt(i); 
			}
		}
		System.out.println("Max Occuring Character is '"+result+"' which occured for "+max+" times");
	}
}
