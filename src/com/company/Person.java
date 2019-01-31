package com.company;

import java.util.List;

public class Person {

    private String name;
    private String gender;
    private Person partner; //current partner
    private List<Person> partners; //list of all people date with

    public Person() {
    }

    public Person(String gender, String name) {
        this.gender = gender;
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPartner() {
        return partner;
    }

    public List<Person> getPartners() {
        return partners;
    }

    public void setPartners(List<Person> partners) {
        this.partners = partners;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
        partners.add(partner);
    }
}
