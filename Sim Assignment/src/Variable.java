
public class Variable {
	
	int a = 10;
	static int b = 20;
	final int c = 30;
	volatile int  d = 40;
	transient int e =50;
		

	public static void main(String[] args) {
	
		Variable obj = new Variable();
		
		int z =14;
		System.out.println("Z =  " +z);
		System.out.println("C =  " + obj .c);
		System.out.println("B =  " +b);
		System.out.println("D =  " + obj.d);
		System.out.println("E =  " +obj.e);
		
		
		

	}

}
