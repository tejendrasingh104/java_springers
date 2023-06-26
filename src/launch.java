
public class launch {

	public static void main(String[] args) {
		System.out.println("\n"+"----for loop---------");
		for(int i=0;i<5;i++) {
			System.out.println('*');
		}
		System.out.println("-------------");
		for(int i=0;i<5;i++) {
			System.out.print('*');
		}
		System.out.println("\n"+"----while loop---------");
		int j=0;
		while(j<5) {
			System.out.println("*");
			j++;
		}
		System.out.println("\n"+"----do while loop---------");
		int k=0;
		do {
			System.out.println("*");
			k++;
		}while(k<5);
	}

}
