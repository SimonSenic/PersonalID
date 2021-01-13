package sk.kosickaacademic.simon.personalid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class PersonalID {
    public boolean checkId(String id){
        if(id.length()<9 || id.length()>11) return false;
        int digits=0;
        for(int i=0; i<id.length(); i++)
            if(Character.isDigit(id.charAt(i))) digits++;
        if(digits<9 || digits>10) return false;
        if(id.length()==11 && (digits!=10 || id.charAt(6)!='/')) return false;
        if(id.length()==10 && digits==9 && id.charAt(6)!='/') return false;
        if(digits==9) id+='0';
        if(id.charAt(6)=='/') id=id.substring(0,6)+id.substring(7);
        if(id.charAt(2)!='0' && id.charAt(2)!='1' && id.charAt(2)!='5' && id.charAt(2)!='6') return false;
        long num = Long.parseLong(id);
        if(num%11!=0){ System.out.println("Error: Invalid ID."); return false; }

        int day, month, year, currentYear = Calendar.getInstance().get(Calendar.YEAR);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        Calendar cal = Calendar.getInstance();
        String currentDate = df.format(cal);
        day=Integer.parseInt(id.substring(4,6));
        month=Integer.parseInt(id.substring(2,4));
        year=Integer.parseInt(id.substring(0,2)); year+=2000;
        if(year>currentYear) year-=100;
        if(id.charAt(2)=='5' || id.charAt(2)=='6') month-=50;

        if(month<1 || month>12 || day<1 || day>31){ System.out.println("Error: Invalid date."); return false; }
        if(month==2 && !(day<30)){ System.out.println("Error: Invalid date."); return false; }
        String date=day+"-"+month+"-"+year, finalDay=""; long daysCount=0;
        try{
            SimpleDateFormat format1 = new SimpleDateFormat("dd-MM-yyyy");
            Date dt=format1.parse(date);
            DateFormat format2 = new SimpleDateFormat("EEEE");
            finalDay=format2.format(dt);

            LocalDate date1 = LocalDate.parse(currentDate);
            LocalDate date2 = LocalDate.parse(date);
            daysCount = Duration.between(date1, date2).toDays();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(day +"-" +month +"-" +year);
        System.out.println(finalDay);
        System.out.println(daysCount);

        return true;
    }
}
