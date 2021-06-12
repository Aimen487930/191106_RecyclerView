package com.aimenshahid.recyclerview_191106;

public class Person {
    int fooditems;
    String name;
    public Person(String name,int pp) {
        this.name = name;
        fooditems=pp;
    }

    public String getName()
    {
        return name;
    }

    public int getfooditems()
    {
        return fooditems;
    }

}