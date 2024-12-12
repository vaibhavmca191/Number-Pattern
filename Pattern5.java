package numberpatterns;

public class Pattern5 {

	/*
	 
	  Draw This Pattern
	  
	  1
	  2 2
	  3 3 3
	  4 4 4 4
	  
	 */
	public static void main(String[] args) {
		int size = 4;
		for(int i = 1,num=1;i<=size;i++,num++) {
			for(int j = 1;j<=i;j++) {
				
				System.out.print(num+" ");
			
			}
			System.out.println();
		}

	}

}
