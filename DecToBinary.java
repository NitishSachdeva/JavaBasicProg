
package basicprogques;
public class DecToBinary {
     public static void main(String[] args){
        int n=13;
        int binary=0;
        int i=1;
        int rem;
        
        while(n!=0){
            rem=n%2;
            n=n/2;
            binary=binary + (rem*i);
            i=i*10;
                    
        }System.out.println("binary number is" + binary);
    }
    
}
