package com.example.strategy_pattern;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("꽥!");
    }
}
