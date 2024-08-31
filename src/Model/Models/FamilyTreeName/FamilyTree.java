package Model.Models.FamilyTreeName;

public class FamilyTree {
    private int familyTreeId;
    private String name;
    
    public FamilyTree(int familyTreeId, String name) {
        this.familyTreeId = familyTreeId;
        this.name = name;
    }

    public int getFamilyTreeId() {
        return familyTreeId;
    }

    public void setFamilyTreeId(int familyTreeId) {
        this.familyTreeId = familyTreeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    

}
