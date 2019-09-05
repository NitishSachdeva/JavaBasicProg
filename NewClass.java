package basicprogques;
import java.io.*;
import static java.lang.Math.ceil;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class NewClass {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        tip_percent=(int) (meal_cost *tip_percent/100d);
        tax_percent=(int) (meal_cost * tax_percent/100);
        
        
        int total_cost=(int) (meal_cost + tip_percent + tax_percent);
        System.out.print(total_cost);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
