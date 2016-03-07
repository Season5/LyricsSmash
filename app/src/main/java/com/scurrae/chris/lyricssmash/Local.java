package com.scurrae.chris.lyricssmash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by chris on 3/2/16.
 */
public class Local extends AppCompatActivity{
    String[] localArtists = {"Bahati", "Rabbit", "Esther Wahome"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.local);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.listview, localArtists);


        final ListView listView = (ListView)findViewById(R.id.ListView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sText = ((TextView)view).getText().toString();
                        if(sText.equals("Bahati")) {
                            Intent i = new Intent(getBaseContext(), PageBahati.class);
                            startActivity(i);
                        }
                        else if(sText.equals("Rabbit")){
                            Intent j = new Intent(getBaseContext(), PageBunny.class);
                            startActivity(j);
                        }

                        else if(sText.equals("Esther Wahome")) {
                            Intent k = new Intent(getBaseContext(), PageEsty.class);
                            startActivity(k);
                        }

                }
        });
//
//        TextView b1 = (TextView) findViewById(R.id.lclesty);
//        TextView b2 = (TextView) findViewById(R.id.lclbaha);

//        TextView b3 = (TextView) findViewById(R.id.lclbunny);


//        Button b4 = (Button) findViewById(R.id.lclmain);
//
//
//        TextView[] text = {b1,b2,b3};
//        for (TextView aButton : text) {
//            aButton.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    switch (v.getId()) {
//                        case R.id.lclesty:
//                            Intent i = new Intent(getBaseContext(), PageEsty.class);
//                            startActivity(i);
//                            break;
//                        case R.id.lclbaha:
//                            Intent j = new Intent(getBaseContext(), PageBahati.class);
//                            startActivity(j);
//                            break;
//                        case R.id.lclbunny:
//                            Intent k = new Intent(getBaseContext(), PageBunny.class);
//                            startActivity(k);
//                            break;
//                        default:
//                            break;
//                    }
//                }
//
//
//            });
//        }
//
//        b4.setOnClickListener(new View.OnClickListener() {
//                                  @Override
//                                  public void onClick(View v) {
//                                      Intent i = new Intent(getBaseContext(), Main.class);
//                                      startActivity(i);
//                                  }
//                              }


//        );
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
