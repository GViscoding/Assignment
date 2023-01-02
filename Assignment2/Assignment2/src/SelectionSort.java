class Ssort{
	int temp;
	public Ssort(int n,int[] arr){
		for(int i=0;i<n-1;i++) {
			int min = i;
			int temp = 0;
			for(int j=i+1;j<n;j++) {
				if(arr[j] < arr[min] ) {
					min = j;
				}
			}
			if(min!=i) {
				temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
	}
}
public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = {8,6,42,32,95,53,4,2,9,25,84,63};
		int n = arr.length;
		new Ssort(n,arr);
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
	}

}
