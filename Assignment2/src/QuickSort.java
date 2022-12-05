public class QuickSort {
	
	public static int partition(int arr[],int low,int high){
		int pivot = arr[high];
		int i = low-1;
		
		for(int j=low; j<high;j++) {
			if(arr[j]<pivot) {
				i++;
				//swap---->
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = pivot;
		arr[high] = temp;
		return i;
	}	
	
	public static void quickSort(int arr[],int low,int high) {
		if(low<high) {
			int pindx = partition(arr,low, high);
			
			quickSort(arr,low,pindx-1);
			quickSort(arr,pindx+1,high);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {8,6,42,32,95,5,4,2,9,25,84,63};
		int n = arr.length;
		
		quickSort(arr,0,n-1);
		
		for(int elem:arr) {
			System.out.print(elem+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[] arr = {8,6,42,32,95,5,4,2,9,25,84,63};
//		int pivot = arr[0];
//		int temp=0,j,i;
//		
//		
//		for(i=1;i<arr.length;i++) {
//			if (arr[i]>=pivot) {
//				
//				for(j=arr.length-1;j>i;j--) {
//					if (arr[j]<pivot) {
//						
//						arr[i]=arr[j];
//						temp=arr[i];
//						arr[j]=temp;
//						
//					}
//				}
//			}
//		}
//		for(int elem:arr) {
//			System.out.print(elem+" ");
//		}
	}

}
