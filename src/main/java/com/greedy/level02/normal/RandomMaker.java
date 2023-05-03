package com.greedy.level02.normal;

import java.util.Random;

public class RandomMaker {

    public int randomNumber(int min, int max) {
        return (int) (Math.random()*(max-min)+min);
    }
    public String randomUpperAlphabet(int length){
        if(length < 1){
            return "Error";
        }
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<length; i++){
            char c = (char)(rand.nextInt(26)+'A');
            sb.append(c);
        }
        return sb.toString();
    }

    public String rockPaperScissors(){
        String[] one = {"rock","paper","scissors"};
        Random rand = new Random();
        int i = (int)(rand.nextInt(3));
        return one[i];
    }

    public String tossCoin(){
        String[] coin = {"앞면","뒷면"};
        Random rand = new Random();
        int i = (int)(rand.nextInt(2));
        return coin[i];
    }
}
