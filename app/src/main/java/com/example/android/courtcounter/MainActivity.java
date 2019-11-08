package com.example.android.courtcounter;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {
int srhr, mir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);

        }
    public void singlef(View view)
    {
        srhr=srhr+1;
        displayForTeamA(srhr);

    }

    public void df(View view)
    {
        srhr=srhr+2;
        displayForTeamA(srhr);
    }
    public void fourf(View view)
    {
        srhr=srhr+4;
        displayForTeamA(srhr);
    }
    public void sixf(View view)
    {
        srhr=srhr+6;
        displayForTeamA(srhr);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.srh);
        scoreView.setText(String.valueOf(score));
    }
    public void singlef2(View view)
    {
        mir=mir+1;
        displayForTeamB(mir);
    }

    public void df2(View view)
    {
        mir=mir+2;
        displayForTeamB(mir);
    }
    public void fourf2(View view)
    {
        mir=mir+4;
        displayForTeamB(mir);
    }
    public void sixf2(View view)
    {
        mir=mir+6;
        displayForTeamB(mir);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.mi);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view)
    {
        mir=0;
        srhr=0;
        displayForTeamB(mir);
        displayForTeamA(srhr);
    }

}
