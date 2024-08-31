package view.Command;

import view.ConsoleUI;

public class PrintHuman extends Command {

    public PrintHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "print human";
    }

    @Override
    public void execute() {
        consoleUI.PrintCurrentHuman();
    }
}
