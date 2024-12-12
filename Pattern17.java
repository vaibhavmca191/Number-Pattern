/*
Draw This Patttern
1 
1 2 1 
1 2 3 2 1 
1 2 3 4 3 2 1 
1 2 3 4 5 4 3 2 1 
*/
class Pattern16{
    public static void main(String[] args) {
        int size = 5;
        for(int i = 1,p=1;i<=size;i++,p++){
            for(int j = 2,m=1;j<=i;j++,m++){
                System.out.print(m+" ");
            
            }
            for(int j = 1,k=p;j<=i;j++,k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
