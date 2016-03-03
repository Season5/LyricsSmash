package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button b1 = (Button) findViewById(R.id.button);
        Button b2 = (Button) findViewById(R.id.button2);

        Button[] button = {b1,b2};
        for (Button aButton : button) {
            aButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    switch (v.getId()) {
                        case R.id.button:
                            Intent i = new Intent(getBaseContext(), Local.class);
                            startActivity(i);
                            break;
                        case R.id.button2:
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
