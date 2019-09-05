/*
LINEAR SEARCH
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.
*/
package basicprogques;

public class LinearSearch {
    public static void main(String[] args){
        int arr[]= {10,20,30,40,50,60,70,80 };
        int item=50;
        int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.print("item is present at index " + i );
                temp=temp+1;
            }
        }    
            if(temp==0){
                System.out.print("item is not present at index "  );
              
            }
        
    
    }
        
}
