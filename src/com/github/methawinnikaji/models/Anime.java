package com.github.methawinnikaji.models;

public abstract class Anime {

    private final String name;
    private final String date;

    public Anime(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getDetails() {
        StringBuilder details = new StringBuilder();
        boolean firstTime = true;

        for (String lore : details()) {
            if (firstTime) {
                details.append(lore);
                firstTime = false;
            } else {
                details.append("\n").append(lore);
            }
        }

        return details.toString();
    }

    public abstract String[] details();
}
