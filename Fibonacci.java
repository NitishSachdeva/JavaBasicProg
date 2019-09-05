package basicprogques;
public class Fibonacci {
     static int a=0,b=1,c;
      public static void main(String[] args){
        
         System.out.print( a+ "   "+b);
         printFib(10);
    
    
    }
     static void printFib(int i){
         if(i>=1){
            c=a+b;
            System.out.print("  "+  c);
            a=b;
            b=c;
            printFib(i-1);
        }
    } 
}

/*public class Fibonacci {
    public static void main(String[] args){
        int a=0,b=1,c;
        int count=3;
        System.out.print("Fibonacci series--->" );
        while(count<=10){
            c=a+b;
            
            System.out.print("  "+ c);
            a=b;
            b=c;
            count++;
        }
        
    }

}

*/