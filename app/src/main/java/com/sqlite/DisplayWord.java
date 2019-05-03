package com.sqlite;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import myhelper.MyHelper;

public class DisplayWord extends AppCompatActivity {
    private ListView lstWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_word);
        lstWord = findViewById(R.id.lstWord);
        LoadWord();
    }
    private void LoadWord(){
        final MyHelper myHelper = new MyHelper(this);
        final SQLiteDatabase sqLiteDatabase = myHelper.getWritableDatabase();

        List<Word> wordList = new ArrayList<>();
        wordList = myHelper.GetAllWords(sqLiteDatabase);

        final HashMap<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < wordList.size(); i++){
            hashMap.put(wordList.get(i).getWord(),wordList.get(i).getMeaning());
        }
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                new ArrayList<String>(hashMap.keySet()));
        lstWord.setAdapter(stringArrayAdapter);


    }
}