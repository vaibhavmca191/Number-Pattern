/*
Draw This Pattern
XOOOO
OXOOO
OOXOO
OOOXO
OOOOX
*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		myCode(irange,jrange);
	}

	public static void myCode(int irange,int jrange)
	{

		int size = 5;
		for(int i = 1;i<=size;i++) 
		{
			for(int j = 1;j<=size;j++) 
			{
				if(i==j) 
				System.out.print("X");
				else
				System.out.print("O");
			}
			System.out.println();
		}
	}
}
