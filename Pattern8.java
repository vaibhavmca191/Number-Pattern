package numberpatterns;

public class Pattern8 {
/*
 * Draw This Pattern
 2
 4 6
 8 10 12
 14 16 18 20
 
 */
	public static void main(String[] args) {
		
		int size = 4;
		for(int i = 1,num=2;i<=size;i++) {
			for(int j =1;j<=i;j++) {
				System.out.print(num+" ");
				num = num + 2;
			}
			System.out.println();
		}
	}
}
