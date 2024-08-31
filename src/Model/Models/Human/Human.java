package Model.Models.Human;

import Model.Models.EntityPerson;
import Model.Models.Gender;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Human implements Serializable, EntityPerson<Human> {

    private Gender gender;
    private int human_id;
    private String first_name;
    private String last_name;
    private String family_name;
    private LocalDate birth_date;
    private LocalDate death_date;
    private Human mother;
    private Human father;
    private Human spouse;
    private List<Human> children;
    private int familyTreeId;
    // private List<model.Person.Place> places;
    


    public Human(
            String first_name,
            String last_name,
            String family_name,
            LocalDate birth_date,
            LocalDate death_date,
            Gender gender,
            Human father,
            Human mother,
            Human spouse,
            List<Human> children,
            int familyTreeId
            ) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.family_name = family_name;
        this.birth_date = birth_date;
        this.death_date = death_date;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.spouse = spouse;
        this.children = children;
        this.familyTreeId = familyTreeId;
    }
 
    public Human() {
        this.children = new ArrayList<>();
    }
   
    @Override
    public String toString() {
        return "Human{" +
                "human_id=" + human_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", family_name='" + family_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", death_date='" + death_date + '\'' +
                ", gender=" + gender +
                ", mother=" + getMotherFullName() +
                ", father=" + getFatherFullName() +
                ", spouse=" + getSpouseFullName() +
                ", children=" + getChildrenFullName() +
                '}';
    }
   
    private String getMotherFullName() {
        if (getMother() == null) {
            return "not information";
        } else {
            return mother.getFirstName() + " " + mother.getLastName();
        }
    }

    private String getFatherFullName() {
        if (getFather() == null) {
            return "not information";
        } else {
            return father.getFirstName() + " " + father.getLastName();
        }
    }

    private String getSpouseFullName() {
        if (getSpouse() == null) {
            return "single/divorced";
        } else {
            return spouse.getFirstName() + " " + spouse.getLastName();
        }
    }

    private String getChildrenFullName() {
        if (getChildren() == null) {
            return "not information/children";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Human human : children) {
                sb.append(human.getFirstName() + " " + human.getLastName() + " ");
            }
            return sb.toString();
        }
    }

    public int getId() {
        return human_id;
    }

    public void setId(int human_id) {
        this.human_id = human_id;
    }

    public String getFirstName() {
        return first_name;
    }


    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public String getFamilyName() {
        return family_name;
    }

    public void setFamilyName(String family_name) {
        this.family_name = family_name;
    }

    public LocalDate getBirthDate() {
        return birth_date;
    }

    public void setBirthDate(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public LocalDate getDeathDate() {
        return death_date;
    }

    public void setDeathDate(LocalDate death_date) {
        this.death_date = death_date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getSpouse() {
        return spouse;
    }

    public void setSpouse(Human spouse) {
        this.spouse = spouse;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children.addAll(children);
    }

    public int getAge() {
        if (death_date != null) {
            return death_date.getYear() - birth_date.getYear();
        } else {
            return LocalDate.now().getYear() - birth_date.getYear();
        }
    }

    public int getFamilyTreeId() {
        return familyTreeId;
    }

    public void setFamilyTreeId(int familyTreeId) {
        this.familyTreeId = familyTreeId;
    }
}

