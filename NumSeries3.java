/*
Consider the below series :

0, 0, 2, 1, 4, 2, 6, 3, 8, 4, 10, 5, 12, 6, 14, 7, 16, 8

This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order
and every even terms is derived from the previous  term using the formula (x/2)
Write a program to find the nth term in this series.
*/
package basicprogques;

import java.util.Scanner;

public class NumSeries3 {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number you want to find-->");
        int n=sc.nextInt();
        int a=0;
        int b=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
              if(i==1)
                  a=0;
              else
                    a = a + 2;
            }
            else
            {if(i==2)
                b=0;
            else
              b = a/2;
            }
        }
            if(n%2!=0)
            {
                  System.out.println("  "+  a);
            }
            else
            { 
                  System.out.println("  " + b);
            }

    }
    
}
