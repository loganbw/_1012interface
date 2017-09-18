package com.logan.models;

import com.logan.Solider;
import com.logan.interfaces.Fighting;
import com.logan.interfaces.Shooting;

public class Army extends Solider implements Fighting, Shooting {


    public Army(String name, String rank, int dogTags) {
        super(name, rank, dogTags);
    }

    public String speak() {
        String speak = "ten hut!";
        return speak;
    }

    public void fight() {
        String fight = "punch";

    }

    public void Shooting() {
        String shoot = "pew pew";
    }
}