/*
*/
package basicprogques;

import java.util.Scanner;

public class ArrayProg1 {
    public static void main(String[] args){
       
        int arr[]={10,20,30,40,50,60};
  
        int largest,sec_largest;  
        
        System.out.print("Enter the elements of the array--->");  
        for(int i = 0; i<arr.length; i++)  
        {  
            System.out.print(arr[i]);  
        }  
            largest = arr[0];  
            sec_largest = arr[1];  
        for(int i=0;i<arr.length;i++)  
        {  
            if(arr[i]>largest)  
            {  
                sec_largest = largest;  
                largest = arr[i];  
            }  
            else if (arr[i]>sec_largest && arr[i]!=largest)  
            {  
                sec_largest=arr[i];  
            }  
        }  
       System.out.println("largest =  "+ largest + "   " +  " second largest = "  +  sec_largest);  

    }  
}
    

