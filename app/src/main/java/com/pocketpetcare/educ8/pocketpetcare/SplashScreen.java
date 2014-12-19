package com.pocketpetcare.educ8.pocketpetcare;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;


public class SplashScreen extends Activity {

    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        Drawable d=getResources().getDrawable(R.drawable.pocketpatternlng);
        getActionBar().setBackgroundDrawable(d);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent proceedToMain = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(proceedToMain);

                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }


}
