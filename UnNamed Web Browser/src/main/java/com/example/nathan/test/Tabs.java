package com.example.nathan.test;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tabs extends AppCompatActivity
{

    ArrayList<String> urls = new ArrayList<>();
    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        b0 = findViewById(R.id.urlb0);
        b1 = findViewById(R.id.urlb1);
        b2 = findViewById(R.id.urlb2);
        b3 = findViewById(R.id.urlb3);
        b4 = findViewById(R.id.urlb4);
        b5 = findViewById(R.id.urlb5);
        b6 = findViewById(R.id.urlb6);
        b7 = findViewById(R.id.urlb7);
        b8 = findViewById(R.id.urlb8);
        b9 = findViewById(R.id.urlb9);
        b10 = findViewById(R.id.urlb10);
        b11 = findViewById(R.id.urlb11);
        b12 = findViewById(R.id.urlb12);
        b13 = findViewById(R.id.urlb13);
        b14 = findViewById(R.id.urlb14);



        Bundle extras = getIntent().getExtras();
        if(extras != null)
        {
            urls = extras.getStringArrayList("key");
        }

        String newUrl;


        if(urls.size() > 0)
        {
            b0.setText((String)urls.get(0));
            b0.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 1)
        {
            b1.setText((String)urls.get(1));
            b1.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 2)
        {
            b2.setText((String)urls.get(2));
            b2.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 3)
        {
            b3.setText((String)urls.get(3));
            b3.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 4)
        {
            b4.setText((String)urls.get(4));
            b4.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 5)
        {
            b5.setText((String)urls.get(5));
            b5.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 6)
        {
            b6.setText((String)urls.get(6));
            b6.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 7)
        {
            b7.setText((String)urls.get(7));
            b7.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 8)
        {
            b8.setText((String)urls.get(8));
            b8.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 9)
        {
            b9.setText((String)urls.get(9));
            b9.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 10)
        {
            b10.setText((String)urls.get(10));
            b10.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 11)
        {
            b11.setText((String)urls.get(11));
            b11.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 12)
        {
            b12.setText((String)urls.get(12));
            b12.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 13)
        {
            b13.setText((String)urls.get(13));
            b13.setVisibility(View.VISIBLE);
        }
        if(urls.size() > 14)
        {
            b14.setText((String)urls.get(14));
            b14.setVisibility(View.VISIBLE);
        }



        goToTab();
    }

    private void loadTab(int x)
    {

    }


    @SuppressLint("ClickableViewAccessibility")
    private void goToTab()
    {

        b0.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(0));
                startActivity(intent);
                return true;
            }

        });

        b1.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(1));
                startActivity(intent);
                return true;
            }

        });

        b2.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(2));
                startActivity(intent);
                return true;
            }

        });

        b3.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(3));
                startActivity(intent);
                return true;
            }

        });

        b4.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(4));
                startActivity(intent);
                return true;
            }

        });

        b5.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(5));
                startActivity(intent);
                return true;
            }

        });

        b6.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(6));
                startActivity(intent);
                return true;
            }

        });

        b7.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(7));
                startActivity(intent);
                return true;
            }

        });

        b8.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(8));
                startActivity(intent);
                return true;
            }

        });

        b9.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(9));
                startActivity(intent);
                return true;
            }

        });

        b10.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(10));
                startActivity(intent);
                return true;
            }

        });

        b11.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(11));
                startActivity(intent);
                return true;
            }

        });

        b12.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(12));
                startActivity(intent);
                return true;
            }

        });

        b13.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(13));
                startActivity(intent);
                return true;
            }

        });

        b14.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                Intent intent = new Intent(Tabs.this, MainActivity.class);
                intent.putExtra("key", urls.get(14));
                startActivity(intent);
                return true;
            }

        });







    }

}
