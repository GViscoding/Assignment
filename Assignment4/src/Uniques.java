public class Uniques {

	public static char[] tosort(char ch[]) {
		char temp;
		int i = 0;
        while (i < ch.length) {
            int j = i + 1;
            while (j < ch.length) {
            	if(ch[i]!=32 && ch[j]!=32 ) {
	                if (ch[j] < ch[i]) {
	                   
	                    temp = ch[i];
	                    ch[i] =ch[j];
	                    ch[j] = temp;
	                }
            	}
                j += 1;
            }
            i += 1;
        }
        
        return ch;
	}
	
	public static boolean uniqueString(String s) {
		char[] chars = s.toCharArray();
		
		char[] ch = tosort(chars);
		
		for (int i=1; i<ch.length; i++) {
        		if (ch[i] == ch[i-1]) 
        			return false;
        	}
			return true;
		}
	
	public static void main(String[] args) {
		String str = "Gautam";
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+uniqueString(str));

	}		
}
