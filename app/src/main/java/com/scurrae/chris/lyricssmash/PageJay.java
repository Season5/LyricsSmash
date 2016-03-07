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

public class PageJay extends AppCompatActivity {
    String[] jaySongs = {"Dead President", "Empire state of mind", "Song cry"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter adet = new ArrayAdapter<String>(this, R.layout.listview, jaySongs);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adet);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Dead President")) {
                    Intent m = new Intent(getBaseContext(), Dead.class);
                    startActivity(m);
                } else if (sText.equals("Empire state of mind")) {
                    Intent n = new Intent(getBaseContext(), Empire.class);
                    startActivity(n);
                } else if (sText.equals("Song cry")) {
                    Intent o = new Intent(getBaseContext(), Song.class);
                    startActivity(o);
                }

            }
        });
    }
}
