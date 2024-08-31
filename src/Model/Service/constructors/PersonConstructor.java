package Model.Service.constructors;

import Model.Models.Gender;
import Model.Models.Human.Human;
import Model.Service.InterPersonConstructor;

import java.time.LocalDate;
import java.util.List;

public class PersonConstructor implements InterPersonConstructor<Human> {
    private Human entity;
    private int id;

    public PersonConstructor() {
        this.entity = new Human();
    }

    public PersonConstructor newEntity(Human human) {
        this.entity = human;
        return this;
    }

    public PersonConstructor newEntity(String firstName, String lastName, String familyName, Gender gender, int familyTreeId) {
        this.entity = new Human();
        setName(firstName, lastName, familyName, gender, familyTreeId);
        return this;
    }


    public PersonConstructor setName(String firstName, String lastName, String familyName, Gender gender, int familyTreeid) {
        entity.setId(id++);
        entity.setFirstName(firstName);
        entity.setLastName(lastName);
        entity.setGender(gender);
        entity.setFamilyName(familyName);
        entity.setFamilyTreeId(familyTreeid);
        return this;
    }

    public PersonConstructor setParent(Human father, Human mother) {
        entity.setFather(father);
        entity.setMother(mother);
        return this;
    }

    public PersonConstructor setSpouce(Human spouce) {
        entity.setSpouse(spouce);
        return this;
    }

    public PersonConstructor setBirthDate(LocalDate birthDate) {
        entity.setBirthDate(birthDate);
        return this;
    }

    public PersonConstructor setDeathDate(LocalDate deathDate) {
        entity.setDeathDate(deathDate);
        return this;
    }

    public PersonConstructor setChildren(Human children) {
        entity.setChildren(List.of(children));
        return this;
    }

    private void refresh() {
        this.entity = null;
    }

    @Override
    public Human build() {
        Human resHuman = entity;
        refresh();
        return resHuman;
    }
}
