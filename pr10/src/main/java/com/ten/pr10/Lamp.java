package com.ten.pr10;

import org.springframework.stereotype.Component;

@Component
public class Lamp implements Lighter {
    @Override
    public void toLight() {
        System.out.println("Любишь читать по ночам?");
    }
}
