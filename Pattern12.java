/*
11111
11122
11333
14444
55555
*/
class HelloWorld {
    public static void main(String[] args) {
       int size =  5;
       for(int i= 1,p=1;i<=size;i++,p++){
           for(int j = i+1,k=1;j<=size;j++){
              System.out.print(k);
              
           }
           for(int j = 1;j<=i;j++){
               System.out.print(p);
           }
           
           System.out.println();
       }
    }
}
