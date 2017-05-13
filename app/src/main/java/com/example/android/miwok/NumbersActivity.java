package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.example.android.miwok.Word;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Set;

//import static com.example.android.miwok.R.id.rootView;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        //setContentView(R.layout.list_item);


        //  String words[] = new String[10];

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one", "Ek"));
        words.add(new Word("two", "Do"));
        words.add(new Word("three", "Teen"));
        words.add(new Word("four", "Char"));
        words.add(new Word("five", "Paach"));
        words.add(new Word("six", "Cheh"));
        words.add(new Word("seven", "Saath"));
        words.add(new Word("eight", "Aath"));
        words.add(new Word("nine", "Nau"));
        words.add(new Word("ten", "Dus"));


        // Find the root view so we can add child views to it
       // LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);


       WordAdapter adapter = new WordAdapter(this,words);

        ListView listView = (ListView) findViewById(R.id.list_item);

        //GridView gridview = (GridView) findViewById(R.id.grid);

       // assert listView != null;
        listView.setAdapter(adapter);



    }
}
