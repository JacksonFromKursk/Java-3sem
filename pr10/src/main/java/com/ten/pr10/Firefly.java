package com.ten.pr10;

import org.springframework.stereotype.Component;

@Component
public class Firefly implements Lighter {
    @Override
    public void toLight() {
        System.out.println("Я светлячок");
    }
}
