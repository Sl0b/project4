package com.jokes;

import java.util.Random;

public class JokeProvider {

    private static String[] jokes = new String[]{
            "\"If you understand English, press 1. If you do not understand English, press 2.\"",
            "A computer lets you make more mistakes faster than any invention in human history – with the possible exceptions of handguns and tequila.",
            "If it weren't for C, we’d all be programming in BASI and OBOL.",
            "There are 10 types of people in the world: those who understand binary, and those who don't.",
            "In a world without fences and walls, who needs Gates and Windows?",
            "An SQL statement walks into a bar and sees two tables. It approaches, and asks \"may I join you?\"",
            "Man is the best computer we can put aboard a spacecraft… and the only one that can be mass produced with unskilled labor",
            "Lotteries are a tax on people who suck at math.",
            "Programmers are tools for converting caffeine into code."
    };

    public static String getJoke() {
        int size = jokes.length;
        Random random = new Random();
        int index = random.nextInt(size);
        return jokes[index];
    }
}
