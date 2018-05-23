package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.miwok.R;
import com.example.android.miwok.Word;
import com.example.android.miwok.WordAdapter;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("Where are you going?", "minto wuksus"));
        words.add(new Word("What is your name?", "tinne oyaase'ne"));
        words.add(new Word("My name is...", "oyaaset..."));
        words.add(new Word("How are you feeling?", "michekses?"));
        words.add(new Word("I'm feeling good.", "kuchi achit"));
        words.add(new Word("Are you coming?", "eenes'aa?"));
        words.add(new Word("Yes, I'm coming.", "hee'eenem"));
        words.add(new Word("I'm coming.", "eenem"));
        words.add(new Word("Let's Go", "yoowutis"));
        words.add(new Word("Come here.", "enni'nem"));


        WordAdapter adapter = new WordAdapter(this, words);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);





    }
}