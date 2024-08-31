package view.Command;

import view.ConsoleUI;

public class PrintFamilyTreeEvent extends Command {
    public PrintFamilyTreeEvent(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "print family tree event";
    }

    @Override
    public void execute() {
        consoleUI.PrintFamilyTreeEvent();
    }
}
