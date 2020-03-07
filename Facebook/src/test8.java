import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="geeksforgeeks";
		Map<Integer,Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		char [] array=str.toCharArray();
		char temp;
		int count=0;
	    for(int i=0;i<str.length();i++) {
	    	
	    	if(set.add(str.charAt(i))) {}
	    	else if(!map.containsValue(str.charAt(i))) {
	    		
	    		map.put(count,str.charAt(i));
	    		count++;
	    	}
	    	
	    	
	    }	
		
		
		for(Entry<Integer,Character> entry:map.entrySet()) {
			
			System.out.print(entry.getValue());
		}
		

	}

}
