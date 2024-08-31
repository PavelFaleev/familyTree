package view.Command;

import view.ConsoleUI;

public class SortHumanByName extends Command {
    public SortHumanByName(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "sort human by name";
    }

    @Override
    public void execute() {
        consoleUI.SortHumanByName();
    }
}
