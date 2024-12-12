package numberpatterns;

public class Pattern2 {

	/*
	
	Draw This Pattern
	
	4
	4 3
	4 3 2
	4 3 2 1
	
	 */
	public static void main(String[] args) {
		
		int size = 4;
		for(int i = 1;i<=4;i++) {
			for(int j = 1,val=4;j<=i;j++) {
				System.out.print(val+" ");
				val--;
			}
			System.out.println();
		}
		

	}

}
