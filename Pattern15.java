/*

Draw This Pattern
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
*/

public class Pattern15 
{
	
	public static void main(String[] args) 
	{
		int irange=7;
		int jrange=10;
		myCode(irange,jrange);
	}
	
	public static void myCode(int irange,int jrange)
	{
		for(int i = 1;i<=irange;i++) 
		{
			for(int j = 0;j<jrange;j++)
			{
				for(int k = 1;k<=3;k++) 
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}
}
