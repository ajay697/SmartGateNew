package com.example.www.smartgate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Intro extends AppCompatActivity {

    private Button navigateSignInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        navigateSignInButton = (Button)findViewById(R.id.navigate_sigin_button);
    }
    public void onNavigateSignInButtonClicked(View view){
        Intent signInIntent = new Intent(this,SignInActivity.class);
        startActivity(signInIntent);
    }
}
