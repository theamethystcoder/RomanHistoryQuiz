package com.example.android.romanhistoryquiz;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.jar.Attributes;

/**
 * This app displays a Quiz.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    CheckBox One, Two, Three;
    int grandTotal = 0;

    /**
     * This captures question 2 checkbox data and scores it.
     */
    public void onCheckboxClicked(View view) {
        // Is the view now checked?

        One = (CheckBox) findViewById(R.id.q1_a1);
        Two = (CheckBox) findViewById(R.id.q1_a2);
        Three = (CheckBox) findViewById((R.id.q1_a3));

        if (Two.isChecked() && Three.isChecked()) {
            //"You've chosen wisely!"
            Toast.makeText(this, "You've chosen wisely", Toast.LENGTH_SHORT).show();
            grandTotal += 1;
        } else {
            Toast.makeText(this, "Try again. There are two correct answers.", Toast.LENGTH_SHORT).show();
            //"Try again. There are two correct answers."
        }
    }

    /**
     * This captures questions 1, 4, 5, 6, and 7 and scores accordingly.
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button 2 was clicked
        switch (view.getId()) {
            case R.id.q2_a1:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q2_a2:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q2_a3:
                if (checked)
                    Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT).show();
                grandTotal += 1;
                // Correct answer
                break;
        }

        // Check which radio button 4 was clicked
        switch (view.getId()) {
            case R.id.q4_a1:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q4_a2:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q4_a3:
                if (checked)
                    Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT).show();
                grandTotal += 1;
                // Correct answer
                break;

        }

        // Check which radio button 5 was clicked
        switch (view.getId()) {
            case R.id.q5_a1:
                if (checked)
                    Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT).show();
                grandTotal += 1;
                // You are correct
                break;
            case R.id.q5_a2:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q5_a3:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Try again
                break;
        }

        // Check which radio button 6 was clicked
        switch (view.getId()) {
            case R.id.q6_a1:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q6_a2:
                if (checked)
                    Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT).show();
                grandTotal += 1;
                // You are correct
                break;
            case R.id.q6_a3:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Try again
                break;
        }

        // Check which radio button 7 was clicked
        switch (view.getId()) {
            case R.id.q7_a1:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
            case R.id.q7_a2:
                if (checked)
                    Toast.makeText(this, "You are correct", Toast.LENGTH_SHORT).show();
                grandTotal += 1;
                // Correct answer
                break;
            case R.id.q7_a3:
                if (checked)
                    Toast.makeText(this, "Try Again", Toast.LENGTH_SHORT).show();
                grandTotal += 0;
                // Wrong answer
                break;
        }
    }

    /**
     * This combines the score from the questions and gives a response when the submit order is clicked.
     */
    public void submitQuiz(View view) {
        // Finds the users name
        EditText enterName = (EditText) findViewById(R.id.enter_name);
        String name = enterName.getText().toString();

        // Finds and checks the answer for question 3
        EditText enterAnswerThree = (EditText) findViewById(R.id.enter_answer_three);
        String questionThreeAnswer = enterAnswerThree.getText().toString();
        if (questionThreeAnswer.equalsIgnoreCase("Caesar") || questionThreeAnswer.equalsIgnoreCase("Julius Caesar") || questionThreeAnswer.equalsIgnoreCase("Caesar ") || questionThreeAnswer.equalsIgnoreCase("Julius Caesar "))
            grandTotal += 1;

        // This calculates the total and gives the user a score
        if (grandTotal == 0) {
            Toast.makeText(this, name + " You’ve got 0 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 1) {
            Toast.makeText(this, name + " You’ve got 1 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 2) {
            Toast.makeText(this, name + " You’ve got 2 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 3) {
            Toast.makeText(this, name + " You’ve got 3 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 4) {
            Toast.makeText(this, name + " You’ve got 4 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 5) {
            Toast.makeText(this, name + " You’ve got 5 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 6) {
            Toast.makeText(this, name + " You’ve got 6 out of 7 Correct", Toast.LENGTH_SHORT).show();
        }
        if (grandTotal == 7) {
            Toast.makeText(this, name + " Congrats! 7 out of 7! You must be Roman!", Toast.LENGTH_SHORT).show();
        }

        // Restart app after SUBMIT button is clicked

        Intent intent = getIntent();
        finish();
        startActivity(intent);

    }

}
