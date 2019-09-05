
package basicprogques;

public class BinToDecimal {
    public static void main(String[] args){
        int n=1111;
        int decimal=0;
        int i=0;
        int rem;
        
        while(n!=0){
            rem=n%10;
            n=n/10;
            decimal+=rem*Math.pow(2,i);
            ++i;
                    
        }System.out.println("decimal number is" + decimal);
    }
}
