package com.logan.models;

import com.logan.Solider;
import com.logan.interfaces.Fighting;
import com.logan.interfaces.Shooting;

public class Navy extends Solider implements Fighting, Shooting {

    public Navy(String name, String rank, int dogTags) {
        super(name, rank, dogTags);
    }

    public void fight() {
        String fight = "*right hook";

    }

    public void Shooting() {
        String shoot = "pew pew pew click";
    }

    public String speak() {
        String speak = "Never Give up NNNNNever SSSurender";
        return speak;
    }
}
