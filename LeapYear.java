/*Step 1:

We first divide the year by 4.
If it is not divisible by 4 then it is not a leap year.
If it is divisible by 4 leaving remainder 0 
Step 2:

We divide the year by 100
If it is not divisible by 100 then it is a leap year.
If it is divisible by 100 leaving remainder 0
Step 3:

We divide the year by 400
If it is not divisible by 400 then it is not a leap year.
If it is divisible by 400 leaving remainder 0 */
package basicprogques;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter year"); 
       int year= sc.nextInt();
       if(year % 400 ==0 ||(year%4==0 && year%100!=0)){
             System.out.println(year + " year is leap year "); 
       }else{
             System.out.println(year + " year is not leap year "); 
       }
    }
    
}
