package com.example.android_ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, View.OnTouchListener, View.OnLongClickListener {
    final String TAG="MAIN ACTIVITY";
    final String USERNAME="CALVIN";
    final String PASSWORD="PASSWORD";

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button visibleOneButton;
    private Button visibleTwoButton;
    private TextView buttonClickedTextView;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calvin_b_linear_layout);

        usernameEditText = (EditText) findViewById(R.id.username_edit_text);
        passwordEditText = (EditText) findViewById(R.id.password_edit_text);

        Button loginButton;
        Button buttonOne;
        Button buttonTwo;
        Button buttonThree;
        Button buttonFour;

        loginButton = (Button)findViewById(R.id.login_button);
        buttonOne = (Button)findViewById(R.id.button_one);
        buttonTwo = (Button)findViewById(R.id.button_two);
        buttonThree = (Button)findViewById(R.id.button_three);
        buttonFour = (Button)findViewById(R.id.button_four);
        visibleOneButton = (Button) findViewById(R.id.visible_b_one);
        visibleTwoButton = (Button) findViewById(R.id.visible_b_two);

        buttonClickedTextView = (TextView) findViewById(R.id.button_clicked_textview);

        loginButton.setOnClickListener(this);
        buttonOne.setOnTouchListener(this);
        buttonTwo.setOnTouchListener(this);
        buttonThree.setOnTouchListener(this);
        buttonFour.setOnTouchListener(this);

        visibleOneButton.setOnClickListener(this);
        visibleTwoButton.setOnClickListener(this);



//        button.setOnClickListener(new OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//            }
//        });
        Log.i(TAG,"onCreate");


//        try {
//            InputStream inputStream= getAssets().open("ic_launcher.png");
//            Drawable drawable=Drawable.createFromStream(inputStream, null);
//            loginButton.setBackground(drawable);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


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
        int viewId = v.getId();

        switch (viewId) {
            case R.id.login_button:
                String username = usernameEditText.getEditableText().toString();
                String password = passwordEditText.getEditableText().toString();

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Wrong username or password", Toast.LENGTH_LONG).show();
                }

                break;

            case R.id.visible_b_one:
                visibleTwoButton.setVisibility(View.INVISIBLE);
                visibleOneButton.setVisibility(View.VISIBLE);
                break;
            case R.id.visible_b_two:
                visibleOneButton.setVisibility(View.INVISIBLE);
                visibleTwoButton.setVisibility(View.VISIBLE);
                break;
        }
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        int viewId = v.getId();

        switch (viewId) {
            case R.id.button_one:
                buttonClickedTextView.setText("One");
                break;
            case R.id.button_two:
                buttonClickedTextView.setText("Two");
                break;
            case R.id.button_three:
                buttonClickedTextView.setText("Three");
                break;
            case R.id.button_four:
                buttonClickedTextView.setText("Four");
                break;
        }
        return false;
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
