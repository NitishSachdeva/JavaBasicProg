
package basicprogques;

import java.util.Scanner;
class Maze{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int temp;
        temp=a;
        int rev=0;
        if(a>=10 &&a<=99){
            while(temp!=0)
            {
                int rem=temp%10;
                rev=rev*10 + rem;
                temp=temp/10;
            }

                System.out.println(rev);
        }
        else{
            
            System.out.println("enter two digit number only"); 
        }
    }
}