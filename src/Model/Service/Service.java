package Model.Service;

import Model.Filehandler.FileHandler;
import Model.Models.Event.Event;
import Model.Models.Gender;
import Model.Models.Human.Human;
import Model.Service.EventDatabase.EventDatabase;
import Model.Service.HumanDatabase.HumanDatabase;
import Model.Service.constructors.EventConstructor;
import Model.Service.constructors.PersonConstructor;

import java.time.LocalDate;
import java.util.List;

public class Service {

    private OriginalDatabase<Human> humanDb;
    private OriginalDatabase<Event> eventDb;
    private InterFamilyTreeNameDb familyTreeDb;
    private InterPersonConstructor<Human> humanConstructor;
    private InterEventConstructor eventConstructor;

    public Service(OriginalDatabase<Human> humanDb, OriginalDatabase<Event> eventDb, InterFamilyTreeNameDb familyTreeDb) {
        this.humanConstructor = new PersonConstructor();
        this.eventConstructor = new EventConstructor();
        this.humanDb = humanDb;
        this.eventDb = eventDb;
        this.familyTreeDb = familyTreeDb;

    }

// create FamilyTree

    public void CreateNewTree(String familyTreeName) {
        this.familyTreeDb.addFamilyTree(familyTreeName);
    }

    public void SetCurrentTree(int familyTreeId) {
        this.familyTreeDb.setFamilyTreeId(familyTreeId);
    }

//createHuman
    public void BornHuman(String firstName, String lastName, String familyName, LocalDate birthDate, String placeName, Gender gender) {
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        Human human = humanConstructor.newEntity(firstName, lastName, familyName, gender, familyTreeid)
                                .setBirthDate(birthDate)
                                .build();
        Event event = eventConstructor.bornEvent(birthDate, placeName, familyTreeid, human);
        this.humanDb.addEntity(human);
        this.eventDb.addEntity(event);
    }

    public void SetParent(int humanId, int fatherId, int motherId) {
        Human father = (Human) this.humanDb.getById(fatherId);
        Human mother = (Human) this.humanDb.getById(motherId);
        Human human = (Human) this.humanDb.getById(humanId);
        this.humanConstructor.newEntity(human)
                            .setParent(father, mother)
                            .build();
        this.humanConstructor.newEntity(father).setChildren(human).build();
        this.humanConstructor.newEntity(mother).setChildren(human).build();
        this.eventConstructor.updateEvent(((EventDatabase) eventDb).getBornEventByHuman(human), null, null, null, father, mother);
    }

    public void WendingHuman(int wideId, int husbandId, LocalDate wendingDate, String placeName) {
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        Human wife = (Human) this.humanDb.getById(wideId);
        Human husband = (Human) this.humanDb.getById(husbandId);
        Event event = this.eventConstructor.wendingEvent(wendingDate, placeName, familyTreeid, wife, husband);
        this.eventDb.addEntity(event);
    }

    public void DeadHuman(int humanId, LocalDate deathDate, String placeName){
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        Human human = (Human) this.humanDb.getById(humanId);
        this.humanConstructor.newEntity(human).setDeathDate(deathDate).build();
        Event event = eventConstructor.deadEvent(deathDate, placeName,familyTreeid, human);
        this.eventDb.addEntity(event);
    }

    public void UpdateEvent(int eventId, String event_name, LocalDate event_date, String placeName){
        this.eventConstructor.updateEvent((Event) this.eventDb.getById(eventId), event_name, event_date, placeName);
    }

    public void CreateEvent(String eventName, LocalDate eventDate, String eventPlace, Human...persons){
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        Event event = this.eventConstructor.newEvent(eventName, eventDate, eventPlace, familyTreeid, List.of(persons));
        this.eventDb.addEntity(event);
    }

    public int getLastHuman(){
        return ((HumanDatabase) this.humanDb).getLastHuman();
    }

// remove




// print

    public void PrintFamilyTreeHuman() {
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        System.out.println(familyTreeid);
        System.out.println(this.familyTreeDb.getFamilyTreeNameById(familyTreeid));
        for (Human human : this.humanDb.getFamilyTree(familyTreeid)) {
            System.out.println(human);
        }
    }

    public void PrintEventInFamilyTree() {
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        System.out.println(familyTreeid);
        System.out.println(this.familyTreeDb.getFamilyTreeNameById(familyTreeid));
        for (Event event : this.eventDb.getFamilyTree(familyTreeid)) {
            System.out.println(event);
        }
    }

    public void PrintCurentHuman(int humanId) {
        System.out.println((Human) this.humanDb.getById(humanId));
    }

    public void PrintCurentEvent(int eventId) {
        System.out.println((Event) this.eventDb.getById(eventId));
    }

// sort
    public void SortHumanByName() {
        ((HumanDatabase) this.humanDb).sortHumanByName();
    }

    public void SortHumanByAge() {((HumanDatabase) this.humanDb).sortHumanByAge();
    }

    public void SortHumanById() {
        ((HumanDatabase) this.humanDb).sortHumanById();
    }
// save load
    public void SaveFamilyTree(String filePatchHumandb, String filePatchEventdb) {
        int familyTreeid = this.familyTreeDb.getFamilyTreeId();
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFilePath(filePatchHumandb);
        fileHandler.write((HumanDatabase) this.humanDb.getFamilyTree(familyTreeid));
        FileHandler fileHandlerEvent = new FileHandler();
        fileHandlerEvent.setFilePath(filePatchEventdb);
        fileHandlerEvent.write((EventDatabase) this.eventDb.getFamilyTree(familyTreeid));
    }

    public void LoadFamilyTree (String filePatch){
        FileHandler fileHandler = new FileHandler();
        fileHandler.setFilePath(filePatch);
        fileHandler.read();
    }
}
