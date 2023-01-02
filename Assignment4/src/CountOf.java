class Counting{
	
	private String s2;
	
	int conso=0;
	int vow=0;
	int spec=0;
	
	public Counting(String s) {
		this.s2=s;
	}
	
	public void countConsonants() {
		String s3 = s2.toLowerCase();
		for(int i=0;i<s3.length();i++) {
			char t = s3.charAt(i);
			if (t>=97 && t<=122) {
				if(t!=97 && t!=101 && t!=105 && t!=111 && t!=117 ) {
					conso++;
				}
			}
		}
		System.out.println("The number of consonants are : "+conso);
	}
	
	public void countVowels() {
		String s3 = s2.toLowerCase();
		for(int i=0;i<s3.length();i++) {
			char t = s3.charAt(i);
			if (t>=97 && t<=122) {
				if(t==97 || t==101 || t==105 || t==111 || t==117 ) {
					vow++;
				}
			}
		}
		System.out.println("The number of Vowels are : "+vow);
	}
	
	public void countSpecChars() {
		String s3 = s2.toLowerCase();
		for(int i=0;i<s3.length();i++) {
			char t = s3.charAt(i);
				if(t>=33 && t<=47 || t>=58 && t<=64 || t>=91 && t<=96 || t>=123 && t<=126) {
					spec++;
				}
		}
		System.out.println("The number of Special Characters excluding spaces are : "+spec);
	}
}

public class CountOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hey! Hello guys my is Gautam Ganesh Velu email-ID = gautamvelu01@gmail.com , I am glad to see you here.";
		System.out.println(s1);
		Counting c = new Counting(s1);
		c.countConsonants();
		c.countVowels();
		c.countSpecChars();
	}

}
