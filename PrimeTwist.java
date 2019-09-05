/*
Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is 
positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?

Whether the number is positive or not, if it is negative then print the message “please enter the positive number”
It is positive then call the function prime and check whether the take positive number is prime or not.

*/
package basicprogques;
import java.util.Scanner;

public class PrimeTwist {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //input a number from user
    System.out.println("Enter the number to be checked : ");
    int n = sc.nextInt();
    //create object of class CheckPrime
    PrimeTwist ob=new PrimeTwist();
    //calling function with value n, as parameter
    ob.check(n);
    }
//function for checking number is positive or negative 
    void check(int n)
    {
    if(n<0)
    System.out.println("Please enter a positive integer");
    else
    prime(n);
    }
    //function for checking number is prime or not 
    void prime(int n)
    {
    int temp=0;
    for(int i=2;i<n;i++)
    {
    if(n%i==0)
    temp=temp+1;
    }
    if(temp==0)
    System.out.println("Entered number is a prime number");
    else
    System.out.println("Entered number is not a prime number");
    }
    
}
