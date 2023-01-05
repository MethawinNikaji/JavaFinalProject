package com.github.methawinnikaji;


import com.github.methawinnikaji.models.Anime;
import com.github.methawinnikaji.models.Doraemon;

import java.util.HashMap;
import java.util.Map;

public final class AnimeRegister {

    private static final AnimeRegister instance =  new AnimeRegister();

    private final Map<String , Anime> byName = new HashMap<>();

    private AnimeRegister() {

        byName.put("Doraemon" , new Doraemon());
    }

    public Anime getByName(String name) {
        return byName.get(name);
    }

    public static AnimeRegister getInstance() {
        return instance;
    }
}
