/*
Strong Number for eg 145= 1! + 4! + 5!
                        =145 then it is a strong number
*/
package basicprogques;
public class StrongNumber {
    public static void main(String[] args){
        int sum=0;
        int rem;
        int temp;
        int num=145;
        temp=num;
        while(num>0){
            rem=num%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            num=num/10;
            sum=sum+fact;
        }
        if(temp==sum)
            System.out.println("num is strong");
        else
            System.out.println("num is not  strong");
    }
    
}
