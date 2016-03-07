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

public class PageBey extends AppCompatActivity {
    String[] beySongs = {"Run", "Single", "Left"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter adapt = new ArrayAdapter<String>(this, R.layout.listview, beySongs);

        final ListView listView = (ListView) findViewById(R.id.ListView);
        listView.setAdapter(adapt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView) view).getText().toString();
                if (sText.equals("Run")) {
                    Intent d = new Intent(getBaseContext(), Run.class);
                    startActivity(d);
                } else if (sText.equals("Single")) {
                    Intent e = new Intent(getBaseContext(), Single.class);
                    startActivity(e);
                } else if (sText.equals("Left")) {
                    Intent f = new Intent(getBaseContext(), Left.class);
                    startActivity(f);
                }

            }
        });
    }
}
