
package basicprogques;
import java.util.*;
 public class DateTimeProg {
   public static void main(String args[])
   {
      int day, month, year;
      int second, minute, hour;
      GregorianCalendar date = new GregorianCalendar();
     
      day = date.get(Calendar.DAY_OF_MONTH);
      month = date.get(Calendar.MONTH);
      year = date.get(Calendar.YEAR);
     
      second = date.get(Calendar.SECOND);
      minute = date.get(Calendar.MINUTE);
      hour = date.get(Calendar.HOUR);
 
      System.out.println("Current date is  "+day+"/"+(month+1)+"/"+year);
      System.out.println("Current time is  "+hour+" : "+minute+" : "+second);
   }
}     
 /*   import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
public class DateTimeProg {    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
   LocalDateTime now = LocalDateTime.now();  
   System.out.println(dtf.format(now));  
  }    
}  */
/*
import java.text.SimpleDateFormat;  
import java.util.Date;    
public class DateTimeProg {    
  public static void main(String[] args) {    
      SimpleDateFormat formatter=new SimpleDateFormat("dd/mm/yyyy ");
      Date d =new Date();
      System.out.println(d);
  
  }
}  
*/