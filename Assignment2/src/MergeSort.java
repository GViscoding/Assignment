
public class MergeSort {
	public static void divide(int[] a,int low,int high) {
		if(low>=high) {
			return;
		}
			int mid = low + (high-low)/2;
			
			divide(a,low,mid);
			
			divide(a,mid+1,high);
			
		 	result(a,low,high,mid);
		
	}
	
	public static void result(int[] a,int low,int high,int mid) {
		int[] merged = new int[high - low +1];
		
		int index1 = low;
		int index2 = mid + 1;
		
		int x = 0;
		while(index1<=mid && index2<=high) {
			if(a[index1]<=a[index2]) {
				merged[x++] = a[index1++];
			}
			else {
				merged[x++] = a[index2++];
			}
		}
		while(index1<=mid) {
			merged[x++] = a[index1++];
		}
		while(index2<=high) {
			merged[x++] = a[index2++];
		}
		for(int i=0,j=low;i<merged.length;i++,j++) {
			a[j] = merged[i];
		}
	}
	public static void main(String[] args) {
		int [] a = {8,6,42,32,95,53,4,2,9,25,84,63};
		int low= 0;
		int n = a.length;
		int high = n - 1;
		divide(a,low,high);
		
		System.out.print("Your merged sort is : ");
		for(int elem : a) {
			System.out.print(elem+" ");
		}
		System.out.println();
	}

}
