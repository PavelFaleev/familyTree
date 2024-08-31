import Model.Models.Gender;
import Model.Models.Event.Event;
import Model.Models.Human.Human;
import Model.Service.OriginalDatabase;
import Model.Service.Service;
import Model.Service.EventDatabase.EventDatabase;
import Model.Service.HumanDatabase.HumanDatabase;
import view.ConsoleUI;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//
//        Service service = 1 Service(humanDb, eventDb);
//
//
//        service.CreateNewTree();
//        service.BornHuman("Boris", "Test", "Test", LocalDate.of(1980, 1, 1), "Test", Gender.male);
//        service.BornHuman("Anna", "Test", "Test", LocalDate.of(1990, 1, 1), "Test", Gender.female);
//        service.WendingHuman(0, 1, LocalDate.of(2000, 1, 1), "placeWending");
//        service.BornHuman("Nikita", "Test", "Test", LocalDate.of(2001, 1, 1), "Test", Gender.male);
//        service.setParent(2, 0, 1);
//
//        service.SortHumanByName();
//        service.PrintFamilyTreeHuman();
//        service.SortHumanByAge();
//        service.PrintFamilyTreeHuman();

        ConsoleUI consoleUI = new ConsoleUI();
        consoleUI.start();
}
}