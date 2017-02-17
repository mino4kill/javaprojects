package projet1;

import java.util.Calendar;
import java.util.GregorianCalendar;

class DataTime
{
public static void main(String args[])
{
int day, month, year;
int second, minute, hour;
GregorianCalendar data = new GregorianCalendar ();

day = data.get(Calendar.DAY_OF_MONTH);
month = data.get(Calendar.MONTH)+1;
year = data.get(Calendar.YEAR);

second = data.get(Calendar.SECOND);
minute = data.get(Calendar.MINUTE);
hour = data.get(Calendar.HOUR);

System.out.println("Current data is "+day+"/"+month+"/"+year);
System.out.println("Current time is "+hour+":"+minute+":"+second);
}
}