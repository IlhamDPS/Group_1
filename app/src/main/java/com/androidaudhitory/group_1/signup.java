package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class signup extends AppCompatActivity
{
    public static final String user_name = "username";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singup_layout);

        ImageView signin = (ImageView) findViewById(R.id.signup);
        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tomenu = new Intent(signup.this, menu.class);
                EditText username = (EditText) findViewById(R.id.username);

                String name = username.getText().toString();
                tomenu.putExtra(user_name, "Welcome, "+name);

                startActivity(tomenu);
            }
        });
    }
}
