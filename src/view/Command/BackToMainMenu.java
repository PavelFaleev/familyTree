package view.Command;

import view.ConsoleUI;

public class BackToMainMenu extends Command {
    public BackToMainMenu(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "back to main menu";
    }

    @Override
    public void execute() {
        consoleUI.BackToMainMenu();
    }
}
