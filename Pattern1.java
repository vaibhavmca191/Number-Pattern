package numberpatterns;

public class Pattern1 {

	/*
	 
	  Draw This Pattern
	  
	  1 
	  1 2
	  1 2 3
	  1 2 3 4
	  
	 */
	public static void main(String[] args) {
		
 int size = 4;

 for(int i = 1;i<=size;i++) {
	 
	 for(int j = 1, val=1;j<=i;j++) {
		 System.out.print(val+" ");
		 val++;
	 }
	 
	 System.out.println();
 }
	}

}
