package basicprogques;
/*
import java.util.Scanner;

public class StringVowConso {
    public static void main(String[] args)
    {
            String s1, s2, s3;
            Scanner sc = new Scanner(System.in);
            System.out.println("enter three string");
            s1 = sc.next();
            s2 = sc.next();
            s3 = sc.next();
            
            s1=s1.replaceAll("[aeiouAEIOU]", "*" );
            System.out.println("after removing vowels" + s1);
            
            s2=s2.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]","&");
            
            System.out.println("after consonants vowels" +  s2);
            
            System.out.println("to lowecase"  +  s3.toLowerCase());
    }
}
*/import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringVowConso {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
            int j=scan.nextInt();
            
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
            System.out.println(i+j);
            double e=scan.nextDouble();
            
        /* Print the sum of the double variables on a new line. */
		System.out.println(d+e +"\n");
                
            String t;
            t=scan.next();
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
           s=s + t;
            System.out.println(s);
        scan.close();}}