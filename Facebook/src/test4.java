

public class test4{
	
	public static void main(String args[]) {
		
		Singleton s = Singleton.getInstance();
		
		
		
	}
	
}


	
	class Singleton{
		
		
		public static Singleton singleton= null;
		private Singleton() {
			
			
		}
		
		public static Singleton getInstance() {
			
			if(singleton ==null) {
				
			singleton= new Singleton();	
				
			}
			return singleton;
		}
		
		
		

	
	
}
