public class DuplicatesInString {
	public static void main(String[] args) {

		String s = new String("I am Studing Java Full Stack Development");

		String s1 = s.toLowerCase();		
		int count = 0;
		
		for(int i=0;i<s1.length()-1;i++) {
			
			for(int j=i+1;j<s1.length();j++) {
				
				if(s1.charAt(i) != ' ') {
					
					if (s1.charAt(i) == s1.charAt(j)) {
						count++;
					}
				}
			}
		}
		System.out.println("There are "+count+" duplicates in a String : ");
		System.out.println(s);
	}
}
