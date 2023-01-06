
public class PrintDuplicates {
	public static void main(String[] args) {
		String s = "Gautam Ganesh Velu";
		System.out.println(s);

		char[] sarr = s.toCharArray();
		
		System.out.print("Duplicates are present at indexes : ");
		
		for(int i=0;i<sarr.length;i++) {
			int j=i+1;
			for(j=i+1;j<sarr.length;j++) {
			
				if(sarr[i]!=' ' && sarr[j]!=' ') {
				
					if(sarr[i] == sarr[j]) {
						System.out.print(sarr[j]+", ");
						break;
					}
				}
				else {
					continue;
				}
			}
		}
	}
}
