package com.turkcell.jokeapp;

import com.turkcell.jokeserver.*;

public class Main {

    public static void main(String [] args) {

        final int NUM_JOKES = 1;

        JokeServer s = new JokeServer();

        System.out.printf("JokeServer dan rastgele %d tane şaka %s\n", NUM_JOKES , s.name());
        System.out.println("-------------------------------------------");
        for (int i=0; i<NUM_JOKES; i++)
            System.out.println(s.getJoke() + "\n") ;

    }
}
