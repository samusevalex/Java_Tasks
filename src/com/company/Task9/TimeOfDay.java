package com.company.Task9;

public enum TimeOfDay {

    Morning("Morning",6,10),
    Day("Day",11,17),
    Evenng("Evening",18,21),
    Night("Night",22,5);

    String timeOfDay=null;
    int startHour=0;
    int endHour=0;

    TimeOfDay(String timeOfDay, int startHour, int endHour){
        this.timeOfDay=timeOfDay;
        this.startHour=startHour;
        this.endHour=endHour;
    }

    @Override
    public String toString(){
        return "Время "+timeOfDay+" c "+startHour+" до "+endHour;
    }
}
