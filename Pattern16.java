/*
Draw This Patttern
1 
2 6 
3 7 10 
4 8 11 13 
5 9 12 14 15 
*/
class Pattern16{
    public static void main(String[] args) {
        int size = 5;
        for(int i = 1,p=1;i<=size;i++,p++){
            for(int j = 1,k=p,m=4;j<=i;j++,m--){
                System.out.print(k+" ");
                k = k + m;
            
            }
            System.out.println();
        }
    }
}
