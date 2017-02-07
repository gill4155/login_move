package com.example.priyanka.recylerview;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {
    private TextView username_text;
    private TextView password_text;
    private Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username_text = (EditText) findViewById(R.id.edit_text);
        password_text = (EditText) findViewById(R.id.edit_text1);
        login = (Button) findViewById(R.id.buttonPanel);

        View.OnClickListener btnOnclick = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = username_text.getText().toString();
                String password = password_text.getText().toString();

                String savedname = "kiran";
                String savedpassword = "12345678";

                if (name.equals(savedname) && password.equals(savedpassword)) ;
                {
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(i);
                    finish();
                }

                {
                    Toast.makeText(MainActivity.this, "incorrect input", Toast.LENGTH_SHORT).Show();
                }
            }


        };
    }
