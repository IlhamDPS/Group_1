package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TextView;

import com.androidaudhitory.group_1.menu_content.galapagos;
import com.androidaudhitory.group_1.menu_content.gunung_kerinci;
import com.androidaudhitory.group_1.menu_content.tundra1;


public class menu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Intent user_name = getIntent();
        String username = user_name.getStringExtra(signin.user_name);

        TextView namedisplay = (TextView) findViewById(R.id.username);
        namedisplay.setText(username);

        toTundra();

        toMountain();

        toGalapagos();

    }

    protected void toTundra()
    {
        TableLayout totundra = (TableLayout) findViewById(R.id.tundraimage);
        totundra.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent totundra = new Intent(menu.this, tundra1.class);
                startActivity(totundra);
            }
        });

        ImageButton totundra2 = (ImageButton) findViewById(R.id.tundraimage2);
        totundra2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent totundra2 = new Intent(menu.this, tundra1.class);
                startActivity(totundra2);
            }
        });
    }

    protected void toMountain()
    {
        TableLayout tomountain = (TableLayout) findViewById(R.id.image2);
        tomountain.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tomountain = new Intent(menu.this, gunung_kerinci.class);
                startActivity(tomountain);
            }
        });

        ImageButton tomountain2 = (ImageButton) findViewById(R.id.image22);
        tomountain2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tomountain = new Intent(menu.this, gunung_kerinci.class);
                startActivity(tomountain);
            }
        });
    }

    protected void toGalapagos()
    {
        TableLayout togalapagos = (TableLayout) findViewById(R.id.galapagos);
        togalapagos.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent togalapagos = new Intent(menu.this, galapagos.class);
                startActivity(togalapagos);
            }
        });

        ImageButton togalapagos2 = (ImageButton) findViewById(R.id.galapagos2);
        togalapagos2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent togalapagos = new Intent(menu.this, galapagos.class);
                startActivity(togalapagos);
            }
        });
    }

}
