import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Anush";
		String temp="";
		int len=str.length()-1;
		for(int i=0;i<=str.length()-1;i++) {
			
			temp=temp+str.charAt(len-i);
			
		}
		
		System.out.print(temp);
        
        
        
        
}
}