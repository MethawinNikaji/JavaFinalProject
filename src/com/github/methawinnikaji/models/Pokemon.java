package com.github.methawinnikaji.models;

public class Pokemon extends Anime {
    public Pokemon() {
        super("Pokemon","1-1-1995",Genre.FANTASY);
    }

    @Override
    public String[] details() {
        return new String[]{
                "pokemon",
                "Is created by  satoshi tajiri ",
                "the manga was published in 1996 "
        };
    }
    @Override
    public Platform[] platforms() {
        return new Platform[]{
                Platform.BILIBILI,
                Platform.NETFLIX,
        };
    }
}
