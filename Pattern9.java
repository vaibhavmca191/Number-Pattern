

/*
Draw this Pattern
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/
public class Pattern9 {
public static void main(String args[]) {
int size = 5;
for(int i = 1,p=5;i<=size;i++,p--) {
for(int j = 1,k=p;j<=i;j++) {
System.out.print(k+" ");
}
System.out.println();
}
