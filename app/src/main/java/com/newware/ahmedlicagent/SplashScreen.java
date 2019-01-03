package com.newware.ahmedlicagent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);

        Splash obj = new Splash();
        obj.start();
    }


    class Splash extends  Thread
    {
        @Override
        public void run()
        {
            try
            {
                sleep(2000); //todo make it 5000
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            startActivity(new Intent(SplashScreen.this,MainActivity.class));
            SplashScreen.this.finish();
        }

    }
}
