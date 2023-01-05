package com.github.methawinnikaji.models;

public class Doraemon extends Anime {

    public Doraemon() {
        super("Doraemon", "1-1-1995");
    }

    @Override
    public String[] details() {
        return new String[] {
                "Doraemon created by Fujiko",
                "and bra bra bra",
                "then bra bra bra"
        };
    }
}

