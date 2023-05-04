package com.ohgiraffers.basic;

public class Calculator {

    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int i =0;
        for(int j=0; j<11; j++){
            i += j;
        }
        return i;
    }

    public int checkMaxNumber(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }

    }
    public int sumTwoNumber(int a, int b){
        return a+b;
    }
    public int minusTwoNumber(int a, int b){
        return a-b;
    }


}
