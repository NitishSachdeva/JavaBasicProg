/*
Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …

This series is a mixture of 2 series – all the odd terms in this series form a geometric(1,2,4,8,16,32....)
series and all the even terms form yet another geometric series.(1,3,9,27.81,243.....)
Write a program to find the Nth term in the series. 
*/
package basicprogques;
import java.util.Scanner;
class NumSeries2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                if(i==1){
                a=1;
                }else{
                    a=a*2;
                }
                           }else{
                if(i==2){
                    b=1;
                }
                else{
                    b=b*3;
                }
            }   
        }
        if(n%2!=0)
            System.out.println(a);
        else
            System.out.println(b);
        
        
    }    
}    
/*import static java.lang.Math.pow;
import java.util.Scanner;
public class NumSeries2 {
    
     static void three(int n){
        int x,i;

        for(i=0;i<100;i++){
        x=(int) pow(3,i);

        if(i==n)

        System.out.println(" "+  x);

        }
    }

    static void two(int n){
            int x,i;

        for(i=0;i<100;i++){
        x=(int)pow(2,i);

        if(i==n)
            System.out.println(" "+ x);

        }
}
    
    
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number you want to find");
        int n=sc.nextInt();
        if(n%2==0)
        three(n/2);

        else 
        two(n/2+1);
    }
    
}*/
    