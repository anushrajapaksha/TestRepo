
public class test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,5,4,9,2};
		
		int max=arr[0];
		int small=arr[0];
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<=arr.length-1;j++) {
				
				if(arr[j]>max) {
					max=arr[j];
					
				}
				else if(!(small<arr[j])) {
					
					small=arr[j];
				}
				
			}
			
			
		}
		
		
		System.out.print("smallest : " +small + "large :" +max);
		
		
		
		

	}

}
