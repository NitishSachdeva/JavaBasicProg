
package basicprogques;

public class HcfLcm {
    public static void main(String[] args){
        int num1=10;
        int num2=6;
        int gcd = 0;
        int lcm=0;
        for(int i=1;i<=num1 && i<=num2;i++){
             gcd=i;
        }
        System.out.print("HCF IS---> " + gcd);
        lcm=(num1*num2)/gcd;
        System.out.print("LCM IS---> " + lcm);
        
        
    }
}
