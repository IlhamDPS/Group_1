package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class signin extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singin_layout);

        ImageView signin = (ImageView) findViewById(R.id.signin);
        signin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tomenu = new Intent(signin.this, menu.class);
                startActivity(tomenu);
            }
        });
    }
}
