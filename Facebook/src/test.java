import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class test extends abs{

		public static void main(String args[]) {
	String str="Better Butter";
	String[] strarray =str.split(" ");
	String nstr=strarray[0]+strarray[1];
	
	char[] array =nstr.toCharArray();
	Map<Character,Integer> map = new LinkedHashMap<>();
	int count=0;
	for(int i=0;i<array.length-1;i++) {
		for(int j=0;j<array.length-1;j++) {
			
			if(array[i]==array[j]) {
				count++;
				map.put(array[i], count);
			}
		}
		count=0;
	}
	
	Iterator it =map.entrySet().iterator();
	
	while(it.hasNext()) {
		
		
		System.out.print(it.next());
	}
	
	
	
	
	
	
	
	
}

		@Override
		void run() {
			// TODO Auto-generated method stub
			
		}
}