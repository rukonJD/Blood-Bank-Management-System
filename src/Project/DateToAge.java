/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author USSL
 */
public class DateToAge {
    
    public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
    long diffInMillies = date2.getTime() - date1.getTime();
    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
    
}
    public static void main(String[] args) throws ParseException {
        Date date1,date2; 
        date1= new SimpleDateFormat("dd-MM-yyyy").parse("29-08-2020");
        date2= new SimpleDateFormat("dd-MM-yyyy").parse("29-08-2024");
        
        
        long days = getDateDiff(date1,date2,TimeUnit.DAYS);
        long year=days/365;
        System.out.println(year);
    }
    
}
