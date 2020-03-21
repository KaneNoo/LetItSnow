package com.example.letitsnow;

import java.util.Random;

public class SnowFlake {

    float x, y, velocity, radius;

    Random random = new Random();

    public SnowFlake(){
        this.x = random.nextInt(1080);
        this.y = random.nextInt(2000);
        this.velocity = random.nextInt(15) + 10;
        this.radius = random.nextInt(10) + 5;
    }


    public void snowFall(){
        y += velocity;
        x += velocity / 2;

        if(y > 2000) y = 0;
        if(x > 1100) x = 0;
    }

}
