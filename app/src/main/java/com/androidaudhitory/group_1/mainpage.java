package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainpage extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpage_layout);

        Button button = (Button) findViewById(R.id.tohal3);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tohal3 = new Intent(mainpage.this,menu.class);
                startActivity(tohal3);
            }
        });
    }
}
