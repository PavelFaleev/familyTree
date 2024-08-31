package view.Command;

import view.ConsoleUI;

public class LoadFamilyTree extends Command {
    public LoadFamilyTree(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "load family tree";
    }

    @Override
    public void execute() {
        consoleUI.LoadFamilyTree();
    }
}
