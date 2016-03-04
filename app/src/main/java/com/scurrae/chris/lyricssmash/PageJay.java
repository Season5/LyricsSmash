package com.scurrae.chris.lyricssmash;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class PageJay extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jay);
        TextView b1 = (TextView) findViewById(R.id.jaycry);
        TextView b2 = (TextView) findViewById(R.id.jaydeath);
        TextView b3 = (TextView) findViewById(R.id.jayempire);

        Button b4 = (Button) findViewById(R.id.jayprev);
        Button b5 = (Button) findViewById(R.id.jaymain);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.jaycry:
                            Intent i = new Intent(getBaseContext(), Song.class);
                            startActivity(i);
                            break;
                        case R.id.jaydeath:
                            Intent j = new Intent(getBaseContext(), Dead.class);
                            startActivity(j);
                            break;
                        case R.id.jayempire:
                            Intent k = new Intent(getBaseContext(), Empire.class);
                            startActivity(k);
                            break;
                        default:
                            break;
                    }
                }


            });
        }

        Button[] button = {b4,b5};
        for (Button aButton : button) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.jayprev:
                            Intent i = new Intent(getBaseContext(), Int.class);
                            startActivity(i);
                            break;
                        case R.id.jaymain:
                            Intent j = new Intent(getBaseContext(), Main.class);
                            startActivity(j);
                            break;
                        default:
                            break;
                    }
                }


            });
        }
    }
}