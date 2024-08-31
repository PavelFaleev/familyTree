package view.Command;

import view.ConsoleUI;

public class SortHumanByAge extends Command{
    public SortHumanByAge(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "sort human by age";
    }
    @Override
    public void execute() {
        consoleUI.SortHumanByAge();
    }
}
