/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.lab;


import static java.lang.String.format;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author kevinjerke
 */
public class DateUtilities {
    java.util.Date date = new Date("Sat Dec 01 00:00:00 GMT 2012");
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
String format = formatter.format(date);
System.out.println(format);



DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");


Date today = Calendar.getInstance().getTime();        

String reportDate = df.format(today);


System.out.println("Report Date: " + reportDate);

}