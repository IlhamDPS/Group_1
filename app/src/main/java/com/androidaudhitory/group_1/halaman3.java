package com.androidaudhitory.group_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TableLayout;

import com.androidaudhitory.group_1.halaman3content.galapagos;
import com.androidaudhitory.group_1.halaman3content.gunung_kerinci;
import com.androidaudhitory.group_1.halaman3content.tundra;


public class halaman3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman3);

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
                Intent totundra = new Intent(halaman3.this, tundra.class);
                startActivity(totundra);
            }
        });

        ImageButton totundra2 = (ImageButton) findViewById(R.id.tundraimage2);
        totundra2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent totundra2 = new Intent(halaman3.this, tundra.class);
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
                Intent tomountain = new Intent(halaman3.this, gunung_kerinci.class);
                startActivity(tomountain);
            }
        });

        ImageButton tomountain2 = (ImageButton) findViewById(R.id.image22);
        tomountain2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent tomountain = new Intent(halaman3.this, gunung_kerinci.class);
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
                Intent togalapagos = new Intent(halaman3.this, galapagos.class);
                startActivity(togalapagos);
            }
        });

        ImageButton togalapagos2 = (ImageButton) findViewById(R.id.galapagos2);
        togalapagos2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent togalapagos = new Intent(halaman3.this, galapagos.class);
                startActivity(togalapagos);
            }
        });
    }

}
