package com.test.AdaterViewFlipperTest;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.Animator;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterViewFlipper;

public class MainActivity extends AppCompatActivity {

    private static FlipperAdapter adapter;
    private AdapterViewFlipper mAdapterViewFlipper;
    private Animator.AnimatorListener mAnimatorListener;
    private People mPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdapterViewFlipper = (AdapterViewFlipper) findViewById(R.id.AdapterViewFlipper);

        // Create some people top show
        mPeople = new People();

        // Add them to the adapter
        adapter = new FlipperAdapter(getApplicationContext(), mPeople);

        // Set a Flip interval
        mAdapterViewFlipper.setFlipInterval(5000);

        mAdapterViewFlipper.setAdapter(adapter);

        // Start Flipping
        mAdapterViewFlipper.setAutoStart(true);
    }
}
