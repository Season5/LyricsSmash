package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageEsty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.esty);

        TextView b1 = (TextView) findViewById(R.id.estydakta);
        TextView b2 = (TextView) findViewById(R.id.estydawa);
        TextView b3 = (TextView) findViewById(R.id.estyfura);

        Button b4 = (Button) findViewById(R.id.estymain);
        Button b5 = (Button) findViewById(R.id.estyprev);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.estydakta:
                            Intent i = new Intent(getBaseContext(), Daktari.class);
                            startActivity(i);
                            break;
                        case R.id.estydawa:
                            Intent j = new Intent(getBaseContext(), Dawa.class);
                            startActivity(j);
                            break;
                        case R.id.estyfura:
                            Intent k = new Intent(getBaseContext(), Furahia.class);
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
                        case R.id.estymain:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.estyprev:
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
