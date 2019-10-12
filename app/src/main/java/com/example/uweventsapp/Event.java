package com.example.uweventsapp;

public class Event {
    private String Name;
    private String Subject;
    private String Date;
    private String Location;
    private String Time;
    private String Description;

    // event class that stores the information that will be gathered for each event
    public Event(String name, String sub, String date, String loc, String time, String des) {
        Name = name;
        Subject = sub;
        Date = date;
        Location = loc;
        Time = time;
        Description = des;
    }
    public Event() {

    }
    public String getName() {
        return Name;
    }
    public String getSubject() {
        return Subject;
    }
    public String getDate()
    {
        return Date;
    }
    public String getLocation() {
        return Location;
    }
    public String getTime() {
        return Time;
    }
    public String getDescription() {
        return Description;
    }

}
