package Model.Models.Event;
import Model.Models.Entity;
import Model.Models.Human.Human;
import Model.Models.Place.Place;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Event implements Serializable, Entity {

    private int event_id;
    private String event_name;
    private List<Human> persons;
    private LocalDate event_date;
    private Place place;
    private int familyTreeId;

    public Event(int eventId, String event_name, LocalDate event_date, Place place, int familyTreeId, List<Human> persons) {
        this.event_id = eventId;
        this.event_name = event_name;
        this.event_date = event_date;
        this.persons = new ArrayList<>();
        this.persons.addAll(persons);
        this.place = place;
    }

    public int getId() {
        return event_id;
    }

    public void setId(int event_id) {
        this.event_id = event_id;
    }

    public String getEventName() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public LocalDate getEventDate() {
        return event_date;
    }

    public void setEvent_date(LocalDate event_date) {
        this.event_date = event_date;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setPerson(List<Human> persons) {
        this.persons.addAll(persons);
    }

    public List<Human> getPersons(){
        return this.persons;
    }

    @Override
    public String toString() {
        return "Event [event_id=" + event_id + ", event_name=" + event_name + ", persons=" + persons + ", event_date="
                + event_date + ", place=" + place + "]";
    }

    public void setFamilyTreeId(int familyTreeId) {
        this.familyTreeId = familyTreeId;
    }

    public int getFamilyTreeId() {
        return familyTreeId;
    }

    
}
