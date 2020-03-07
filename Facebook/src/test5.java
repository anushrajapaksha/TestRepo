import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abbef";
		Map<Character,Integer> map = new HashMap<>();
		char [] array =str.toCharArray();
	char temp;
		int count=0;
		 	char c=0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=0;j<array.length-1;j++) {
				
				temp=array[i];
				if(temp==array[j+1]) {
					count++;
					map.put(temp,count);
				}
			}
			
			count=0;
		}
		int max = Collections.max(map.values());		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			
			int value =entry.getValue();
			if(value==max) {
				
			c=entry.getKey().charValue();	
			}
			
		}
		
		System.out.print("highest char is :"  +c);
		
		
		
		
		
		
		

	}

}
