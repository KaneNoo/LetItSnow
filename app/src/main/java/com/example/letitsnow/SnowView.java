package com.example.letitsnow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

import java.util.Random;

public class SnowView extends View {

    static Paint paint = new Paint();
    static SnowFlake[] snowFlakes = new SnowFlake[100];


    public SnowView(Context context) {
        super(context);

    }

    public SnowView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        for (int i = 0; i < snowFlakes.length; i++) {
            snowFlakes[i] = new SnowFlake();
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.rgb(4, 51, 119));
        paint.setColor(Color.rgb(244, 251, 249));


        for (int i = 0; i < snowFlakes.length; i++) {
            canvas.drawCircle(snowFlakes[i].x, snowFlakes[i].y, snowFlakes[i].radius, paint);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        for(SnowFlake snowFlake : snowFlakes){
            snowFlake.snowFall();
        }

        invalidate();
        return true;
    }
}
