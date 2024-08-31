package view.Command;

import view.ConsoleUI;

public class SortHumanById extends Command {
    public SortHumanById(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "sort human by id";
    }

    @Override
    public void execute() {
        consoleUI.SortHumanById();
    }
}
