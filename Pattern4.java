package numberpatterns;

public class Pattern4 {
	
	/*
	
	 Draw This Pattern
	 
	    4
	   3 4
	  2 3 4
	 1 2 3 4
	 
	 */

	public static void main(String[] args) {
		int size = 4;
		
		for(int i = 1,num = 4;i<=size;i++,num--) {
			
			for(int j = i+1;j<=size;j++) {
				System.out.print(" ");
			}
			for(int j = 1,p=num;j<=i;j++,p++) {
				System.out.print(p+" ");
			}
			
			System.out.println();
			
		}

	}

}
