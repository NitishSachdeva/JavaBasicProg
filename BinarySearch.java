/*
Binary Search: Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering 
the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval 
to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is
empty.
STeps:
Compare x with the middle element.
If x matches with middle element, we return the mid index.
Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
Else (x is smaller) recur for the left half.
*/
package basicprogques;
public class BinarySearch {
    public static void main(String[] args ){
        int[] a={2,5,7,9,12,14,16,17,19,20,24,28};
        int search=16;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while(li<=hi){
            if(a[mi]==search){
                System.out.print( mi + "element is present ");
            }
            else if(a[mi]<search){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
        if(li>hi)
            System.out.print("element is not present");
        
    }
    
}
