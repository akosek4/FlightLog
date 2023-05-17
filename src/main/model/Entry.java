package main.model;

import java.util.Date;

public class Entry {
    private Date date;
    private String makeAndModel;
    private String identity;
    private Location location;
    private TypeOfTime typeOfTime;
    private FlightCondition condition;
    private int landings;
    private double totalDuration;
    private String comments;

    public Entry(Date date, String makeAndModel, String identity, Location location,
                 TypeOfTime typeOfTime, FlightCondition condition, int landings,
                 double totalDuration, String comments) {
        this.date = date;
        this.makeAndModel = makeAndModel;
        this.identity = identity;
        this.location = location;
        this.typeOfTime = typeOfTime;
        this.condition = condition;
        this.landings =  landings;
        this.totalDuration = totalDuration;
        this.comments = comments;
    }

    //Getters and Setters

    public Date getDate() {
        return date;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public String getIdentity() {
        return identity;
    }

    public Location getLocation() {
        return location;
    }

    public TypeOfTime getTypeOfTime() {
        return typeOfTime;
    }

    public FlightCondition getCondition() {
        return condition;
    }

    public int getLandings() {
        return landings;
    }

    public double getTotalDuration() {
        return totalDuration;
    }

    public String getComments() {
        return comments;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setTypeOfTime(TypeOfTime typeOfTime) {
        this.typeOfTime = typeOfTime;
    }

    public void setCondition(FlightCondition condition) {
        this.condition = condition;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public void setTotalDuration(double totalDuration) {
        this.totalDuration = totalDuration;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
