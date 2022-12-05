class SubsetArray {
	
	public static void main(String[] args) {
		int[] arr1 = {496,28,65,79,6,98,36,46,48,20,94,10,52,66,56};
		int[] arr2 = {6,56,94,28,36,48,10,98};
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
