package test;


public class ScheduleOfTheDay {

    protected final Date day;
    public final String name;
    protected final ScheduleEventTime[] timeTable;

    public ScheduleOfTheDay(String name, Date day, ScheduleEventTime... timeTable){
        this.name = name;
        this.day=day;
        this.timeTable = timeTable;
    }

    public Date getDate(){
        return this.day;
    }
    public ScheduleEventTime[] getDateTimeTable(){
        return this.timeTable;
    }

    public String getDescription( String prefix){
        return prefix + "De " + timeTable[0].startTime + " a " + timeTable[timeTable.length].endTime + ", " + name;
    }
    public final String toString() { return getDescription(""); }


}
