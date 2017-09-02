package com.example.gouree.blinktextanimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Create objects of Button,Textview and animation class
    Button b1;
    TextView t1;
    Animation anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //store respective values in java objects
        b1= (Button)findViewById(R.id.button);
        t1=(TextView)findViewById(R.id.textView);

        //provide application context and name of the xml where the blink code is present
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);


        //on button click
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //textview object starts the animation
                t1.startAnimation(anim);
                anim.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                        //toast a message when animation is started
                        Toast.makeText(MainActivity.this, "Animation Started", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }
        });
    }
}
