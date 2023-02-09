package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        HashMap<String, Integer> dictionary = new HashMap<>();
        for (String s : sanitize(sentence)) {
            if (!s.isEmpty()){
                Integer integer = dictionary.get(s);
                dictionary.put(s, integer == null ? 1 : integer + 1);
            }
        }
        return dictionary;
    }
    private String[] sanitize(String sentence){
        return sentence
                .toLowerCase()
                .replaceAll("\\.", "")
                .replaceAll(",","")
                .trim()
                .split("\\s");
    }
}
