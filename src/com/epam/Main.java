package com.epam;

/**
 * Created by m18 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        MyTranslator en_ru = new MyTranslator();

        en_ru.addNewWord("Cat","Кот");
        en_ru.addNewWord("Caught","Поймал");
        en_ru.addNewWord("Hot","Горячий");

        System.out.println(en_ru.translate("Cat"));

    }
}
