package view.Command;

import view.ConsoleUI;

public class SaveFamilyTree extends Command {
    public SaveFamilyTree(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "save family tree";
    }

    @Override
    public void execute() {
        consoleUI.SaveFamilyTree();
    }
}
