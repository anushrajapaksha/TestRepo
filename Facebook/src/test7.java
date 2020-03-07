import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 int array[] = {5,2,3,1,1,9,3};
	 Map<Integer,Integer> map= new HashMap<>();
	 Set<Integer> set = new HashSet<>();
	 int first=1;
	 for(int i=0;i<array.length;i++) {
		 
		 if(set.add(array[i])) {}
		 else {
			 map.put(first,array[i]);
			 
		 }
		 
		 
		 
		 
	 }
	 
	 int v= map.get(first);
	 
	 System.out.print(v);
	 
	 
	 

	}

}
