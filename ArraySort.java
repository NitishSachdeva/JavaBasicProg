
package basicprogques;
public class ArraySort {
    public static void main(String[] args){
        int[] a={38,52,9,18,6,62,13};
        System.out.print("unsorted array--->" );
        display(a);
        sortAsc(a);
        System.out.print("sorted array in ascending order---->");
        display(a);
        System.out.print("sorted array in descending order---->");
        sortDesc(a);
    
    }static void display(int num[]){
           for(int i=0;i<num.length;i++){
            System.out.print(num[i] +" ");
        }
    }
           static void sortAsc(int num[]){
                int temp;
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp; 
                }
            }
        }
           }
           static void sortDesc(int num[]){
               for(int i=num.length-1;i>=0;i--){
                   System.out.print(num[i] +" ");
               }
           }
           
           
           
    }
