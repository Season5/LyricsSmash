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
import android.widget.Toast;

public class PageKirk extends AppCompatActivity {
    String[] kirkSongs = {"Smile", "Hosanna", "Today"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter aet = new ArrayAdapter<String>(this, R.layout.listview, kirkSongs);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(aet);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Smile")) {
                    Intent p = new Intent(getBaseContext(), Smile.class);
                    startActivity(p);
                } else if (sText.equals("Hosanna")) {
                    Intent q = new Intent(getBaseContext(), Hosanna.class);
                    startActivity(q);
                } else if (sText.equals("Today")) {
                    Intent r = new Intent(getBaseContext(), Today.class);
                    startActivity(r);
                }

            }
        });
    }
}
