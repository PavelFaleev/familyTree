package Model.Service;

import Model.Models.FamilyTreeName.FamilyTree;

public interface InterFamilyTreeNameDb {

    void addFamilyTree(String familyTreeName);

    String getFamilyTreeNameById(int familyTreeId);

    void setFamilyTreeId(int familyTreeId);

    int getFamilyTreeId();
}
