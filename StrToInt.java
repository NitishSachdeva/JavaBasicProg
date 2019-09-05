
package basicprogques;


public class StrToInt {
    public static void main(String[] arg){
        String num="15.0";
        int res=0;
        for(int i=0;i<num.length();i++){
            res=res*10 + num.charAt(i) -'0';
        }
        System.out.print(res);
    }
}
