
public class t2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=454;
		
		int temp=num;
		int r,n=0;;
		int sum=0;
		while(num>0) {
			
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
			
		}
		
		if(sum==temp) {
			
			
			System.out.print("yes sir");
			
		}
		
		else {
			System.out.print("no sir");
		}
		
		
	}

}
