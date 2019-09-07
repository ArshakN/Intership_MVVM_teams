package com.example.intership_mvvm_teams;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button increment_teamOne;
    Button decrement_TeamOne;
    Button increment_TeamTwo;
    Button decrement_TeamTwo;
    TextView number_TeamOne;
    TextView number_TeamTwo;
    private NumberViewModel model_teamOne;
    private NumberViewModel model_teamTwo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increment_teamOne = findViewById(R.id.btn_team1_inc);
        decrement_TeamOne = findViewById(R.id.btn_teamOne_dec);
        number_TeamOne = findViewById(R.id.result_teamOne);

        increment_TeamTwo = findViewById(R.id.btn_teamTwo_inc);
        decrement_TeamTwo = findViewById(R.id.btn_TeamTwo_dec);
        number_TeamTwo = findViewById(R.id.result_TeamTwo);

        
        model_teamOne = ViewModelProviders.of(this).get(NumberViewModel.class);
        model_teamTwo = ViewModelProviders.of(this).get(NumberViewModel.class);

        final Observer<Integer> numberObserver_teamOne = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                number_TeamOne.setText(integer.toString());
            }
        };

        final Observer<Integer> numberObserver_teanTwo = new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                number_TeamTwo.setText(integer.toString());
            }
        };

        model_teamOne.getNumber_teamOne().observe(this, numberObserver_teamOne);
        model_teamTwo.getNumber_teamTwo().observe(this, numberObserver_teanTwo);

        increment_teamOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model_teamOne.incrementTeamOne();
            }
        });

        increment_TeamTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model_teamTwo.incrementTeamTwo();
            }
        });

        decrement_TeamOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model_teamOne.decremetnTeamOne();
            }
        });

     decrement_TeamTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                model_teamTwo.decremetnTeamTwo();
            }
        });
    }


}

