package numberpatterns;

public class Pattern6 {

	/*
	 
	  Draw This Pattern
	  
	  1 2 3 4
	    1 2 3
	      1 2
	        1
	      2 1
	    3 2 1
	  4 3 2 1
	  
	  */
	public static void main(String[] args) {
		int size = 4;
		for(int i = 1;i<=size;i++) {
			for(int j = 1+1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int j = i,num=1;j<=size;j++,num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		for(int i = 1+1;i<=size;i++) {
			for(int j = i+1;j<=size;j++) {
				System.out.print("  ");
			}
			for(int j = 1,num=1;j<=i;j++,num++) {
				System.out.print(num+" ");
			}
			System.out.println();
		}
		
	}

}
