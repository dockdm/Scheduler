package test;

import java.time.LocalDate;

public class Date {

    public final int year, month, day;
    public Date(int year,int month,int day ){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //INITIALIZES A DATE WITH THE CURRENT TIME
    public Date(){
        LocalDate ld = LocalDate.now();
        this.year    = ld.getYear();
        this.month   = ld.getMonthValue();
        this.day     = ld.getDayOfMonth();
    }

    //ACCEPTS YYYY-MM-DD FORMAT AS A STRING
    public  Date(String date){

        final int field = date.indexOf('-');
        final int field2 = date.lastIndexOf('-');

        this.year  = Integer.parseInt(date.substring(0, field));
        this.month = Integer.parseInt(date.substring(field+1, field2));
        this.day   = Integer.parseInt(date.substring(field2+1));
    }

    public final String toString(){ return String.format("%04d-%02d-%02d", this.year, this.month, this.day); }


}
