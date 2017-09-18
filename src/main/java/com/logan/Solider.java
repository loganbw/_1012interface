package com.logan;

public abstract class Solider {

        private String name;
        private String rank;
        private int dogTags;

    public Solider(String name, String rank, int dogTags) {
        this.name = name;
        this.rank = rank;
        this.dogTags = dogTags;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getDogTags() {
        return dogTags;
    }

    public void sleep(){
        String sleep = "zzzzzzz";
    }
    public void eat(){
        String eat = "*chews*";
    }
    public void walk(){
        String walk = "stomp stomp";
    }
    public abstract String speak();



}
