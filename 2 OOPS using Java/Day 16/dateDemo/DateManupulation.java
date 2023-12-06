package dateDemo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateManupulation {
    public static void main(String[] args) {
       /* Date d=new Date();      
        SimpleDateFormat sdf=new SimpleDateFormat("dd MMM,yyyy hh:mm:ss");
       
        //for converting date to String
        String strDate=sdf.format(d);
        System.out.println(strDate);
        */
       
        //forconverting String to date
        String sDate="2021-10-23 8:35:45";
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        try{
        Date dt=sdf.parse(sDate);
            System.out.println(dt);
        }
        catch(Exception e){}
        
    }
}
