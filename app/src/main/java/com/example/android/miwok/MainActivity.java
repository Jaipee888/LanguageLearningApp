/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.id.message;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.android.miwok.R.id.colors;
import static com.example.android.miwok.R.id.family;
import static com.example.android.miwok.R.id.numbers;
import static com.example.android.miwok.R.id.phrases;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);




        TextView NumberPanel = (TextView) findViewById(numbers);

        // Set a click listener on that View
        NumberPanel.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent NumberPanelIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(NumberPanelIntent);
            }
        });

        TextView ColorPanel = (TextView) findViewById(colors);

        ColorPanel.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                Intent ColorPanelIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(ColorPanelIntent);
            }
        });

        TextView FamilyPanel = (TextView) findViewById(family);

        FamilyPanel.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                Intent FamilyPanelIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(FamilyPanelIntent);
            }
        });



        TextView PhrasePanel = (TextView) findViewById(phrases);

        PhrasePanel.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                Intent PhrasePanelIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(PhrasePanelIntent);
            }
        });

        /*
        super.onCreate(savedInstanceState);
        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);*/
    }

  /*  public void Numberslist(View view){
        Intent intent = new Intent(this, NumbersActivity.class);

        startActivity(intent);

    }*/
}
