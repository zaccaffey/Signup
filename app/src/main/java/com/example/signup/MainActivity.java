package com.example.signup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etEmail;
    EditText etPassword;
    TextView conTextView;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        radioGroup = findViewById(R.id.group1);
        //conTextView = findViewById(R.id.tvReturn);

    }

    public void handleClicks(View viewClicked) {
        startHomeActivity();
    }

    public void startHomeActivity() {
        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();
        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        View radioButton = radioGroup.findViewById(radioButtonId);
        int index = radioGroup.indexOfChild(radioButton);
        Intent hIntent = new Intent(this, HomeActivity.class);
        User user = new User(email,password,index);
        hIntent.putExtra("userkey",user);
        /*hIntent.putExtra("ekey", email);
        hIntent.putExtra("pkey", password);
        hIntent.putExtra("rkey", index);*/
        startActivityForResult(hIntent,123);
    }

   // @Override
    /*protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent intent) {
        super.onActivityResult(requestCode, resultCode, intent);
        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {
                String contact = bundle.getString("ckey");
                conTextView.setText(contact);
            }
        }
    }*/
}