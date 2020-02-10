package test;

public class ScheduleEventTime {

    protected final int startTime, endTime;                            //IN HOURS
    public final String name;

    public ScheduleEventTime(String name, int startTime, int endTime){
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getDescription( String prefix){
        return prefix + "De " + startTime + " a " + endTime + ", " + name;
    }
    public final String toString() { return getDescription(""); }


    public int getStartTime(){ return this.startTime; }
    public int getEndTime(){ return this.endTime; }

}
