package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * You are going to write an application that simulates a dating service. It does not take any input.  Read through the
 * entire assignment and PLAN your solution before you code it!
 *
 * You will start with a pre-set list of people (make 6 of them, 3 male, 3 female).
 *
 * You are going to select 2 people at random from a list and match them up. If a person gets matched up with
 * him/herself, they are free on Saturday night.
 *
 * Do this for 10 interations, numbering the interactions by the DATES (see below).
 *
 * At the end of the interaction, you should be able to list:
 * - The people who went out on dates, and who they went out with. How many dates did each person go on?
 *
 * Done already?
 * Add additional scenarios that you can keep track of - for example "Jack tipped over a glass during a date with Mary".
 * They should also be randomly generated, and should be a list.
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Person> people = new ArrayList<>();
        people.add(new Person("Tolali","Male"));
        people.add(new Person("Muhammad","Male"));
        people.add(new Person("John","Male"));
        people.add(new Person("Alice","Female"));
        people.add(new Person("Tracy","Female"));
        people.add(new Person("Melanie","Female"));


    }
}
