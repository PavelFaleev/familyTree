package presenter;

import Model.Models.Gender;
import Model.Models.Event.Event;
import Model.Models.Human.Human;
import Model.Service.EventDatabase.EventDatabase;
import Model.Service.FamilyTreeNameDatabase.FamilyTreeNameDatabase;
import Model.Service.HumanDatabase.HumanDatabase;
import Model.Service.InterFamilyTreeNameDb;
import Model.Service.OriginalDatabase;
import Model.Service.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {

    private View view;
    private final Service service;


    public Presenter(View view) {
        OriginalDatabase<Human> humanDb = new HumanDatabase();
        OriginalDatabase<Event> eventDb = new EventDatabase();
        InterFamilyTreeNameDb familyTreeDb = new FamilyTreeNameDatabase();
        this.view = view;
        this.service = new Service(humanDb, eventDb, familyTreeDb);
    }

//create
    public void CreateNewTree(String familyTreeName) {
        service.CreateNewTree(familyTreeName);
    }

    public int getLastHumanId(){
        return service.getLastHuman();
    }

    public void SetCurrentFamilyTree(int familyTreeId){
        service.SetCurrentTree(familyTreeId);
    }

    public void BornHuman(String name, String lastname, String familyName, LocalDate birthday, String address, Gender gender) {
        service.BornHuman(name, lastname, familyName, birthday, address, gender);
    }

    public void WendingHuman(int wideId, int husbandId, LocalDate wendingDate, String placeName) {
        service.WendingHuman(wideId, husbandId, wendingDate, placeName);
    }

    public void SetParent(int humanId, int fatherId, int motherId) {
        service.SetParent(humanId, fatherId, motherId);
    }

    public void DiedHuman(int id, LocalDate deathDate, String placeName) {
        service.DeadHuman(id, deathDate, placeName);
    }

    public void UpdateEvent(int eventId, String event_name, LocalDate event_date, String placeName) {
        service.UpdateEvent(eventId, event_name, event_date, placeName);
    }

    //remove

    //print

    public void PrintFamilyTreeHuman() {
        service.PrintFamilyTreeHuman();
    }

    public void PrintEventInFamilyTree() {
        service.PrintEventInFamilyTree();
    }

    public void PrintCurrentHuman(int humanId){
        service.PrintCurentHuman(humanId);
    }

    public void PrintCurrentEvent(int eventId){
        service.PrintCurentEvent(eventId);
    }

    //sort
    public void sortHumanByName() {
        service.SortHumanByName();
    }

    public void SortHumanByAge() {
        service.SortHumanByAge();
    }

    public void SortHumanById() {
        service.SortHumanById();
    }

    //save load

    public void SaveFamilyTree(String filePatchHuman, String filePatchEvent) {
        service.SaveFamilyTree(filePatchHuman, filePatchEvent);
    }

    public void LoadFamilyTree(String filePatch) {
        service.LoadFamilyTree(filePatch);
    }
}
