package com.androidaudhitory.group_1.menu_content;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.androidaudhitory.group_1.R;
import com.androidaudhitory.group_1.menu_content.tundra_child.tundra2;

import de.hdodenhof.circleimageview.CircleImageView;

public class tundra1 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tundra1_layout);
        Click();
    }

    public void Click()
    {
        CircleImageView btn = (CircleImageView) findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(tundra1.this, tundra2.class);
                startActivity(intent);
            }
        });
    }

}
