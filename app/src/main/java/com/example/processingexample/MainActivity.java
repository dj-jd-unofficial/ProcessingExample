package com.example.processingexample;
//package core_debug; //I am unable to import this.

import androidx.appcompat.app.AppCompatActivity;
//import android.support.v4.app.AppCompatActivity; // I am unable to import this.
import android.support.v4.app.*;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.os.Bundle;

import processing.android.PFragment;
import processing.android.CompatUtils;
import processing.core.PApplet;

/*
 * Jack Darakian
 */

public class MainActivity extends AppCompatActivity {

    private PApplet sketch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frame = new FrameLayout(this);
        frame.setId(CompatUtils.getUniqueViewId());
        setContentView(frame, new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT));

        sketch = new Sketch();
        PFragment fragment = new PFragment(sketch);
        fragment.setView(frame, this); /* The debugger says the 2nd argument is wrong, but
        I don't know what else to place in it. */
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (sketch != null) {
            sketch.onRequestPermissionsResult(
                    requestCode, permissions, grantResults);
        }
    }

    @Override
    public void onNewIntent(Intent intent) {
        if (sketch != null) {
            sketch.onNewIntent(intent);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (sketch != null) {
            sketch.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onBackPressed() {
        if (sketch != null) {
            sketch.onBackPressed();
        }
    }

}
