
public class DuplicatesInArray {
		public static void main(String[] args) {
			
			int[] arr = {6,68,72,3,5,9,72,88,55,48,81,9};
			int num;
			int count = 0;
			for (int i=0;i<arr.length;i++) {
				num = arr[i];
				for(int j=i+1;j<arr.length;j++) {
					if (num==arr[j]) {
						System.out.println("The number "+num+" has a Duplicate at "+j+" index.");
						count++;
					}
				}
			}
			if(count==0) {
				System.out.println("The Duplicates are not present in the given array.");
			}
			System.out.println("The number of duplicates are : "+count);
		}

	}
