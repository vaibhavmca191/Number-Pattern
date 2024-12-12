/*
55555
45555
34555
23455
12345
*/
class HelloWorld {
    public static void main(String[] args) {
       int size =  5;
       for(int i= 1,p=5;i<=size;i++,p--){
           for(int j = 1,k=p;j<=i;j++,k++){
               System.out.print(k);
           }
           for(int j = i+1,k=5;j<=size;j++){
               System.out.print(k);
           }
           System.out.println();
       }
    }
}
