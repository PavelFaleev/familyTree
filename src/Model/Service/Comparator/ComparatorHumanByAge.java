package Model.Service.Comparator;

import java.util.Comparator;

import Model.Models.Human.Human;

public class ComparatorHumanByAge implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
