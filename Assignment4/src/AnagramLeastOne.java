
public class AnagramLeastOne {

	public static String removeSpace(String s) {
		String ss = "";
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ') {
				ss += s.charAt(i);
			}
		}
		return ss;
	}
	
	public static String toLow(String s) {
		String s3 = "";
		
		for (int i=0;i<s.length();i++) {
			
			if(s.charAt(i)>=65 && s.charAt(i)<=90) 
				s3+=(char)(s.charAt(i)+32);
						
			else 
				s3+=s.charAt(i);
			
		}
		return s3;
	}
	
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
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		
			String s1 = "A Gentle man";
			String s2 = "Elegant man";
			
			s1=toLow(s1);
			s2=toLow(s2);
			
			s1 = removeSpace(s1);
			s2 = removeSpace(s2);
			
			System.out.println(s1);
			System.out.println(s2);
			
			char ch1[]= s1.toCharArray();
			char ch2[]= s2.toCharArray();
			
			char ch3[] = tosort(ch1);
			char ch4[] = tosort(ch2);
			
			System.out.println("-------------------");
			boolean flag = false;
			for (int i=0;i<ch3.length;i++) {
				if(ch3[i] == ch4[i]) {
					flag=true;
				}
			}
			if(flag) {
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("It is not an Anagram");
			}
		}
}
