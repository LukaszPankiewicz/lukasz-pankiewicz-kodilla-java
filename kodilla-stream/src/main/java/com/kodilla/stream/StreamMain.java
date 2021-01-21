package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.*;

import java.util.Locale;


public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("ABC", text -> "abc" + " Beauty");
        poemBeautifier.beautify("CBA", text -> "cba");
        poemBeautifier.beautify("CBA", text -> text + "cba" + text);
        poemBeautifier.beautify("java nie jest prosta", text -> text.toUpperCase());
        poemBeautifier.beautify("NIKT NIE MOWIL ZE JEST PROSTA", text -> text.toLowerCase());
        poemBeautifier.beautify("WKodilliMowiliZeJest", text -> String.valueOf(text.length()));
        poemBeautifier.beautify("Klamcy", text -> String.valueOf(text.getBytes()));



    }
}

