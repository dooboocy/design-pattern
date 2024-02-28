package com.example;

import com.example.strategy_pattern.Duck;
import com.example.strategy_pattern.FlyRocketPowered;
import com.example.strategy_pattern.MallardDuck;
import com.example.strategy_pattern.ModelDuck;

public class Main {
    public static void main(String[] args) {
        Duck mallard =  new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        System.out.println("=============================");

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}