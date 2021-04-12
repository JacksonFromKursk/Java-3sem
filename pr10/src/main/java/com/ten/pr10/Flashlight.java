package com.ten.pr10;

import org.springframework.stereotype.Component;

@Component
public class Flashlight implements Lighter {
    @Override
    public void toLight() {
        System.out.println("Сейчас вылетит птичка");
    }
}
