package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        int index = 0;
        int count = 0;


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("one" , "lutti"));
        words.add(new Word("two" , "ottiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four" , "oyyisa"));
        words.add(new Word("five" , "massokka"));
        words.add(new Word("six" , "temokka"));
        words.add(new Word("seven" , "kenekaku"));
        words.add(new Word("eight" , "kavinta"));
        words.add(new Word("nine" , "wo'e"));
        words.add(new Word("ten" , "na'aacha"));


        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
