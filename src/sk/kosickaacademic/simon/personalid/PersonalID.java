package sk.kosickaacademic.simon.personalid;

import java.util.Calendar;

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

        int day, month, year;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        day=Integer.parseInt(id.substring(4,6));
        month=Integer.parseInt(id.substring(2,4));
        year=Integer.parseInt(id.substring(0,2)); year+=2000;
        if(year>currentYear) year-=100;
        if(id.charAt(2)=='5' || id.charAt(2)=='6') month-=50;

        if(month<1 || month>12 || day<1 || day>31){ System.out.println("Error: Invalid date."); return false; }
        if(month==2 && !(day<30)){ System.out.println("Error: Invalid date."); return false; }

        System.out.println(day +"-" +month +"-" +year);

        return true;
    }
}
