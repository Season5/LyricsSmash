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

public class PageEsty extends AppCompatActivity {
    String[] estySongs = {"Kuna Dawa", "Damu", "Daktari"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter adpt = new ArrayAdapter<String>(this, R.layout.listview, estySongs);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adpt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Kuna Dawa")) {
                    Intent g = new Intent(getBaseContext(), Dawa.class);
                    startActivity(g);
                } else if (sText.equals("Damu")) {
                    Intent h = new Intent(getBaseContext(), Damu.class);
                    startActivity(h);
                } else if (sText.equals("Daktari")) {
                    Intent i = new Intent(getBaseContext(), Daktari.class);
                    startActivity(i);
                }

            }
        });
    }
}
