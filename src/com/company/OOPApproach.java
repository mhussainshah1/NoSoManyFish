package com.company;

import java.util.ArrayList;
import java.util.List;

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
public class OOPApproach {
    public static void main(String[] args) {
        //You will start with a pre-set list of people (make 6 of them, 3 male, 3 female).
        List<Person> people = new ArrayList<>();
        people.add(new Person("Male", "Simon"));
        people.add(new Person("Male", "Michael"));
        people.add(new Person("Male", "John"));
        people.add(new Person("Female", "Lisa"));
        people.add(new Person("Female", "Sarah"));
        people.add(new Person("Female", "Melanie"));

        List<String> history ;
        Person first, second;
        int index1 , index2 , index;
        for (int i = 1; i < 11; i++) {
            index1 = 0;
            index2 = 0;
            while (index1 == index2) {
                index1 = (int) (Math.random() * people.size());
                index2 = (int) (Math.random() * people.size());
            }
            //System.out.println(index1 +" "+index2);

            first = people.get(index1);
            second = people.get(index2);

            if (first.isDated(second) || second.isDated(first)) {
                System.out.printf("%s is free Saturday night\n", first.getName());
            } else {
                first.setPartner(second);
                second.setPartner(first);
                //System.out.printf("%s\t%s %n", first.getName(), second.getName());

                history = new ArrayList<>();
                System.out.printf("%d %s asked %s out, and %s accepted.\n", i, first.getName(), second.getName(), second.getName());
                String[] text = {"played chess with",
                        "visited ",
                        "went to dinner with",
                        "tipped over a glass during a date with",
                        "saw a movie with",
                        "played chess with",
                        "went to a meetup with"};
                for (int k = 0; k < 3; ) {
                    index = (int) (Math.random() * text.length);
                    if (!history.contains(text[index])) {
                        history.add(text[index]);
                        System.out.printf("%s %s %s %n", first.getName(), text[index], second.getName());
                        k++;
                    }
                }
            }
        }
    }
}