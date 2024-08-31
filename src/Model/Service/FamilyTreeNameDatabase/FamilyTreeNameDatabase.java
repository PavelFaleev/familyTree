package Model.Service.FamilyTreeNameDatabase;

import java.util.ArrayList;
import java.util.List;

import Model.Models.FamilyTreeName.FamilyTree;
import Model.Service.InterFamilyTreeNameDb;;


public class FamilyTreeNameDatabase implements InterFamilyTreeNameDb {

    private int familyTreeId;
    private List<FamilyTree> familyTreeNameDatabase;

    public FamilyTreeNameDatabase() {
        this.familyTreeNameDatabase = new ArrayList<>();
    }

    public void addFamilyTree(String familyTreeName){
        FamilyTree familyTree = new FamilyTree(familyTreeId++, familyTreeName);
        this.familyTreeNameDatabase.add(familyTree);
        setFamilyTreeId(familyTree.getFamilyTreeId());
    }

    public String getFamilyTreeNameById(int familyTreeId){
        for (FamilyTree familyTree : familyTreeNameDatabase) {
            if (familyTree.getFamilyTreeId() == familyTreeId) {
                return familyTree.getName();
            }
        }
        System.out.println("Family tree not found");
        return null;
    }

    public void setFamilyTreeId(int familyTreeId) {
        this.familyTreeId = familyTreeId;
    }

    public int getFamilyTreeId() {
        return familyTreeId;
    }
}
