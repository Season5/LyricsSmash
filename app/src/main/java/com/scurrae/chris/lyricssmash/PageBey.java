package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageBey extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bey);

        TextView b1 = (TextView) findViewById(R.id.beyleft);
        TextView b2 = (TextView) findViewById(R.id.beyrun);
        TextView b3 = (TextView) findViewById(R.id.beysingle);

        Button b4 = (Button) findViewById(R.id.beymain);
        Button b5 = (Button) findViewById(R.id.beyprev);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.beyleft:
                            Intent i = new Intent(getBaseContext(), Left.class);
                            startActivity(i);
                            break;
                        case R.id.beyrun:
                            Intent j = new Intent(getBaseContext(), Run.class);
                            startActivity(j);
                            break;
                        case R.id.beysingle:
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
                        case R.id.beymain:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.beyprev:
                            Intent j = new Intent(getBaseContext(), Int.class);
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
