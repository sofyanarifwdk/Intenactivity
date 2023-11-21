package com.example.intenactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class hellotoastActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hellotoast);
        mShowCount = (TextView) findViewById(R.id.showCount);
    }


    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }


    public void showToast(View view) {
        // Create a toast show it.
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_LONG);
        toast.show();
    }
}