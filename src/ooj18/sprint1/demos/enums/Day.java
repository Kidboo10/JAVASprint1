package ooj18.sprint1.demos.enums;

public class Day{

    public enum Weekday {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    
    protected Weekday dayName;
    
    
    Day(Weekday dayName){
        this.dayName = dayName;
    }
    
    public static void main(String[] args){
        
        Day day1 = new Day(Weekday.MONDAY);
        Day day2 = new Day(Weekday.TUESDAY);
        
    }
    
}
