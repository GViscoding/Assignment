import java.util.Arrays;
public class SubsetOfArray {
	public static int removeDuplicateElements(int arr[], int n){  
		if (n==0 || n==1){  
			return n; 
		}  
	    int[] temp = new int[n];  
	    int j = 0;  
	    for (int i=0; i<n-1; i++){  
	    	if (arr[i] != arr[i+1]){  
	           temp[j++] = arr[i];  
	            }  
	         }  
	        temp[j++] = arr[n-1];     
	        // Changing original array  
	    for (int i=0; i<j; i++){
	    	arr[i] = temp[i];
	    	} 
	      return j;  
	    }  
	
	public static void main(String[] args) {
		int[] arr1 = {496,28,65,79,6,98,36,46,48,20,94,10,52,66,56};
		Arrays.sort(arr1);
		int[] arr2 = {6,56,94,28,36,48,10,98};
		Arrays.sort(arr2);
			
		int n1 = arr1.length;
		int n2 = arr2.length;
		removeDuplicateElements(arr1,n1);
		removeDuplicateElements(arr2,n2);
			
		for(int elem : arr1) {
			System.out.print(elem+" ");
		}
			
		System.out.println();
			
		for(int elem : arr2) {
			System.out.print(elem+" ");
		}
		System.out.println();
			
			
		int count = 0;

		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i] == arr2[j]) {
					count++;	
				}
				else {
					continue;
					}
				}
			}
		if(count==arr2.length) {
			System.out.println("arr2 is a subset of arr1");
		}
	}
}
