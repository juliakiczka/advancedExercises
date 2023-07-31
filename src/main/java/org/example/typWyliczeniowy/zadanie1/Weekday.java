package org.example.typWyliczeniowy.zadanie1;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    boolean isWeekDay() {
        return this != SATURDAY && this != SUNDAY;
    }

    boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }
    void whichIsGreater(Weekday day){
        if(this.ordinal()<day.ordinal()){
            System.out.println("Before: " + day );
        }else {
            System.out.println("After: " + day);
        }
    }
}
