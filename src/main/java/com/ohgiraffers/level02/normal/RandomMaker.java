package com.ohgiraffers.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max){
        int random = (int)(Math.random() * (max-min)) + min;
        return random;
    }
    public static String randomUpperAlpabet(int length){
        char [] arr = new char[10];
        for(int i = 0; i< arr.length; i++) {
            arr[i] = (char)(Math.random()*26 + 'A');
        }
        return new String(arr);
    }
    public static String rockPaperScissors(){
        int x = (int)(Math.random()*3);
        String str = " ";
        if(x==0){
            str = "가위";
        }else if(x==1){
            str = "바위";
        }else if(x==2){
            str = "보";
        }
        return str;
    }
    public static String tossCoin(){
        int x = (int)(Math.random()*2);
        String str = " ";
        if(x==0) {
            str = "앞면";
        }else{
            str = "뒷면";
        }
        return str;
    }
}
