
package basicprogques;
import java.util.*;
public class StrVowlConsoRemoval {
    public static void main(String[] args)
    {
            String s1, s2, s3;
            Scanner sc = new Scanner(System.in);
            s1 = sc.next();
            s2 = sc.next();
            s3 = sc.next();
            String A1=" ";
            String A2=" ";
            String A3=" ";        
            char[] str1 = s1. toCharArray();
            char[] str2 = s2. toCharArray();
            int i;
            System.out.print("\nAfter Replacing : \n");

            for(i = 0; i < str1.length; i++)
            {
            if(str1[i] =='a' || str1[i] =='e' || str1[i] == 'i' || str1[i] == 'o' || str1[i] == 'u' || str1[i] == 'A' 
                    || str1[i] =='E' || str1[i] == 'I' || str1[i] == 'O' || str1[i] == 'U')
            {
                A1 = s1.replace(str1[i],'"');
            }
            }

            for(i = 0; i < str2.length; i++)
            {
            if(str2[i] =='a' || str2[i] =='e' || str2[i] == 'i' || str2[i] == 'o' || str2[i] == 'u' || str2[i] == 'A' 
                    || str2[i] =='E' || str2[i] == 'I' || str2[i] == 'O' || str2[i] == 'U')
            {
                continue;
            }
            else
            A2 = s2.replace(str2[i], '*');
            }
            A3=s3.toLowerCase();
            
            System.out.print("\nString  : " + A1 +" " + A2 +" " + A3);
            
        }

}
