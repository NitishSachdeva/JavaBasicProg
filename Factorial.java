/*
*/
package basicprogques;
public class Factorial {
     static int fact=1;
    public static void main(String[] arg){
        int n=5;
        int res=calFact(n);
        System.out.print(res);
    
    }
    static int calFact(int n){
       
        if(n>1){
        fact=fact*n;
        calFact(n-1);
        }
        return fact;
    }
}   
/*
public class Factorial {
    public static void main(String[] arg){
        int num=3;
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.print("Factorial of number is--->" +fact);
    }
    
}
*/