package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    private ProgressBar myProgress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myProgress = (ProgressBar)findViewById(R.id.progressbar);
    }
    public void changeProgress(View view){
        int getProgress = myProgress.getProgress();
        myProgress.setProgress(getProgress+10);
    }
}
