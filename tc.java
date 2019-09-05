
package basicprogques;

import java.util.Scanner;

public class tc {
    public static void main(String[] args){
        int x,y,remX,remY;
        double res=0;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        if(x>0 && y>0){
            remX=x%10;
            remY=y%10;
            res=res +Math.pow(remX, remY);
        }System.out.print((int)res);

    }
}
