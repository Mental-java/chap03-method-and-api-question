package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }
    public int sum1to10(){
        int a = 0;
        for(int i = 1; i <= 10; i++){
            a = a + i;
        }
        return a;
    }
    public void checkMaxNumber(int a, int b){
        int max = a;
        if(b > a) {
            max = b;
        }
        System.out.println("두 수 중 큰 수는 " + max + "이다.");
    }
    public int sumTwoNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    public int minusTwoNumber(int a, int b){
        int minus = a - b;
        return minus;
    }
}
