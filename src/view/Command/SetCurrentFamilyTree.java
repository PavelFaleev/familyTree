package view.Command;

import view.ConsoleUI;

public class SetCurrentFamilyTree extends Command{
    public SetCurrentFamilyTree(ConsoleUI consoleUI) {
        super(consoleUI);
        this.description = "set current family tree";
    }
    @Override
    public void execute() {
        consoleUI.SetCurrentFamilyTree();

    }
}
