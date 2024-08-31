package Model.Models;

import java.io.Serializable;

public interface Entity extends Serializable {
    public int getId();

    void setId(int id);

    void setFamilyTreeId(int familyTreeId);
    public int getFamilyTreeId();
}
