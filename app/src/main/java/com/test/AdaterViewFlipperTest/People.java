package com.test.AdaterViewFlipperTest;

import java.util.ArrayList;

public class People {
    private ArrayList<Person> people;

    public People(){
        people = new ArrayList<Person>();
        people.add(new Person("Joe", "Blogs"));
        people.add(new Person("Fred", "Flintstone"));
        people.add(new Person("GI", "Joe"));
    }

    public int getSize() {return this.people.size();}
    public Person getPerson(int position) {return this.people.get(position);}
}
