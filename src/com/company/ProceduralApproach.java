package com.company;

import java.util.*;
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
public class ProceduralApproach {
    public static void main(String[] args) {

        //You will start with a pre-set list of people (make 6 of them, 3 male, 3 female).
        List<Person> people = new ArrayList<>();
        people.add(new Person("Male", "Simon"));
        people.add(new Person("Male", "Michael"));
        people.add(new Person("Male", "Jack"));
        people.add(new Person("Female", "Lisa"));
        people.add(new Person("Female", "Sarah"));
        people.add(new Person("Female", "Mary"));

        List<List<Integer>> pairList = new ArrayList<>();
        List<String> history ;
        int index1 = 0, index2 = 0;
        String first, second;

        for (int i = 1; i < 11; i++) {
            while (true) {
                //You are going to select 2 people at random from a list
                index1 = (int) (Math.random() * people.size());
                index2 = (int) (Math.random() * people.size());

                if (index1 == index2) {
                    continue;
                }
                Integer[] array = {index1, index2};
                Arrays.sort(array);
                List<Integer> pair = Arrays.asList(array);
                first = people.get(array[0]).getName();
                second = people.get(array[1]).getName();

                if (pairList.contains(pair)) {
                    System.out.printf("%s is free Saturday night \n", first);
                } else{
                    pairList.add(pair);
                    history = new ArrayList<>();
                    System.out.printf("%d %s asked %s out, and %s accepted\n",i,first,second,second);
                    String[] text = {"played chess with",
                            "visited ",
                            "went to dinner with",
                            "tipped over a glass during a date with",
                            "saw a movie with",
                            "played chess with",
                            "went to a meetup with"};

                    for (int k = 0; k < 3; ) {
                        int index = (int) (Math.random() * text.length);
                        if (!history.contains(text[index])) {
                            history.add(text[index]);
                            System.out.printf("%s %s %s %n", first, text[index], second);
                            k++;
                        }
                    }
                }
                break;
            }
        }
        System.out.println(pairList);

        //Bonus!
        //When people break up, they can never be paired up again.
    }
}