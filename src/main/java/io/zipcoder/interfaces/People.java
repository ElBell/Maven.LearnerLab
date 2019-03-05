package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class People<E extends Person> {
    private List<E> personList = new ArrayList<>();

    public void add(E person) {
        if(person != null) {
            personList.add(person);
        }
    }

    public E findById(long id) {
        for (E person: personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void remove(E person) {
        if(person != null) {
            personList.remove(person);
        }
    }

    public void remove(long id) {
        personList.remove(findById(id));
    }

    public int getCount() {
        return personList.size();
    }

    public E[] getArray(E[] array) {
        return personList.toArray(array);
    }

    public E[] getArray() {
        return (E[])personList.toArray(new Person[0]);
    }

    public void removeAll() {
        personList.clear();
    }

    public boolean containsAll(String... strings) {
        List<String> namesList = Arrays.asList(strings);
        List<String> containedNames = new ArrayList<>();
        Arrays.stream(getArray()).forEach(person -> containedNames.add(person.getName()));
        return containedNames.containsAll(namesList);
    }
}
