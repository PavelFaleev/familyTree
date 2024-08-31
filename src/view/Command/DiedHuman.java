package view.Command;

import view.ConsoleUI;

public class DiedHuman extends Command{
    public DiedHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "died human";
    }

    @Override
    public void execute() {
        consoleUI.DiedHuman();
    }
}
