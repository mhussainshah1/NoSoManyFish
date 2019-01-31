package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * You are going to write an application that simulates a dating service. It does not take any input.  Read through the
 * entire assignment and PLAN your solution before you code it!
 * <p>
 * You will start with a pre-set list of people (make 6 of them, 3 male, 3 female).
 * <p>
 * You are going to select 2 people at random from a list and match them up. If a person gets matched up with
 * him/herself, they are free on Saturday night.
 * <p>
 * Do this for 10 interations, numbering the interactions by the DATES (see below).
 * <p>
 * At the end of the interaction, you should be able to list:
 * - The people who went out on dates, and who they went out with. How many dates did each person go on?
 * <p>
 * Done already?
 * Add additional scenarios that you can keep track of - for example "Jack tipped over a glass during a date with Mary".
 * They should also be randomly generated, and should be a list.
 */
public class Main {
    static Map<Person, List<Person>> date = new HashMap<>();
    static List<String> partnerList = new ArrayList<>();

    public static void main(String[] args) {
        //You will start with a pre-set list of people (make 6 of them, 3 male, 3 female).
        List<Person> people = new ArrayList<>();
        people.add(new Person("Male", "Simon"));
        people.add(new Person("Male", "Michael"));
        people.add(new Person("Male", "John"));
        people.add(new Person("Female", "Lisa"));
        people.add(new Person("Female", "Sarah"));
        people.add(new Person("Female", "Melanie"));

        List<Person> matchList;

        for (int i = 1; i < 11; i++) {
            matchList = new ArrayList<>();
            int index1 = 0, index2 = 0;

            while (index1 == index2) {
                index1 = (int) (Math.random() * people.size());
                index2 = (int) (Math.random() * people.size());
            }
            // System.out.println(index1 +" "+index2);

            matchList.add(people.get(index1));
            matchList.add(people.get(index2));

            Person first = matchList.get(0);
            Person second = matchList.get(1);

            List<Person> partners = matchList.get(0).getPartners();//new ArrayList<>();
            if (!isDuplicates(second, partners)) {
                partners.add(second);
            }

            date.put(first, partners);
            for (Person partner : partners) {
                System.out.println(first.getName() + " " + partner.getName());
            }

            //test
            System.out.println("\nPrinting Hash Map\n");
            for (Person key : date.keySet()) {
                System.out.printf("%s , %s \n", key.getName(), date.get(key));
            }


            //String value = date.get(first);
            //System.out.println(value);
//            if (date.containsKey(first) && value.equals(second)) {
//                System.out.printf("%s is free Saturday night \n", first);
//            } else {
//                date.put(first, second);
//            }
        }

//            if already matched
//            System.out.printf("%s is free Saturday night", first);
//            //else {
//            match.put();
//            date.put(matchPeople.get(0),matchPeople.get(1));
//            System.out.printf("%s , %s %n" ,key.getName(),  value.getName());
//            }
//            System.out.printf("%d %s asked %s out, and %s accepted%n",i,first,second,second);
//            String[] text = {"played chess with",
//                    "visited ",
//                    "went to dinner with",
//                    "tipped over a glass during a date with",
//                    "saw a movie with",
//                    "played chess with",
//                    "went to a meetup with"};
//            for (int k = 0; k < 3; k++) {
//                int index = (int) (Math.random() * text.length);
//                System.out.printf("%s %s %s %n",first,text[k],second);
//            }

    }

    public static boolean isDuplicates(Person person, List<Person> partners) {
        for (Person p : partners) {
            if (p.equals(person)) {
                return true;
            }
        }
        return false;//CODE!!!
    }
}
