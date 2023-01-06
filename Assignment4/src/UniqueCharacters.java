
public class UniqueCharacters {

	public static void main(String[] args) {
		String s ="GautamVelu01@gmail.com";
		int spc = 0;
		int Uppc = 0;
		int Lowc = 0;
		int Numc = 0;
		
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i) >= 33 && s.charAt(i) <= 47 
					|| s.charAt(i) >= 58 && s.charAt(i) <= 64
					|| s.charAt(i) >= 91 && s.charAt(i) <= 96
					|| s.charAt(i) >= 123 && s.charAt(i) <= 126) 
				spc++;
			
			
			if(s.charAt(i) >= 97 && s.charAt(i) <= 122) 
				Lowc++;
			
			
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90)
				Uppc++;
			
			if(s.charAt(i) >= 48 && s.charAt(i) <= 57)
				Numc++;
		}
		
		System.out.println("String Contains "+spc+ " Special Characters");
		System.out.println("String Contains "+Uppc+ " UpperCase Characters");
		System.out.println("String Contains "+Lowc+ " LowerCase Characters");
		System.out.println("String Contains "+Numc+ " Numerous Characters");
	}

}
