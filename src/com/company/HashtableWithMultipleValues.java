package com.company;
//This is example from stackoverflow.com

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashtableWithMultipleValues {
    public static void main(String[] args) {
        // create our map
        Map<String, List<Person>> peopleByForename = new HashMap<>();

// populate it
        List<Person> people = new ArrayList<>();
        people.add(new Person("Male","Bob Smith"));
        people.add(new Person("Male","Bob Jones"));
        peopleByForename.put("Bob", people);

// read from it
        List<Person> bobs = peopleByForename.get("Bob");
        Person bob1 = bobs.get(0);
        Person bob2 = bobs.get(1);
    }
}
