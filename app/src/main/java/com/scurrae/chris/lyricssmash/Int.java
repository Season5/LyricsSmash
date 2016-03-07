package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class Int extends AppCompatActivity {
    String[] internationalArtists = {"Beyonce", "Jay-z", "Kirk Franklin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.local);

        ArrayAdapter adapterer = new ArrayAdapter<String>(this, R.layout.listview, internationalArtists);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapterer);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Beyonce")) {
                    Intent y = new Intent(getBaseContext(), PageBey.class);
                    startActivity(y);
                } else if (sText.equals("Jay-z")) {
                    Intent u = new Intent(getBaseContext(), PageJay.class);
                    startActivity(u);
                } else if (sText.equals("Kirk Franklin")) {
                    Intent m = new Intent(getBaseContext(), PageKirk.class);
                    startActivity(m);
        setContentView(R.layout.inter);
        stopService(new Intent(getBaseContext(), HelloService.class));

            }
        }
                });
    }
}
