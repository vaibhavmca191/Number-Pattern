/*
01010
10101
01010
10101
01010
*/

class HelloWorld {
    public static void main(String[] args) {
       int size =  5;
       for(int i= 1;i<=size;i++){
           for(int j = 1;j<=size;j++){
               if((i+j)%2==0)
               System.out.print("0");
               else
               System.out.print("1");
           }
           System.out.println();
       }
    }
}
