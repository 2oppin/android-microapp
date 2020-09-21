package com.oppin.microapp;

import android.os.Bundle;
import android.app.Activity;
import android.opengl.GLSurfaceView;

import com.oppin.microapp.view.MyGLSurfaceView;

public class OpenGLActivity extends Activity {

    private GLSurfaceView gLView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create a GLSurfaceView instance and set it
        // as the ContentView for this Activity.
        gLView = new MyGLSurfaceView(this);
        setContentView(gLView);
    }
}