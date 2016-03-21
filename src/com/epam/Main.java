package com.epam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by m18 on 18.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String m = sc.nextLine();

        MyTranslator en_ru = new MyTranslator();

        en_ru.addNewWord("cat","кот");
        en_ru.addNewWord("caught","поймал");
        en_ru.addNewWord("mouse","мишь");

        System.out.println(en_ru.translate(m));

    }
}
