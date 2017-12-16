package com.androidaudhitory.group_1.menu_content.tundra_child;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableRow;

import com.androidaudhitory.group_1.R;

public class tundra3minimenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tundra3_minimenu_layout);

        TableRow FR = (TableRow) findViewById(R.id.T_FR);
        FR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        TableRow SR = (TableRow) findViewById(R.id.T_SR);
        SR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });

        TableRow TR = (TableRow) findViewById(R.id.T_TR);
        TR.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

            }
        });
    }
}
