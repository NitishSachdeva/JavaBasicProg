
package basicprogques;
import java.util.*;

public class ArmStrong {

    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            int temp, remainder, result = 0, n = 0 ;
                temp = number;

            // Finding the number of digits

            while (temp != 0)
            {
            temp /= 10;
            ++n;
            }

            temp = number;

            // Checking if the number is armstrong

            while (temp != 0)
            {
            remainder = temp%10;
            result += Math.pow(remainder, n);
            temp /= 10;
            }

            if(result == number)
            System.out.println(number + "is an Armstrong number\n");
            else
            System.out.println(number + " is not an Armstrong number\n");

}

}    

