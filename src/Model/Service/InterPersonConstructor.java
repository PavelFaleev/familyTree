package Model.Service;

import Model.Models.EntityPerson;
import Model.Models.Gender;

import java.time.LocalDate;

public interface InterPersonConstructor<T extends EntityPerson<T>> {

    public InterPersonConstructor<T> newEntity(T person);

    public InterPersonConstructor<T> newEntity(String firstName, String lastName, String familyName, Gender gender, int familyTreeId);

    public InterPersonConstructor<T> setName(String firstName, String lastName, String familyName, Gender gender, int familyTreeid);

    public InterPersonConstructor<T> setParent(T father, T mother);

    public InterPersonConstructor<T> setSpouce(T spouce);

    public InterPersonConstructor<T> setBirthDate(LocalDate birthDate);

    public InterPersonConstructor<T> setDeathDate(LocalDate deathDate);

    public InterPersonConstructor<T> setChildren(T children);

    public T build();
}

