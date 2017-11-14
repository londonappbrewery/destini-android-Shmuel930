package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        TextView storyText;
        Button topButton;
        Button botButton;
        String currentStage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        storyText = (TextView)findViewById(R.id.storyTextView);
        topButton = (Button)findViewById(R.id.buttonTop);
        botButton = (Button)findViewById(R.id.buttonBottom);
        currentStage="T1_Stage";


        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this is the top button.
                if (currentStage.equals("T1_Stage")|| currentStage.equals("T2_Stage")) {
                    storyText.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    botButton.setText(R.string.T3_Ans2);
                    currentStage="T3_Stage";
                }
                else  if (currentStage.equals("T3_Stage")){
                    storyText.setText(R.string.T6_End);
                    topButton.setText("");
                    botButton.setText("");
                    currentStage="T6_Stage";
                }
            }
        });


        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this is the bottom button.
                if (currentStage.equals("T1_Stage")){
                    storyText.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    botButton.setText(R.string.T2_Ans2);
                    currentStage="T2_Stage";
                }
                else if (currentStage.equals("T2_Stage")){
                    storyText.setText(R.string.T4_End);
                    topButton.setText("");
                    botButton.setText("");
                    currentStage="T4_Stage";
                }
                else if (currentStage.equals("T3_Stage")){
                    storyText.setText(R.string.T5_End);
                    topButton.setText("");
                    botButton.setText("");
                    currentStage="T5_Stage";
                }
            }
        });





    }
}
