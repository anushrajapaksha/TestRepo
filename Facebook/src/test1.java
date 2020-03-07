
public class test1 {


	static int x=1;
	
	
	
	
	int r() {
		
		
		test1.x=9;
		return x;
	}
	
	
	public static void main(String args[]) {
		
		test1 t = new test1();
		System.out.println(x);
		System.out.print(t.r());
	}
	
}
