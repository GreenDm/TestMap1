package com.epam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by m18 on 18.03.2016.
 */
public class MyTranslator {

    private Map <String,String> dictionary = new HashMap<>();


    public void addNewWord(String en, String ru){

    dictionary.put(en,ru);

    }

public String translate(String en){

    StringBuilder result = new StringBuilder();
    String[] m = en.split(" ");
    for (int i = 0; i < m.length; i++) {
        result.append(dictionary.get(m[i]) + " ");
    }
    return result.toString();
}
}
