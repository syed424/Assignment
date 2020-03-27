package Flowcontrols;

public class DoWhileExample {

	public static void main(String[] args) {
	int i = 10, sum = 0;
	do {
		System.out.println(i );
		sum = sum + i;
		++i;
	}		while (i <=20);
	System.out.println("Sum of numbers   =  "  + sum);
	

}
}
