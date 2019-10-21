package com.example.diceroller;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Message;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void OnClick(View view) {
        //comp number
        TextView RandomNumber = this.findViewById(R.id.RandomNumb);
        //user input

        EditText Num1 = this.findViewById(R.id.InputNumb);
        String Num_Check = Num1.getText().toString().trim();
        if (Num_Check.isEmpty() || Num_Check == null) {
            RandomNumber.setText("Please Enter a Number");
        }

        else{
            //user number
            TextView tv = this.findViewById(R.id.MyNumb);

            Random R = new Random();
            int Random = R.nextInt(7 - 1) + 1;
            // RandomNumber.setText(""+Random);
            int Num2 = Integer.parseInt(Num1.getText().toString());
            if (Num2 == Random) {
                scoreBoard(view);

            }
            if(Num2 != Random){

                notEqual(view);
            }
            String CompGen = String.valueOf(Random);
            String Num3 = String.valueOf(Num2);
            tv.setText("Computer's Number: \r" + CompGen);
            RandomNumber.setText("Your Number: \r" + Num3);



        }

    }

        public void scoreBoard (View View){
            count++;
            TextView scoreCard = this.findViewById(R.id.Score);
            scoreCard.setText("Your Score: " + count);
            TextView MessageBox = this.findViewById(R.id.Message);
            MessageBox.setText("Congratulations! You Guessed it Correct");

        }
        public void notEqual(View view){
            TextView MessageBox = this.findViewById(R.id.Message);
            MessageBox.setText("loser! You didnt Guess it Correct");
        }
    }
