package view.Command;

import view.ConsoleUI;

public class PrintFamilyTreeHuman extends Command {
    public PrintFamilyTreeHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "print family tree human";
    }

    @Override
    public void execute() {
        consoleUI.PrintFamilyTreeHuman();
    }
}
