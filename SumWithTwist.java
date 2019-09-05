/*
Using a method, pass two variables and find the sum of two numbers.
Test case:
            Number 1 – 20
            Number 2 – 20.38
            Sum = 40.38
*/
package basicprogques;

import java.util.Scanner;

public class SumWithTwist {
    static void sum(int num1,float num2){
        float sum=0;
        sum=num1 + num2;
        System.out.println(sum);
    }
    
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the number1--> ");
        int a=sc.nextInt();
        
        System.out.print(" enter the number2--> ");
        float b=sc.nextFloat();
         sum(a,b);
    }
}