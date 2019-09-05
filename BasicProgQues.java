
package basicprogques;

import static java.lang.Math.abs;
import java.util.Scanner;


public class BasicProgQues {

    public static void main(String[] args) {
    
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number -->");
        int num=sc.nextInt();
 	int rem,odd=0,even=0,digit,input;
	input=num;
	num=abs(num);
	while(num>0){
	digit=num%10;
		num=num/10;
		rem=digit%2;
		if(rem!=0)
		odd=odd+digit;
		else
			even=even+digit;
	}
        int diff=even - odd;
            System.out.println("sumof even digit - sum of odd digit---->"+  diff);	
	
        }   
 }

