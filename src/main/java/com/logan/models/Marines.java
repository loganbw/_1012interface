package com.logan.models;

import com.logan.Solider;
import com.logan.interfaces.Fighting;
import com.logan.interfaces.Shooting;

public class Marines extends Solider implements Fighting, Shooting {

    public Marines(String name, String rank, int dogTags) {
        super(name, rank, dogTags);
    }

    public String speak() {
        String speak = "We Are shadows in the night";
        return speak;
    }

    public void fight() {
        String fight = "*left hook, right jab*";

    }

    public void Shooting() {
        String shoot = "rrrtatatatataataatattaatttaaa.....ssssss";
    }
}
