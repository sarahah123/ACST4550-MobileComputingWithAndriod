package com.example.shansber.snowmanview;

/**
 * Created by shansber on 1/24/2017.
 */

//******************************************************************
//  Android version of the SmilingFace view
//******************************************************************


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.view.*;

import java.lang.Override;


public class SmilingFaceView extends View {
    private final int BASEX = 100;
    private final int BASEY = 150;
    private Paint paint = new Paint();
    private RectF oval = new RectF();


    public SmilingFaceView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setColor(Color.YELLOW);
        paint.setStyle(Style.FILL);
        oval.set(BASEX, BASEY, BASEX+80*3, BASEY+80*3);
        canvas.drawOval(oval, paint);    // Face
        oval.set(BASEX-5*3, BASEY+20*3, BASEX+90*3 - 5, BASEY+40*3);
        canvas.drawOval(oval, paint);    // Ears

        paint.setColor(Color.BLACK);
        paint.setStyle(Style.STROKE);
        oval.set(BASEX+20*3, BASEY+30*3, BASEX+35*3, BASEY+37*3);
        canvas.drawOval(oval, paint);    // Eye 1
        oval.set(BASEX+45*3, BASEY+30*3, BASEX+60*3, BASEY+37*3);
        canvas.drawOval(oval, paint);    // Eye 2

        paint.setStyle(Style.FILL);
        oval.set(BASEX+25*3, BASEY+31*3, BASEX+30*3, BASEY+36*3);
        canvas.drawOval(oval, paint);    // Pupil 1
        oval.set(BASEX+50*3, BASEY+31*3, BASEX+55*3, BASEY+36*3);
        canvas.drawOval(oval, paint);    // Pupil 2

        paint.setStyle(Style.STROKE);
        oval.set(BASEX+20*3, BASEY+25*3, BASEX+35*3, BASEY+32*3);
        canvas.drawArc(oval, 0, -180, false, paint);    // Eyebrow 1
        oval.set(BASEX+45*3, BASEY+25*3, BASEX+60*3, BASEY+32*3);
        canvas.drawArc(oval, 0, -180, false, paint);    // Eyebrow 2

        paint.setStyle(Style.STROKE);
        oval.set(BASEX+35*3, BASEY+40*3, BASEX+50*3, BASEY+50*3);
        canvas.drawArc(oval, 180, -180, false, paint);    // Nose
        oval.set(BASEX+20*3, BASEY+50*3, BASEX+60*3, BASEY+65*3);
        canvas.drawArc(oval, 180, -180, false, paint);    // Mouth

        paint.setTextSize(24);
        canvas.drawText("Always remember that you are unique!",
                BASEX-65, BASEY-15, paint);
        canvas.drawText("Just like everyone else.",
                BASEX-5, BASEY+270, paint);
    }
}
