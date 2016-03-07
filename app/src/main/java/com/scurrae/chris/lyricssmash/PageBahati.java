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

public class PageBahati extends AppCompatActivity {
    String[] bahatiSongs = {"Machozi", "Lover", "Mama"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter adapte = new ArrayAdapter<String>(this, R.layout.listview, bahatiSongs);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapte);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Machozi")) {
                    Intent a = new Intent(getBaseContext(), Macho.class);
                    startActivity(a);
                } else if (sText.equals("Lover")) {
                    Intent b = new Intent(getBaseContext(), Lover.class);
                    startActivity(b);
                } else if (sText.equals("Mama")) {
                    Intent c = new Intent(getBaseContext(), Mama.class);
                    startActivity(c);
                }

            }
        });
    }
}
