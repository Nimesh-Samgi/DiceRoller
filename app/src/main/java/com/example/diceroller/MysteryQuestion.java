package com.example.diceroller;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MysteryQuestion extends AppCompatActivity{
    ArrayList<String> Values = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery_question);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

        TextView question = this.findViewById(R.id.QuestionView);



        Values.add("If You Could Go Anywhere In The World, Where Would You Go?");
        Values.add("If You Were Stranded On A Desert Island, What Three Things Would You Want To Take With You?");
        Values.add("If You Could Eat Only One Food For The Rest Of Your Life, What Would That Be?");
        Values.add("If You Won A Million Dollars, What Is The First Thing You Would Buy?");
        Values.add("If You Could Spend The Day With One Fictional Character, Who Would It Be?");
        Values.add("If You Found A Magic Lantern And A Genie Gave You Three Wishes, What Would You Wish?");
        Random R = new Random();
        int Random = R.nextInt(6);


        question.setText(question.getText() + Values.get(Random));



    }

    public void Cancel_Save (View view){
        Intent myIntent1 = new Intent(MysteryQuestion.this, MainActivity.class);
        startActivity(myIntent1);
    }



    }


