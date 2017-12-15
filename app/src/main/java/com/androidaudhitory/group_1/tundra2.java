package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidaudhitory.group_1.halaman3content.tundra3minimenu;

import de.hdodenhof.circleimageview.CircleImageView;

public class tundra2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tundra2_layout);

        CircleImageView totundramini = (CircleImageView) findViewById(R.id.totundramini);
        totundramini.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent totundramini = new Intent(tundra2.this, tundra3minimenu.class);
                startActivity(totundramini);
            }
        });
    }
}
