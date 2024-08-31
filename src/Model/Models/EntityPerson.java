package Model.Models;

import java.time.LocalDate;
import java.util.List;

public interface EntityPerson<T> extends Entity {

    void setFirstName(String first_name);

    void setLastName(String last_name);

    void setFamilyName(String family_name);

    void setGender(Gender gender);

    String getFirstName();

    String getLastName();

    String getFamilyName();

    Gender getGender();

    void setBirthDate(LocalDate birth_date);

    void setDeathDate(LocalDate death_date);

    LocalDate getBirthDate();

    LocalDate getDeathDate();

    T getMother();

    T getFather();

    T getSpouse();

    List<T> getChildren();

    void setMother(T mother);

    void setFather(T father);

    void setSpouse(T spouse);

    void setChildren(List<T> children);

    int getAge();


}
