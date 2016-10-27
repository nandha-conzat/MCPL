package com.rd.kv.mcpl;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by COBURG DESIGN on 27-01-2016.
 */
public class Splash extends AppCompatActivity{
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        try {

            new Handler().postDelayed(new Runnable() {

				/*
				 * Showing splash screen with a timer. This will be useful when
				 * you want to show case your app logo / company
				 */

                @Override
                public void run() {
                    // This method will be executed once the timer is over
                    // Start your app main activity
                    try {
                        synchronized (this) {
                            // Wait given period of time or exit on touch
                            new Thread(new Runnable() {

                                @Override
                                public void run() {
                                    // TODO Auto-generated method stub
                                    try {
                                        //checkRegister();
                                        Thread.sleep(0);

                                    } catch (InterruptedException e) {
                                        // TODO Auto-generated catch block
                                        e.printStackTrace();
                                    }

                                }
                            }).start();
                            wait(1000);
                        }
                    } catch (InterruptedException ex) {
                    }
                    Intent i = new Intent(Splash.this,
                            Login.class);
                    startActivity(i);

                    finish();

                }
            }, SPLASH_TIME_OUT);
        } catch (OutOfMemoryError e) {
            Toast.makeText(
                    getApplicationContext(),
                    "Your phone memory is too low, free your cache memory and start the application",
                    Toast.LENGTH_LONG).show();
        }

    }
}
