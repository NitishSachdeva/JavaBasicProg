/*
perfect numbers are--->for eg  6=factores are 1,2,3 and when we add those factores its represent number itself


*/
package basicprogques;

public class PerfectNumber {
    static boolean isPerfect(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%1==0)
                sum=sum+i;
            
        }
        if(n==sum)
         return true;
        return false;
    }
    public static void main(String[] args){
        int n=6;
        boolean b=isPerfect(n);
        if(b)
               System.out.println("number is perfect");
        else
               System.out.println("number is not perfect");
        
    }
}
