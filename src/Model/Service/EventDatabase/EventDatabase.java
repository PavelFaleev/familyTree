package Model.Service.EventDatabase;

import Model.Models.Event.Event;
import Model.Models.Human.Human;
import Model.Service.OriginalDatabase;

public class EventDatabase extends OriginalDatabase<Event> {

    public EventDatabase() {
        super();
    }

    @Override
    public String getDatabaseName() {
        return "event-database";
    }

    public Event getBornEventByHuman(Human human){
        for (Event event : objectList) {
            if (event.getPersons()==human && event.getEventName()=="born Human" ) {
                return event;
            }            
        }
        System.out.println("Event not found");
        return null;
    }

}
