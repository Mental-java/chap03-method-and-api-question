package com.ohgiraffers.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("checkMethod 실행됨...");
    }
    public int sum1to100(){
         int sum = 0;
         for(int i = 1; i <=10; i++){
            sum += i;
         }
        return sum;
    }
    public void checkMaxNumber(int a, int b){
        if(a > b){
            System.out.println("더 큰수는 "+a+"입니다.");
        }else if(a < b){
            System.out.println("더 큰수는 "+b+"입니다.");
        }
    }
    public int sumTwoNumber(int a, int b){
        return a+b;
    }
    public int minusTwoNumber(int a, int b){
        return a-b;
    }
}
