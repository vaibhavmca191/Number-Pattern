/*
55555
54444
54333
54322
54321
*/
class HelloWorld {
    public static void main(String[] args) {
       int size =  5;
       for(int i= 1,p=5;i<=size;i++,p--){
          
           for(int j = 1,k=5;j<=i;j++,k--){
               System.out.print(k);
           }
           for(int j = i+1;j<=size;j++){
               System.out.print(p);
           }
          
           System.out.println();
       }
    }
}
