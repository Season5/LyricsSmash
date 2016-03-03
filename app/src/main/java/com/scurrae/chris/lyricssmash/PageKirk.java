package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PageKirk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kirk);

        TextView b1 = (TextView) findViewById(R.id.kirkhose);
        TextView b2 = (TextView) findViewById(R.id.kirksmilo);
        TextView b3 = (TextView) findViewById(R.id.kirktoday);

        Button b4 = (Button) findViewById(R.id.kirkmain);
        Button b5 = (Button) findViewById(R.id.kirkprev);


        TextView[] text = {b1,b2,b3};
        for (TextView aButton : text) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.kirkhose:
                            Intent i = new Intent(getBaseContext(), Hosanna.class);
                            startActivity(i);
                            break;
                        case R.id.kirksmilo:
                            Intent j = new Intent(getBaseContext(), Smile.class);
                            startActivity(j);
                            break;
                        case R.id.kirktoday:
                            Intent k = new Intent(getBaseContext(), Today.class);
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
                        case R.id.kirkmain:
                            Intent i = new Intent(getBaseContext(), Main.class);
                            startActivity(i);
                            break;
                        case R.id.kirkprev:
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
