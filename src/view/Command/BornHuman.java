package view.Command;

import view.ConsoleUI;

public class BornHuman extends Command {
    public BornHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "born human";
    }

    @Override
    public void execute() {
        consoleUI.BornHuman();
    }
}
