package Model.Service.constructors;

import java.time.LocalDate;
import java.util.List;

import Model.Models.Event.Event;
import Model.Models.Human.Human;
import Model.Models.Place.Place;
import Model.Service.InterEventConstructor;

public class EventConstructor implements InterEventConstructor {
    private int id;
    private int placeId;

    @Override
    public Event newEvent(String event_name, LocalDate event_date, String placeName, int familyTreeId,
            List<Human> persons) {
            return new Event(id++, event_name, event_date, new Place(placeId++, placeName), familyTreeId, persons);
    }

    @Override
    public Event deadEvent(LocalDate event_date, String placeName, int familyTreeId, Human person) {
        return newEvent("died", event_date, placeName,familyTreeId, List.of(person));
    }

    @Override
    public Event bornEvent(LocalDate event_date, String placeName, int familyTreeId, Human... humans) {
        return newEvent("born Human", event_date, placeName,familyTreeId, List.of(humans));
    }

    @Override
    public Event wendingEvent(LocalDate event_date, String placeName, int familyTreeId, Human... person) {
        return newEvent("wending", event_date, placeName, familyTreeId, List.of(person));
    }

    @Override
    public void updateEvent(Event event, String eventName, LocalDate eventDate, String placeName, Human... persons) {
        if (eventName != null) event.setEvent_name(eventName);
        if (eventDate != null) event.setEvent_date(eventDate);
        if (placeName != null) event.setPlace(new Place(placeId++, placeName));
        // if (persons != null) event.setPerson(List.of(persons));
    }
}
