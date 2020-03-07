import java.util.HashMap;
import java.util.Map;

public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="stress";
		Map<Integer,Character> map = new HashMap<>();
		char temp;
		int count=0;
		int flag=0;
		char [] array= str.toCharArray();
		for(int i=0;i<str.length()-1;i++) {
			for(int j=1+i;j<str.length()-1;j++) {
				
				temp=str.charAt(i);
				if(str.charAt(j)==temp) {
					count++;
					map.put(count,temp);
				}
				
			}
			
			if(count==0) {
				
				map.put(flag,str.charAt(i));
				flag++;
			}
			count=0;
			
		}
		
		char v = map.get(0);
		
		System.out.print(v);
		
		
		
		
		

	}

}
