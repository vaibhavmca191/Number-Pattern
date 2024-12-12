package numberpatterns;

public class Pattern3 {

	/*
	 
	 Draw This Pattern
	 
	 1 2 3 4
	 2 3 4
	 3 4
	 4
	 
	 */
	public static void main(String[] args) {
		
int size = 4;
for(int i = 1;i<=size;i++) {
	for(int j = i ;j<=size;j++) {
		
		System.out.print(j+" ");
		
	}
	
	System.out.println();
}
	}

}
