package view.Command;

import view.ConsoleUI;

public class Exit extends Command {
    public Exit(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "exit";
    }

    @Override
    public void execute() {
        this.consoleUI.Exit();
    }
}
