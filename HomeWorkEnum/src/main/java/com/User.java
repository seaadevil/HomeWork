package com;

public class User {
    private String name;
    private Emotions emotions;

    public User(Emotions emotions, String name) {
        this.emotions = emotions;
        this.name = name;
    }

    public Emotions getEmotions() {
        return emotions;
    }

    public void setEmotions(Emotions emotions) {
        this.emotions = emotions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "emotions=" + emotions +
                ", name='" + name + '\'' +
                '}';
    }
}
