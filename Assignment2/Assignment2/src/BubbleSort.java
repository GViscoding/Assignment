public class BubbleSort {
	public static void main(String[] args) {
		int [] a = {8,6,42,32,95,5,4,2,9,25,84,63};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=1;j<a.length-i;j++) {
				
				if(a[j]<a[j-1]) {
					int tempvar=a[j];
					a[j]=a[j-1];
					a[j-1]=tempvar;
				}
			}
		}
		for(int elem:a) {
			System.out.print(elem + " ");
		}
	}
}