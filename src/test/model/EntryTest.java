package test.model;

import java.util.Date;

public class EntryTest {
    private Date date;
    private String makeAndModel;
    private String identity;
    private LocationTest location;
    private TypeOfTimeTest typeOfTime;
    private FlightConditionTest condition;
    private int landings;
    private int totalDuration;
    private String comments;

    public EntryTest(Date date, String makeAndModel, String identity, LocationTest location,
                     TypeOfTimeTest typeOfTime, FlightConditionTest condition, int landings,
                     int totalDuration, String comments) {
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

    public LocationTest getLocation() {
        return location;
    }

    public TypeOfTimeTest getTypeOfTime() {
        return typeOfTime;
    }

    public FlightConditionTest getCondition() {
        return condition;
    }

    public int getLandings() {
        return landings;
    }

    public int getTotalDuration() {
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

    public void setLocation(LocationTest location) {
        this.location = location;
    }

    public void setTypeOfTime(TypeOfTimeTest typeOfTime) {
        this.typeOfTime = typeOfTime;
    }

    public void setCondition(FlightConditionTest condition) {
        this.condition = condition;
    }

    public void setLandings(int landings) {
        this.landings = landings;
    }

    public void setTotalDuration(int totalDuration) {
        this.totalDuration = totalDuration;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
