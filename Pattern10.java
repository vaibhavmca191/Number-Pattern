package practice;

public class Pattern10 {

	/*
10101
10101
10101
10101
10101
	 */
	
	public static void main(String[] args) {
		
		int row = 5;
		for(int i = 1;i<=row;i++) {
			for(int j = 1;j<=row;j++) {
				if(j%2!=0)
					System.out.print("1");
				else
					System.out.print("0");
				
			}
			
			
			System.out.println();
		}
		
	}
}
