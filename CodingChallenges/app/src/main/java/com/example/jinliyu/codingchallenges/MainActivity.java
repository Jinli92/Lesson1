package com.example.jinliyu.codingchallenges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   public  static  String TAG = MainActivity.class.getSimpleName();
   TextView showcount;
   private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "There is an exception");

        showcount = (TextView) findViewById(R.id.textView);
    }

    public void countUp(View view) {
        mCount++;
        double total = (double) (mCount *2.5);
        if (showcount != null)
            showcount.setText(Double.toString(total));
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, "Hello Toast! ", Toast.LENGTH_LONG);
        toast.show();
    }


}
