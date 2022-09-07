package com.example.signup;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {

    TextView tvEmail;
    TextView tvPass;
    TextView tvSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvEmail = findViewById(R.id.tvHome);
        tvPass = findViewById(R.id.tvPass);
        tvSelected = findViewById(R.id.tvSelected);

        if (getIntent().getExtras() != null) {
          //  Bundle bundle = getIntent().getExtras();
            User myUser = getIntent().getParcelableExtra("userkey");
          /*  String name = bundle.getString("ekey");
          // another
            String pass = bundle.getString("pkey");
            int selected = bundle.getInt("rkey");*/
            tvEmail.setText(myUser.getEmail());
            tvPass.setText(myUser.getPassword());
            int selected = myUser.getIndex();
            if (selected == 0) {
                tvSelected.setText("You indicated that you are going to the party");
            } else if (selected == 1) {
                tvSelected.setText("You indicated that you are not going to the party");
            } else if (selected == 2) {
                tvSelected.setText("You indicated that you might go to the party");
            }
        }
    }
}