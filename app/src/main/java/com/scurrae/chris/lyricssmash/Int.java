package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Int extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inter);

        TextView b1 = (TextView) findViewById(R.id.itrbey);
        TextView b2 = (TextView) findViewById(R.id.itrjay);
        TextView b3 = (TextView) findViewById(R.id.itrkirk);

        Button b4 = (Button) findViewById(R.id.itrprev);
        Button b5 = (Button) findViewById(R.id.itrmain);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.itrbey:
                            Intent i = new Intent(getBaseContext(), PageEsty.class);
                            startActivity(i);
                            break;
                        case R.id.itrjay:
                            Intent j = new Intent(getBaseContext(), PageBahati.class);
                            startActivity(j);
                            break;
                        case R.id.itrkirk:
                            Intent k = new Intent(getBaseContext(), PageBunny.class);
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
                        case R.id.itrprev:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.itrmain:
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
