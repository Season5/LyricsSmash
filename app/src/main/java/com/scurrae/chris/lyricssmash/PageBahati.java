package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageBahati extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bahati);

        TextView b1 = (TextView) findViewById(R.id.bahalove);
        TextView b2 = (TextView) findViewById(R.id.bahamacho);
        TextView b3 = (TextView) findViewById(R.id.bahamum);

        Button b4 = (Button) findViewById(R.id.bahamain);
        Button b5 = (Button) findViewById(R.id.bahaprev);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.bahalove:
                            Intent i = new Intent(getBaseContext(), Lover.class);
                            startActivity(i);
                            break;
                        case R.id.bahamacho:
                            Intent j = new Intent(getBaseContext(), Macho.class);
                            startActivity(j);
                            break;
                        case R.id.bahamum:
                            Intent k = new Intent(getBaseContext(), Mama.class);
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
                        case R.id.bahamain:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.bahaprev:
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
