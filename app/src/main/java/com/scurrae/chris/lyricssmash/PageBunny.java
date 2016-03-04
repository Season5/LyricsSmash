package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageBunny extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bunny);

        TextView b1 = (TextView) findViewById(R.id.bunnyadisia);
        TextView b2 = (TextView) findViewById(R.id.bunnyligi);
        TextView b3 = (TextView) findViewById(R.id.bunnystars);

        Button b4 = (Button) findViewById(R.id.bunnymain);
        Button b5 = (Button) findViewById(R.id.bunnyprev);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.bunnyadisia:
                            Intent i = new Intent(getBaseContext(), Left.class);
                            startActivity(i);
                            break;
                        case R.id.bunnyligi:
                            Intent j = new Intent(getBaseContext(), Run.class);
                            startActivity(j);
                            break;
                        case R.id.bunnystars:
                            Intent k = new Intent(getBaseContext(), Single.class);
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
                        case R.id.bunnymain:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.bunnyprev:
                            Intent j = new Intent(getBaseContext(), Local.class);
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
