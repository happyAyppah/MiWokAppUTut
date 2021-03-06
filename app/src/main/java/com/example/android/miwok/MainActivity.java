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

import android.arch.lifecycle.Lifecycle;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView numbers , phrases, familyMembers, colours;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        // Find Text id
         numbers = findViewById(R.id.numbers);
         // Set a click listener on that View
         numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Find Text id
        colours = findViewById(R.id.colors);
        // Set a click listener on that View
        colours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the color View is clicked on.
            @Override
            public void onClick(View view) {
                Intent colorIntent = new Intent(MainActivity.this, ColorActivity.class);
                startActivity(colorIntent);
            }
        });


        // Find Text id
        familyMembers = findViewById(R.id.family);
        // Set a click listener on that View
        familyMembers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the color View is clicked on.
            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyMemberActivity.class);
                startActivity(familyIntent);
            }
        });


        // Find Text id
        phrases = findViewById(R.id.phrases);
        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the color View is clicked on.
            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });


    }




}
