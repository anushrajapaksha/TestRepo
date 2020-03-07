import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FB {

	public static void main(String[] args) {
	
		
		int [] a = {7,1,4};
		int [] b= {5,2,8};
		int array[] = new int[a.length+b.length];
		int count=0;
		int x=0;
		int y=0;
		int temp;
		while(x<a.length) {
			
			array[count]=a[x];
			x++;
			count++;
			
		}
		
		while(y<a.length) {
			
			array[count]=b[y];
			count++;
			y++;
			
			
		}
		
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
			
		}
		
		for(Integer ar:array) {
			System.out.print(ar);
			
		}
		
		
		
		
	}
}
