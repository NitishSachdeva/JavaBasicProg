/*Find the 15th term of the series?

0,0,7,6,14,12,21,18, 28

Explanation : In this series the odd term is increment of 7 {0, 7, 14, 21, 28, 35 – – – – – – }

                        And even term is a increment of 6 {0, 6, 12, 18, 24, 30 – – – – – – }

*/
package basicprogques;
import java.util.Scanner;
  class Main
{
	public static void main(String[] args)
	{
		int a = 7, b = 0,c;
		System.out.println("Series :");
		for(int i = 1 ; i < 8 ; i++)
		{
			c = a * b;
			System.out.print(c+"	"+(c-b)+"	");
			b++;
		}
			c = a * b;
			System.out.println(c);
			System.out.print("16th element of the series is = "+c);
	}
}

/*
public class NumSeries1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=0;
    int b=0;
    int i;
    for(i=0;i<=n; i++){
    if(i%n!=0){
        if(i>1)
        a=a+a*7;
        
    }
    else{
        b=b+b*6;
        
    }
}
    if(n%2!=0){
    System.out.println(a);
    }
    else
    {
        System.out.println(b);
    }
    }
}
*/