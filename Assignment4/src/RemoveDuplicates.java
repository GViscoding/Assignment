import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("I am Studing Java Full Stack Development");

		char s1[] = s.toLowerCase().toCharArray();		
		
		int n = s1.length; 
		
		int temp = 0;
		for(int i=0;i<n-1;i++) {
			int j;
			for(j=0;j<n-1;j++) {
				if(s1[i] == s1[j]) {
					break;	
				}
			}
			
			if(j==i) {
				s1[temp++] = s1[i];
			}
		}
		System.out.println(String.valueOf(Arrays.copyOf(s1, temp)));   
	}

}
