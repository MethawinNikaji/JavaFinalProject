package com.github.methawinnikaji.models;

public abstract class Anime {

    private final String name;
    private final String date;
    private final Genre genre;

    public Anime(String name, String date , Genre genre) {
        this.name = name;
        this.date = date;
        this.genre = genre;
    }

    public boolean isAvailable(Platform platform) {

        for (Platform pf : platforms())
            if (pf.equals(platform))
                return true;

        return false;
    }

    public Genre getGenre() {
        return genre;
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

    public abstract Platform[] platforms();

    public abstract String[] details();
}