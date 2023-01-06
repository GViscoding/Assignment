
public class RemoveDuplicates {

	public static void removeDuplicates(char[] sarr,int len) {
		
		int index = 0;
		char[] sarr2 = new char[len];
		
		for (int i = 0; i < len; i++) {
			int j;
			
			for (j = 0; j < i; j++) {
				
				if(sarr[i] != ' ' && sarr[j] != ' ') {
					
					if(sarr[i] == sarr[j])
						break;
					
				}
			}
			
			if(j==i)
				sarr2[index++] = sarr[i];
		
		}
		System.out.print(sarr2);
	}
	
	public static void main(String[] args) {
		String s = "Gautam Ganesh Velu";
		
		char[] sarr = s.toCharArray();
		
		int n = sarr.length;
		
		removeDuplicates(sarr, n);
		
		
	}

}
