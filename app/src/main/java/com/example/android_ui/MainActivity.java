package com.example.android_ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    final String TAG="MAIN ACTIVITY";
    final String USERNAME="CALVIN";
    final String PASSWORD="PASSWORD";
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButton;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calvin_b_linear_layout);

        usernameEditText = (EditText) findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) findViewById(R.id.password_edit_text);


        loginButton = (Button)findViewById(R.id.login_button);
        loginButton.setOnClickListener(this);
//        button.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
        Log.i(TAG,"onCreate");


        try {
            InputStream inputStream= getAssets().open("ic_launcher.png");
            Drawable drawable=Drawable.createFromStream(inputStream, null);
            loginButton.setBackground(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected  void onResume(){
        super.onResume();
        Log.i(TAG,"onResume");
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    @Override
    public void onClick(View v) {
        int viewId = view.getId();

        switch (viewId) {
            case R.id.login_button:
                String username = usernameEditText.getEditableText().toString();
                String password = passwordEditText.getEditableText().toString();
                break;
        }
    }
}
