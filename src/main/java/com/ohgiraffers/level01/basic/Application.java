package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.checkMethod();
        System.out.println("1부터 10의 합은 "+calc.sum1to100()+"입니다.");
        calc.checkMaxNumber(10,5);
        System.out.println("두 수의 합은 "+calc.sumTwoNumber(10,5)+"입니다.");
        System.out.println("두 수의 차는 "+calc.minusTwoNumber(10,5)+"입니다.");
    }
}
