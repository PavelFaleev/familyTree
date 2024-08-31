package view.Command;
import view.ConsoleUI;

public class BackToTreeMenu extends Command {
    public BackToTreeMenu(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "back to tree menu";
    }

    @Override
    public void execute() {
        consoleUI.backTreeMenu();
    }
}
